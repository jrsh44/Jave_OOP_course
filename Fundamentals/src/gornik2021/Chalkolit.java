package gornik2021;

import java.util.Random;

public class Chalkolit extends ObiektKopalniany{
	
	private Random random = new Random();
	
	public int radioaktywnosc;
	public double bazowaWartoscRynkowa;
	
	Chalkolit(double bwr){
		this.bazowaWartoscRynkowa = bwr;
		this.radioaktywnosc = random.nextInt(700,950);
	}

	@Override
	public double getModifiedMarketValue() {
		return this.bazowaWartoscRynkowa;
	}
}
