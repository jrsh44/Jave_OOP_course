package grzybobranie2022;

public class MuchomorKolczastoglowy extends BezpiecznyMuchomor{

	MuchomorKolczastoglowy(){
		this.twardosc = Twardosc.losowa();
		this.masaOwocnika = random.nextInt(25, 50);
	}
	
	@Override
	public String toString() {
		return "MuchomorKolczastoglowy [twardosc=" + twardosc + ", masaOwocnika=" + masaOwocnika + "]";
	}

}
