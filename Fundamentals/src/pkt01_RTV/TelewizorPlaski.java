package pkt01_RTV;

public class TelewizorPlaski extends Telewizor implements OdbieranieRozszerzone{

	
	
	protected Matryca matryca;
	
	TelewizorPlaski(int przekatna, int nrKanalu, RodzajSygnalu rodzajSygnalu, Matryca matryca ){
		super(przekatna);
		this.odbierzSygnal(rodzajSygnalu);
		this.wybierzZrodlo(nrKanalu);
		this.matryca = matryca;
	}

	@Override
	public void wybierzZrodlo(int zrodlo) {
		if(this.rodzajSygnalu==RodzajSygnalu.CYFROWY) {
			System.out.println("Brak sygnalu analogowego. Kanal ustawiony na 0");
			this.odbieranyKanal=0;
		}else {
			this.odbieranyKanal=zrodlo;
		}
		
	}

	@Override
	public void odbierzSygnal(RodzajSygnalu s) {
		this.rodzajSygnalu = s;
	}
	
	public String toString() {
		return "TelewizorPlaski(nazwa = "+this.nazwa+
				", wyprodukowany w roku= "+ String.valueOf(this.dataProdukcji).substring(0,4)+
				", kanal = "+this.odbieranyKanal+
				", przekatna = "+this.przekatna+
				", sygnal = "+this.rodzajSygnalu+
				", matryca ="+this.matryca+
				", czy wlaczony?: "+this.wlaczone+")";
	}
}
