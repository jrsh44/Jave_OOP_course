package pociag2018;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class Pociag {
	
	private static Random random = new Random();
	
	protected PociagMovement lokomotywa;
	protected KierownikPociagu kierownikPociagu;
	protected Set<Konduktor> konduktorzy;
	protected ArrayList<Wagon> wagony;
	
	
	public Pociag(Peron peron) {
		this.lokomotywa = new Lokomotywa();
		this.kierownikPociagu = new KierownikPociagu();
		this.wagony = new ArrayList<Wagon>();
		
		for(int i = 0; i < Pociag.random.nextInt(5,15+1); i++) {
			this.wagony.add(new Wagon());
		}
		
		this.kierownikPociagu.zaladujPasazerow(peron.pasazerowie, this.wagony);
		
		
	}
	
	
	
}
