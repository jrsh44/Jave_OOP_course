package bozena2022;

public class Purchawa extends Naturalne{

	Purchawa(){
		this.wysokosc = random.nextDouble(3.5, 7.5);
		this.ekologiczna = random.nextInt(1,3) == 1 ? true : false;
	}
	
	@Override
	public void pressMe() {
		System.out.println("Puffff");
	}

	@Override
	public String toString() {
		return "o";
	}

}
