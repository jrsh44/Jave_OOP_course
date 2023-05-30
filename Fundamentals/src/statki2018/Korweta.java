package statki2018;

public class Korweta extends Okret{
	
	protected static int licznikKorwet = 0;
	protected int liczbaBomb;

	public Korweta(int x, int y, Okret[][] plansza) {
		super(x, y, plansza);
		Korweta.licznikKorwet++;
		this.liczbaBomb = random.nextInt(1, 4+1);
		this.wytrzymalosc = 1;
	}

	@Override
	protected void ustawNazwe() {
		this.nazwa = "Korwet_" + String.valueOf(Korweta.licznikKorwet);
	}

}
