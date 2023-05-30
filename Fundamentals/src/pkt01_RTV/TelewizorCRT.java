package pkt01_RTV;

public class TelewizorCRT extends Telewizor{

	protected Kolor kolor;
	
	TelewizorCRT(int przekatna, int odbieranyKanal, Kolor kolor){
		super(przekatna);
		this.kolor = kolor;
		this.rodzajSygnalu = RodzajSygnalu.ANALOGOWY;
		this.wybierzZrodlo(odbieranyKanal);
	}

	@Override
	public void wybierzZrodlo(int nrKanalu) {
		this.odbieranyKanal = nrKanalu;
	}
	
	public String toString() {
		return "TelewizorCRT(nazwa = "+this.nazwa+
				", wyprodukowany w roku= "+ String.valueOf(this.dataProdukcji).substring(0,4)+
				", kanal = "+this.odbieranyKanal+
				", przekatna = "+this.przekatna+
				", sygnal = "+this.rodzajSygnalu+
				", odbiornik = "+this.kolor+
				", czy wlaczony?: "+this.wlaczone+")";
	}

}
