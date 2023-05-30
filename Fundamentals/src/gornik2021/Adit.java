package gornik2021;

import java.util.Random;

public class Adit{
	private Random random = new Random();
	private int maksymalnyDystans, iloscKorytarzy, dlugoscKorytarzy, dlugoscSzybu;
	protected Object[][] kopalnia;
	private int bwr = 50;
	private Gornik gornik;
	
	Adit(int maksymalnyDystans, int iloscKorytarzy, int dlugoscKorytarzy){
		this.maksymalnyDystans = maksymalnyDystans;
		this.iloscKorytarzy = iloscKorytarzy;
		this.dlugoscKorytarzy = dlugoscKorytarzy;
		this.dlugoscSzybu = (maksymalnyDystans+1)*iloscKorytarzy;
		this.gornik = new Gornik(this);
		this.stworzKopalnie();
		this.pokazKopalnie();
	}
	
	private void stworzKopalnie() {
		int[] cords;
		int idx;
		boolean isTunel;
		double rng;
		
		cords = new int[this.iloscKorytarzy];
			
		for(int i = 0; i < this.iloscKorytarzy; i++) {
			if(i==0) {
				idx = random.nextInt(this.maksymalnyDystans);
			} else {
				idx = random.nextInt(cords[i-1]+1,cords[i-1] + this.maksymalnyDystans+1);
			}
			cords[i] = idx;
		}
		idx = 0;
		this.kopalnia = new Object[this.dlugoscSzybu][this.dlugoscKorytarzy+1];
		for(int i = 0; i < this.kopalnia.length;i++) {
			if(cords[idx] == i) {
				if(idx < cords.length-1) {
					idx++;
				}
				isTunel = true;
			} else {
				isTunel = false;
			}
			for(int j = 0; j<this.kopalnia[i].length; j++) {					
				if(isTunel) {
					if(j==0) {
						this.kopalnia[i][j] = "->";
					} else {
						rng = random.nextDouble();
						if(rng < 0.1) {
							this.kopalnia[i][j] = new Uraninit(bwr);
						} else if(rng < 0.3) {
							this.kopalnia[i][j] = new Chalkolit(bwr);
						} else {
							this.kopalnia[i][j] = new Skala();
						}
					}
					
				} else {
					this.kopalnia[i][j] = null;
					}
				}
			}
	}

	private void pokazKopalnie() {
		for(int i = 0; i < this.kopalnia.length; i++) {
			for(int j = 0; j < this.kopalnia[i].length; j++) {
				if(this.kopalnia[i][j] == null) {
					System.out.print("   ");
				} else if(j==0) {
					System.out.print("-->");
				} else if(this.kopalnia[i][j] instanceof Skala){
					System.out.print(((Skala)this.kopalnia[i][j]).bazowaWartoscRynkowa+" ");
				} else if(this.kopalnia[i][j] instanceof Chalkolit){
					System.out.print(((Chalkolit)this.kopalnia[i][j]).bazowaWartoscRynkowa+" ");
				} else if(this.kopalnia[i][j] instanceof Uraninit){
					System.out.print(((Uraninit)this.kopalnia[i][j]).bazowaWartoscRynkowa+" ");
				}
			}
			System.out.println();
		}
	}

	public void runAdit() {
		this.gornik.goMiner();
		System.out.println(this.gornik.income);
		this.pokazKopalnie();
	}
}
