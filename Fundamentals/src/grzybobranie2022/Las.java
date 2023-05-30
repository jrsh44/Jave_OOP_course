package grzybobranie2022;

import java.util.Random;

public class Las {
	
	private Random random = new Random();
	private Muchomor[][] poleGrzybowe;
	
	public Las(int x, int y) {
		x = x <= 0 ? 100 : x;
		y = y <= 0 ? 100 : y;
		poleGrzybowe = new Muchomor[x][y];
		this.rozstawGrzyby();
	}
	
	private void rozstawGrzyby() {
		int bezGrzyba = random.nextInt(this.poleGrzybowe[0].length);
		for(int i = 0; i < this.poleGrzybowe.length; i++) {
			for(int j = 0; j < this.poleGrzybowe[i].length; j++) {
				if(random.nextDouble() < 0.2 & j != bezGrzyba) {
					switch(random.nextInt(4)) {
					case(0):
						this.poleGrzybowe[i][j] = new MuchomorSromotnikowy();
						break;
					case(1):
						this.poleGrzybowe[i][j] = new MuchomorCesarski();
						break;
					case(2):
						this.poleGrzybowe[i][j] = new MuchomorKolczastoglowy();
						break;
					case(3):
						this.poleGrzybowe[i][j] = new MuchomorSzarawy();
						break;
					}
				} else {
					this.poleGrzybowe[i][j] = null;
				}
			}
		}
	}

	public Muchomor zbierzGrzyba() {
		int row = random.nextInt(this.poleGrzybowe.length);
		int col = random.nextInt(this.poleGrzybowe[row].length);
		Muchomor ans = this.poleGrzybowe[row][col];
		this.poleGrzybowe[row][col] = null;
		return ans;
	}
}
