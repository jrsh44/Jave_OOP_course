package bozena2022;

public class MinaPrzeciwpiechotna extends Mina {

	public final Obudowa obudowa;
	
	MinaPrzeciwpiechotna() {
		super();
		this.obudowa = this.ustawObudowe();
		this.ekologiczna = this.obudowa == Obudowa.KARTON ? true : false;
	}
	
	private Obudowa ustawObudowe() {
		int a = random.nextInt(1,4);
		if(a == 1) {
			return Obudowa.KARTON;
		} else if(a == 2) {
			return Obudowa.METAL;
		} else {
			return Obudowa.PLASTYK;
		}
	}

	@Override
	public void pressMe() {
		System.out.println(this.CzyUzbrojona() ? "Boom!" : "Chrup");
	}

	@Override
	public String toString() {
		return "x";
	}
}
