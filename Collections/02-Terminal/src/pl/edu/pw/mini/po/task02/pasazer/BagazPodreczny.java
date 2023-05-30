package pl.edu.pw.mini.po.task02.pasazer;

import java.util.LinkedHashSet;

import pl.edu.pw.mini.po.task02.przedmioty.Kielbasa;
import pl.edu.pw.mini.po.task02.przedmioty.Przedmiot;
import pl.edu.pw.mini.po.task02.przedmioty.PrzedmiotLegalny;
import pl.edu.pw.mini.po.task02.przedmioty.PrzedmiotNielegalny;

public class BagazPodreczny extends Bagaz {
	
	public BagazPodreczny() {
		super();
		this.zawartosc = new LinkedHashSet<Przedmiot>();
		for(int i = 0; i < Bagaz.random.nextInt(2,10+1); i++) {
			switch(Bagaz.random.nextInt(3)) {
			case(0):
				this.zawartosc.add(new PrzedmiotLegalny());
				break;
			case(1):
				this.zawartosc.add(new PrzedmiotNielegalny());
				break;
			case(2):
				this.zawartosc.add(new Kielbasa());
			}
			
		}
	}

}
