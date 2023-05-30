package pociag2018;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class Wagon {
	
	private static Random random = new Random();
	
	protected Korytarz korytarz;
	protected ArrayList<Przedzial> przedzialy;
	private final int pojemnoscPrzedzialu;
	private final int iloscPrzedzialow;
	
	public Wagon() {
		this.pojemnoscPrzedzialu = random.nextInt(6,8+1);
		this.iloscPrzedzialow = random.nextInt(6,10+1);
		
		for(int i = 0; i < iloscPrzedzialow; i++) {
			this.przedzialy.add(new Przedzial(this.pojemnoscPrzedzialu));
		}
	}
	
	public int ilePasazerow() {
		int ans = 0;
		for(Przedzial p : przedzialy) {
				ans += p.pasazerowie.size();
		}
		return ans;
	}
	
	public int ileBagazy() {
		int ans = 0;
		for(Przedzial p : przedzialy) {
			ans += p.polkaNaBagarze.size();
		}
		return ans;
	}
	
	public class Przedzial {
		
		
		protected ArrayList<Pasazer> pasazerowie;
		protected Stack<Bagaz> polkaNaBagarze;
		protected final int pojemnoscPrzedzialu;

		
		public Przedzial(int pojemnoscPrzedzialu) {
			this.pojemnoscPrzedzialu = pojemnoscPrzedzialu;
			this.polkaNaBagarze = new Stack<Bagaz>();
		}
	}
}
