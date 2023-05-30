package grzybobranie2022;

public class MuchomorCesarski extends BezpiecznyMuchomor{

	MuchomorCesarski(){
		this.twardosc = Twardosc.TWARDY;
		this.masaOwocnika = random.nextInt(50, 75);
	}
	
	@Override
	public String toString() {
		return "MuchomorCesarski [twardosc=" + twardosc + ", masaOwocnika=" + masaOwocnika + "]";
	}

}
