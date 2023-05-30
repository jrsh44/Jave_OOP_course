package pl.edu.pw.mini.po.task02.pojazdKosmiczny;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import pl.edu.pw.mini.po.task02.wyjatki.WyjatekBrakTlenu;
import pl.edu.pw.mini.po.task02.wyjatki.WyjatekKolizja;
import pl.edu.pw.mini.po.task02.wyjatki.WyjatekTransportu;
import pl.edu.pw.mini.po.task02.wyjatki.WyjatekUsterka;

public class KomputerKontrolny {
	
	protected static Random random = new Random();

	
	public void main() {
		String[] potencjalneLadowania = {"Ohio", "Londyn", "Merkury-54TA", "Wenus_ad3"};
		Map<Integer, Rakieta> mapaRakiet = new HashMap<Integer, Rakieta>();
		List<Rakieta> listaRakiet = new ArrayList<Rakieta>();
		
		int counter = 0;
		while(counter < 10) {
			try {
				PromKosmiczny stateczek = new PromKosmiczny(
						KomputerKontrolny.random.nextInt(1000,2000),
						KomputerKontrolny.random.nextInt(3,10+1),
						potencjalneLadowania[KomputerKontrolny.random.nextInt(potencjalneLadowania.length)],
						500,
						KomputerKontrolny.random.nextInt(1,500+1));
				mapaRakiet.put(counter, stateczek);
				counter++;
			} catch (WyjatekTransportu e) {
				System.out.println(e.getMessage());
			}
		}
		mapaRakiet.forEach((num, rakieta) -> listaRakiet.add(rakieta));
		
		counter = 1;
		while(listaRakiet.size() > 0) {
			System.out.println("---- DZIEN "+counter+"----");
			List<Rakieta> temp = new ArrayList<Rakieta>();
			temp.addAll(listaRakiet);
			Iterator<Rakieta> iterator = temp.iterator();
			while(iterator.hasNext()) {
				Rakieta rakieta = iterator.next();
				try {
					rakieta.zuzycieTlenu(70);
					rakieta.getIloscTlenu();
					this.losowyWypadek(0.1);
				} catch (WyjatekBrakTlenu e) {
					System.out.println(e.getMessage());
					listaRakiet.remove(rakieta);
				} catch (WyjatekUsterka e) {
					System.out.println(e.getMessage());
				}
				rakieta.kolejnyDzien();
				System.out.println(rakieta);
			}
			counter++;
		}
		
		
	}
	
	public void losowyWypadek(double prawdopodobienstwo) throws WyjatekUsterka {
		if(KomputerKontrolny.random.nextDouble() < prawdopodobienstwo) {
			switch(KomputerKontrolny.random.nextInt(2)) {
			case(0):
				throw new WyjatekKolizja("Zderzenie z Marsjanami, bez paniki");
			case(1):
				throw new WyjatekUsterka("Problem z silnikiem grawitacyjnym, na zwyklym bedziemy leciec 1454 lata....");
			}
		}
	}
	
}
