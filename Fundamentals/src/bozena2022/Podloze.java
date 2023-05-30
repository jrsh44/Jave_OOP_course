package bozena2022;
import java.util.Random;

public abstract class Podloze {
	
	protected Random random = new Random();
	protected boolean ekologiczna;
	
	public abstract void pressMe();
	
	public abstract String toString();
}
