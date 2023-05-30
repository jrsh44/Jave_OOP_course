package pl.edu.pw.mini.po.pkt02.Towar;

import java.util.ArrayList;
import java.util.Random;

public class Towar {
	
	protected static Random random = new Random();
	protected String nazwa;
	
	private static final ArrayList<String> mozliweNazwy = new ArrayList<String>() {{
		add("woda");
		add("kanapka");
		add("laptop");
		add("zasilacz");
		add("mysz");
		add("ksiazka");
	}};
	
	public Towar() {
		this.nazwa = Towar.mozliweNazwy.get(random.nextInt(Towar.mozliweNazwy.size()));
	}
	
	
}
