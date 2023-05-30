package bozena2022;

public abstract class Mina extends Podloze{

	private static int seria;
	protected int identyfikatorMiny;
	private boolean czyUzbrojona = false;
	
	Mina() {
		Mina.seria++;
		this.identyfikatorMiny = Mina.seria * 10;
	}
	
	protected void armMe() {
		this.czyUzbrojona = true;
	}

	public boolean CzyUzbrojona() {
		return czyUzbrojona;
	}
	
	
	

}
