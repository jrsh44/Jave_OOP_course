package pociag2018;

import java.util.Random;
import java.util.Set;

public class Pasazer {
	
	private static Random random = new Random();
	protected final Bilet bilet;
	protected Set<Bagaz> bagaze;
	
	public Pasazer() {
		this.bilet = new Bilet();
		for(int i = 0; i < Pasazer.random.nextInt(3); i++) {
			this.bagaze.add(new Bagaz(this));
		}
	}
	
	protected void znajdzMiejsce(Wagon wagon) {
		for(Wagon.Przedzial przedzial : wagon.przedzialy) {
			if(przedzial.pasazerowie.size() < przedzial.pojemnoscPrzedzialu) {
				przedzial.pasazerowie.add(this);
				for(Bagaz bagaz : this.bagaze) {
					przedzial.polkaNaBagarze.add(bagaz);
				}
				return;
			}
		}
		wagon.korytarz.pasazerowie.add(this);
		
	}

}
