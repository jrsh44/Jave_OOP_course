package grzybobranie2022;

public class MuchomorSzarawy extends NiebezpiecznyMuchomor{

	public final int rokOdkrycia = 1783;
	
	public MuchomorSzarawy() {
		this.twardosc = Twardosc.losowa();
		this.masaOwocnika = random.nextInt(25, 75);
		this.toksyny = Toksyny.TRUJACE;
	}
	
	@Override
	public String toString() {
		return "MuchomorSzarawy [rokOdkrycia=" + rokOdkrycia + ", toksyny=" + toksyny + ", twardosc=" + twardosc
				+ ", masaOwocnika=" + masaOwocnika + "]";
	}

	@Override
	public boolean isTrujacy() {
		if(this.toksyny == Toksyny.NIEOBECNE) {
			return false;
		}else {
			return true;
		}
	}

	@Override
	public void ugotuj() {
		this.twardosc = Twardosc.MIEKKI;
		this.toksyny = Toksyny.NIEOBECNE;
		
	}

}
