package gornik2021;

public class Gornik {
	public double income = 0;
	public Adit adit;
	
	Gornik(Adit adit){
		this.adit = adit;
	}
	
	public void goMiner() {
		for(int i = 0; i < this.adit.kopalnia.length; i++) {
			for(int j = 0; j < this.adit.kopalnia[i].length; j++) {
				if(this.adit.kopalnia[i][j] instanceof ObiektKopalniany) {
					income += ((ObiektKopalniany)this.adit.kopalnia[i][j]).getModifiedMarketValue();
					this.adit.kopalnia[i][j] = null;
				}
			}
		}
	}

}
