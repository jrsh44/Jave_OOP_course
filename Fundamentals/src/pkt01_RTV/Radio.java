package pkt01_RTV;

public final class Radio extends UrzadzenieRTV implements Udzwiekowienie{

	enum Czestotliwosc{
		DLUGIE,
		SREDNIE,
		KROTKIE,
		UHF
	}
	protected Czestotliwosc czestotliwosc;
	
	public Radio(int dlugoscFali){
		super();
		this.wybierzZrodlo(dlugoscFali);
	}
	
	@Override
	public void wybierzZrodlo(int dlugosc) {
		if(dlugosc >= 1 & dlugosc <= 10) {
			czestotliwosc = Czestotliwosc.UHF;
		} else if(dlugosc > 10 & dlugosc <= 200) {
			czestotliwosc = Czestotliwosc.KROTKIE;
		} else if(dlugosc > 200 & dlugosc <= 1000) {
			czestotliwosc = Czestotliwosc.SREDNIE;
		} else if(dlugosc > 1000 & dlugosc <= 20000) {
			czestotliwosc = Czestotliwosc.DLUGIE;
		} else {
			System.out.println("Podano bledny zakres dlugosci fali [10-20_000]");
		}
		
	}

	@Override
	public void wlaczDzwiek() {
		if(this.wlaczone) {
			System.out.println("Muzyka gra :D");
		} else {
			System.out.println("Przed wlaczenie dzwieku nalezy wlaczyc urzadzenie ;)");
		}
		
	}

	@Override
	public void wylaczDzwiek() {
		if(this.wlaczone) {
			System.out.println("Dzwiek zostal wyciszony");
		} else {
			System.out.println("Sprzet jest wylaczony wiec nie trzeba wylaczac dziwieku ;)");
		}
		
	}
	
 // Chyba nie trzeba w radiu ;/
	public String toString() {
		return "Radio(nazwa = "+this.nazwa+", wyprodukowany w roku= "+String.valueOf(this.dataProdukcji).substring(0,4)+", poziom czestotliwosci = "+this.czestotliwosc+")";
	}



	
	
}
