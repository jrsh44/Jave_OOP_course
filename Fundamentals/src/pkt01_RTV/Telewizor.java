package pkt01_RTV;

public abstract class Telewizor extends UrzadzenieRTV implements Obrazowanie, Udzwiekowienie{

	protected int przekatna;
	protected RodzajSygnalu rodzajSygnalu;
	protected int odbieranyKanal;
	
	protected Telewizor(int przekatna) {
		super();
		this.przekatna = przekatna;
	}
	
	@Override
	public void wlaczObraz() {
		if(this.wlaczone) {
			System.out.println("Obraz zostal wlaczony");
		} else {
			System.out.println("Urzadzenie jest wylaczone wiec obraz rowniez ;)");
		}
	}

	@Override
	public void wylaczObraz() {	
		if(this.wlaczone) {
			System.out.println("Obraz zostal wylaczony");
		} else {
			System.out.println("Urzadzenie jest wylaczone wiec obraz rowniez ;)");
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

}
