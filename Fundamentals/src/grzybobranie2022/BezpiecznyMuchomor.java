package grzybobranie2022;

public abstract class BezpiecznyMuchomor extends Muchomor{

	public boolean isTrujacy() {
		return false;
	}
	
	public void ugotuj() {
		this.twardosc = Twardosc.MIEKKI;
	}
}
