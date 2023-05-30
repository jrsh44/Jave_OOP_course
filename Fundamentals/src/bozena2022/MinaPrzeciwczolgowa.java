package bozena2022;

public class MinaPrzeciwczolgowa extends Mina{
	
	protected double mmWybuchowego;
	
	MinaPrzeciwczolgowa(){
		super();
		this.ekologiczna = false;
		this.mmWybuchowego = random.nextDouble(1.5, 2.5);
	}

	@Override
	public void pressMe() {
		System.out.println(this.CzyUzbrojona() ? "Kaboom!!!" : "Chrup");
		
	}

	@Override
	public String toString() {
		return "X";
	}

}
