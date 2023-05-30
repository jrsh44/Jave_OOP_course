package gornik2021;
import java.util.Random;

public class Uraninit extends ObiektKopalniany {
	
	enum Forma{
		URANOFAN,
		TORBEINIT,
		FOUMARIERYT,
	}
	
	private Random random = new Random();
	private Forma choice;
	private int formNumber;

	public final int radioaktywnosc;
	public final Forma forma;
	public double bazowaWartoscRynkowa;
	
	Uraninit(double bwr){
		formNumber = random.nextInt(3);
		if(formNumber == 0) {
			choice = Forma.URANOFAN;
		} else if(formNumber == 1) {
			choice = Forma.TORBEINIT;
		} else {
			choice = Forma.FOUMARIERYT;
		}
		this.forma = choice;
		this.radioaktywnosc = random.nextInt(750,900);
		this.bazowaWartoscRynkowa = bwr;
	}

	@Override
	public double getModifiedMarketValue() {
		if(this.forma == Forma.URANOFAN) {
			return this.bazowaWartoscRynkowa;
		} else if(this.forma == Forma.TORBEINIT) {
			return this.bazowaWartoscRynkowa*1.5;
		} else {
			return this.bazowaWartoscRynkowa*2.5;
		}
	}
}
