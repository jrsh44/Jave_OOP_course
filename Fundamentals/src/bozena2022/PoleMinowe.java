package bozena2022;

import java.util.Random;

public class PoleMinowe {
	
	private Random random = new Random();
	public Podloze[][] pole = new Podloze[100][100];
	
	public PoleMinowe() {
		ustawPole();
	}

	private void ustawPole() {
		for(int i = 0; i<this.pole.length; i++) {
			for(int j = 0; j < this.pole[i].length; j++) {
				if(random.nextDouble() < 0.4) {
					switch(random.nextInt(1,4+1)) {
					case 1:
						this.pole[i][j] = new Trawa();
						break;
					case 2:
						this.pole[i][j] = new Purchawa();
						break;
					case 3:
						this.pole[i][j] = new MinaPrzeciwczolgowa();
						if(random.nextDouble() < 0.9) {
							((Mina) this.pole[i][j]).armMe();
						}
						break;
					case 4:
						this.pole[i][j] = new MinaPrzeciwpiechotna();
						if(random.nextDouble() < 0.9) {
							((Mina) this.pole[i][j]).armMe();
						}
					}
				}else {
					this.pole[i][j] = null;
				}
			}
		}
	}
	
	
}
