package statki2018;

import java.util.Random;

public class Gra implements Rozgrywka{
	
	protected static Random random = new Random();
	protected Okret[][] plansza = new Okret[100][100];
	
	public Gra() {
		this.inicjalizuj(100, 500, 1000);
	}
	
	public Gra(int liczbaNiszczycieli, int liczbaFregat, int liczbaKorwet) {
		this.inicjalizuj(liczbaNiszczycieli, liczbaFregat, liczbaKorwet);
	}
	
	private void inicjalizuj(int liczbaNiszczycieli, int liczbaFregat, int liczbaKorwet) {
		while(liczbaNiszczycieli > 0) {
			int y = random.nextInt(this.plansza.length);
			int x = random.nextInt(this.plansza[y].length);
			if(this.plansza[y][x] == null) {
				this.plansza[y][x] = new Niszczyciel(x, y, this.plansza);
				liczbaNiszczycieli--;
			}
		}
		while(liczbaFregat > 0) {
			int y = random.nextInt(this.plansza.length);
			int x = random.nextInt(this.plansza[y].length);
			if(this.plansza[y][x] == null) {
				this.plansza[y][x] = new Fregata(x, y, this.plansza);
				liczbaFregat--;
			}
		}
		while(liczbaKorwet > 0) {
			int y = random.nextInt(this.plansza.length);
			int x = random.nextInt(this.plansza[y].length);
			if(this.plansza[y][x] == null) {
				this.plansza[y][x] = new Korweta(x, y, this.plansza);
				liczbaKorwet--;
			}
		}
	}
	
	@Override
	public void graj(int liczbaTur) {
		int obecnaTura = 1;
		while(obecnaTura <= liczbaTur) {
			System.out.println("=====================\nTURA nr "+obecnaTura);
			new Dzialo(this.plansza);
			obecnaTura++;
		}
		
	}
	
	@Override
	public void pokazPlansze() {
		for(int i = 0; i < this.plansza.length; i++) {
			for(int j = 0; j < this.plansza[i].length; j++) {
				if(this.plansza[i][j] instanceof Okret) {
					System.out.print(this.plansza[i][j].getSymbol());
				} else {
					System.out.print("~");
				}
			}
			System.out.println();
		}
		
	}
	
	class Dzialo {
		
		public Dzialo(Okret[][] plansza) {
			for(int i = 0; i < 10; i++) {
				int y = random.nextInt(plansza.length);
				int x = random.nextInt(plansza[y].length);
				if(plansza[y][x] instanceof Okret) {
					plansza[y][x].odstrzal();
				} else {
					System.out.println("PUDLO");
				}
				
				
			}
		}
	}
	
}
