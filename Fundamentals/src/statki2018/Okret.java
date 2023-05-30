package statki2018;

import java.util.Random;

public abstract class Okret {
	
	protected static Random random = new Random();
	
	protected String nazwa;
	protected final int numerOkretu;
	protected int wytrzymalosc;
	protected int liczbaTrafien;
	protected int pozycjaX;
	protected int pozycjaY;
	protected Okret[][] plansza;
	
	protected static int licznikOkretow = 0;
	
	public Okret(int x, int y, Okret[][] plansza) {
		Okret.licznikOkretow++;
		this.numerOkretu = licznikOkretow;
		this.liczbaTrafien = 0;
		this.pozycjaX = x;
		this.pozycjaY = y;
		this.plansza = plansza;
		this.ustawNazwe();
	}
	
	protected abstract void ustawNazwe();
	
	protected char getSymbol() {
		return this.nazwa.charAt(0);
	}

	protected void odstrzal() {
		this.liczbaTrafien++;
		System.out.print("Okret "+this.nazwa+" numer okretu: "+this.numerOkretu+" zostal trafiony");
		if(this.liczbaTrafien == this.wytrzymalosc) {
			System.out.print(" i ZATOPIONY!");
			this.plansza[this.pozycjaY][this.pozycjaX] = null;
		} else {
			this.move();
		}
		System.out.print("\n");
	}
	
	protected void move() {
		Kierunek kierunek = Kierunek.losuj();
		switch(kierunek) {
		case GORA:
			if(this.pozycjaX > 0) {
				if (this.plansza[this.pozycjaY][this.pozycjaX-1] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaX--;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			} else if(this.pozycjaX < this.plansza[this.pozycjaY].length - 1) {
				if (this.plansza[this.pozycjaY][this.pozycjaX+1] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaX++;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			} 
			break;
		case DOL:
			if(this.pozycjaX < this.plansza[this.pozycjaY].length - 1) {
				if (this.plansza[this.pozycjaY][this.pozycjaX+1] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaX++;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			} else if(this.pozycjaX > 0) {
				if (this.plansza[this.pozycjaY][this.pozycjaX-1] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaX--;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			}
			break;
		case LEWO:
			if(this.pozycjaY > 0) {
				if (this.plansza[this.pozycjaY-1][this.pozycjaX] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaY--;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			} else if(this.pozycjaY < this.plansza.length - 1) {
				if (this.plansza[this.pozycjaY+1][this.pozycjaX] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaY++;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			}
			break;
		case PRAWO:
			if(this.pozycjaY < this.plansza.length - 1) {
				if (this.plansza[this.pozycjaY+1][this.pozycjaX] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaY++;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			} else if(this.pozycjaY > 0) {
				if (this.plansza[this.pozycjaY-1][this.pozycjaX] == null) {
					this.plansza[this.pozycjaY][this.pozycjaX] = null;
					this.pozycjaY--;
					this.plansza[this.pozycjaY][this.pozycjaX] = this;
				}
			} 
			break;
		}
	}
}
