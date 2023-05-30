package statki2018;

public class Fregata extends Okret{

	protected static int licznikFregat = 0;
	protected int liczbaDzial;
	
	public Fregata(int x, int y, Okret[][] plansza) {
		super(x, y, plansza);
		Fregata.licznikFregat++;
		this.liczbaDzial = random.nextInt(1, 6+1);
		this.wytrzymalosc = 3;
	}

	@Override
	protected void ustawNazwe() {
		this.nazwa = "Fregata_" + String.valueOf(Fregata.licznikFregat);
	}

}
