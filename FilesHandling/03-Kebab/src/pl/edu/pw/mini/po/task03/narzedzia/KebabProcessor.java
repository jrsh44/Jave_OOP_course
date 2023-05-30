package pl.edu.pw.mini.po.task03.narzedzia;

import java.util.ArrayList;
import java.util.List;

import pl.edu.pw.mini.po.task03.kebab.Kebab;
import pl.edu.pw.mini.po.task03.kebab.KebabNaTalerzu;
import pl.edu.pw.mini.po.task03.kebab.skladniki.Rozmiar;

public class KebabProcessor {
	
	public static List<KebabNaTalerzu> getSmallTellerKebabs(){
		List<Kebab> kebaby = KebabParser.parseKebab();
		List<KebabNaTalerzu> kebabyNaTalerzu = new ArrayList<KebabNaTalerzu>();
		for(Kebab kebab : kebaby) {
			if(kebab instanceof KebabNaTalerzu) {
				if(!kebab.getRozmiar().equals(Rozmiar.S)) {
					kebabyNaTalerzu.add((KebabNaTalerzu) kebab);
				}
			}
		}
		return kebabyNaTalerzu;
	}
	
	
	public static void getSummary() {
		List<Kebab> kebaby = KebabParser.parseKebab();
		int lacznaWaga = 0;
		double sredniaCena = 0;
		for(Kebab kebab : kebaby) {
			System.out.println(kebab);
			lacznaWaga += kebab.getWaga();
			sredniaCena += kebab.getCena();
		}
		System.out.println("==========\nLaczna waga: " + lacznaWaga);
		System.out.println("Srednia cena: " + (sredniaCena/kebaby.size()));
	}

}
