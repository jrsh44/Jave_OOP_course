package gornik2021;

public class Skala extends ObiektKopalniany{
	public double bazowaWartoscRynkowa = 1;

	@Override
	public double getModifiedMarketValue() {
		return this.bazowaWartoscRynkowa;
	}
}
