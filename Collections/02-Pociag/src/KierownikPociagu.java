package pociag2018;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;

public class KierownikPociagu {
	
	protected static Random random = new Random();
	
	public void zaladujPasazerow(Set<Pasazer> pasazerowie, ArrayList<Wagon> wagony) {
		for(Pasazer p : pasazerowie) {
			p.znajdzMiejsce(wagony.get(KierownikPociagu.random.nextInt(wagony.size())));
		}
	}

}
