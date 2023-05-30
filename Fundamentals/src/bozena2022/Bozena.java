package bozena2022;
import java.util.Random;

public class Bozena implements DestroyMines{
	
	private Random random = new Random();
	private PoleMinowe poleMinowe;
	
	Bozena(PoleMinowe pm){
		this.poleMinowe = pm;
	}
	

	public void destroyMines() {
		int row = random.nextInt(0, this.poleMinowe.pole.length);
		for(int i = 0; i < this.poleMinowe.pole[row].length; i++) {
			if(this.poleMinowe.pole[row][i] instanceof Podloze) {
				this.poleMinowe.pole[row][i].pressMe();
				this.poleMinowe.pole[row][i] = null;
			}
		}
	}
	
	public void destroyMines(PoleMinowe pm) {
		int row = random.nextInt(0, pm.pole.length);
		for(int i = 0; i < pm.pole[row].length; i++) {
			if(pm.pole[row][i] instanceof Podloze) {
				pm.pole[row][i].pressMe();
				pm.pole[row][i] = null;
			}
		}
	}
}




