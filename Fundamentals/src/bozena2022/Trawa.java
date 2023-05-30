package bozena2022;

public class Trawa extends Naturalne{

	Trawa(){
		this.wysokosc = random.nextDouble(10.5, 50.5);
		this.ekologiczna = true;
	}
	
	@Override
	public void pressMe() {
		System.out.println("Chrup");
	}

	@Override
	public String toString() {
		return "|";
	}

}
