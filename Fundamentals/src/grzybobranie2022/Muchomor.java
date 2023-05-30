package grzybobranie2022;
import java.util.Random;

public abstract class Muchomor {
	
	protected Random random = new Random();
	protected Twardosc twardosc;
	protected int masaOwocnika;
	
	public abstract String toString();
	public abstract boolean isTrujacy();
	public abstract void ugotuj();
}
