package grzybobranie2022;

public class MuchomorSromotnikowy extends NiebezpiecznyMuchomor{

	public MuchomorSromotnikowy() {
		this.twardosc = Twardosc.losowa();
		this.masaOwocnika = random.nextInt(25, 75);
		this.toksyny = this.masaOwocnika < 50 ? Toksyny.ZABOJCZE : Toksyny.WYJATKOWO_ZABOJCZE;
	}
	
	@Override
	public String toString() {
		return "MuchomorSromotnikowy [toksyny=" + toksyny + ", twardosc=" + twardosc + ", masaOwocnika=" + masaOwocnika
				+ "]";
	}

	@Override
	public boolean isTrujacy() {
		return true;
	}

	@Override
	public void ugotuj() {
		this.twardosc = Twardosc.MIEKKI;
	}

}
