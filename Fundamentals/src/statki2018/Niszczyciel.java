package statki2018;

public class Niszczyciel extends Okret{

	protected static int licznikNiszczycieli = 0;
	protected int liczbaRakiet;
	
	public Niszczyciel(int x, int y, Okret[][] plansza) {
		super(x, y, plansza);
		Niszczyciel.licznikNiszczycieli++;
		this.liczbaRakiet = random.nextInt(1, 20+1);
		this.wytrzymalosc = 5;
	}
	
	@Override
	protected void ustawNazwe() {
		this.nazwa = "Niszczyciel_" + String.valueOf(Niszczyciel.licznikNiszczycieli);
	}
}
