package pl.edu.pw.mini.po.task02.pasazer;

import java.util.HashSet;

import pl.edu.pw.mini.po.task02.przedmioty.Przedmiot;
import pl.edu.pw.mini.po.task02.przedmioty.PrzedmiotLegalny;

public class BagazGlowny extends Bagaz {
	
	public BagazGlowny() {
		super();
		this.zawartosc = new HashSet<Przedmiot>();
		for(int i = 0; i < Bagaz.random.nextInt(2,10+1); i++) {
			this.zawartosc.add(new PrzedmiotLegalny());
		}
	}

}
