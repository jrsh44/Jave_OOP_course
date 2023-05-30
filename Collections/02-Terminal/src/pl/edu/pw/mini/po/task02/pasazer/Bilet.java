package pl.edu.pw.mini.po.task02.pasazer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Bilet {
	
	protected static Random random = new Random();
	
	protected static List<String> bazaImion = new ArrayList<String>() {/**
		 * 
		 */
		private static final long serialVersionUID = 4717690926878330596L;

	{
		add("Pawel");
		add("Adam");
		add("Krzysztof");
		add("Mateusz");
		add("Krystian");
		add("Wojtek");
		add("Robert");
		add("Norbert");
		add("Wladek");
		add("Arkadiusz");
	}};
	
	protected static List<String> bazaNazwisk = new ArrayList<String>() {/**
		 * 
		 */
		private static final long serialVersionUID = -6592130310959858682L;

	{
		add("Jarosz");
		add("Szczesny");
		add("Lewandowski");
		add("Zielinski");
		add("Florek");
		add("Kaniasty");
		add("Jezierski");
		add("Nowak");
		add("Kowalski");
		add("Lesniewski");
	}};
	
	protected static Map<String, List<String>> bazaImieNazwisko = new HashMap<String, List<String>>();
	
	{
		for(String imie : Bilet.bazaImion) {
			Bilet.bazaImieNazwisko.put(imie, new ArrayList<>(Bilet.bazaNazwisk));
		}
	}

	protected String imie;
	protected String nazwisko;
	protected int numerLoteryjny;
	
	public Bilet() {
		this.numerLoteryjny = Bilet.random.nextInt(1,1000);
		try {
			this.ustawImieNaziwkso();
		} catch (BrakWolnychBiletow e) {
			e.printStackTrace();
		}
	}
	
	private void ustawImieNaziwkso() throws BrakWolnychBiletow {
		if(Bilet.bazaImieNazwisko.keySet().size() == 0) {
			throw new BrakWolnychBiletow();
		}
		int wybor = Bilet.random.nextInt(Bilet.bazaImieNazwisko.keySet().size());
		int counter = 0;
		for(String imie: Bilet.bazaImieNazwisko.keySet()) {
			if(counter == wybor) {
				this.imie = imie;
				this.nazwisko = Bilet.bazaImieNazwisko.get(imie).get(Bilet.random.nextInt(Bilet.bazaImieNazwisko.get(imie).size()));
				Bilet.bazaImieNazwisko.remove(this.imie, this.nazwisko);
				if(Bilet.bazaImieNazwisko.get(imie).isEmpty()) {
					Bilet.bazaImieNazwisko.remove(this.imie);
				}
			} else {
				counter++;
			}
		}
	}

}
