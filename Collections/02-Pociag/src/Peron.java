package pociag2018;

import java.util.LinkedHashSet;
import java.util.Set;

public class Peron {
	
	protected Set<Pasazer> pasazerowie;
	
	public Peron() {
		this.pasazerowie = new LinkedHashSet<Pasazer>();
		for(int i = 0; i < 500; i++) {
			this.pasazerowie.add(new Pasazer());
		}
	}

}
