package pl.edu.pw.mini.po.pkt02.Towar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrefnyTowar extends Towar{
	
	protected final int wartoscCzarnorynkowa;
	
	protected static final List<String> mozliweNazwyTowaru = new ArrayList<String>() {{
		add("bron");
		add("alkoholBezAkcyzy");
		add("bursztyn");
		add("lopatkaWieprzowa");
	}};
	
	protected static final Map<String, List<Integer>> mozliwyTowar = new HashMap<>() {{
		put("bron", new ArrayList<>(Arrays.asList(12000, 15000)));
		put("alkoholBezAkcyzy", new ArrayList<>(Arrays.asList(700, 750, 800)));
		put("bursztyn", new ArrayList<>(Arrays.asList(3500)));
		put("lopatkaWieprzowa", new ArrayList<>(Arrays.asList(1450, 1350)));
	}};
	
	public TrefnyTowar() {
		this.nazwa = TrefnyTowar.mozliweNazwyTowaru.get(random.nextInt(TrefnyTowar.mozliweNazwyTowaru.size()));
		this.wartoscCzarnorynkowa = TrefnyTowar.mozliwyTowar.get(this.nazwa).get(random.nextInt(TrefnyTowar.mozliwyTowar.get(this.nazwa).size()));
	}
	
	public void printMe() {
		System.out.println("Mozliwe nazwy towarow czarnorynkowych: "+ TrefnyTowar.mozliweNazwyTowaru);
	}
}
