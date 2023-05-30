package kret2021;

import java.util.Random;

public class Kret implements MoleMotion{

	enum GetunekKreta {
		EUROPAEA,
		CINEREA,
		VELESSIENIS
	}
	
	private Random random = new Random();
	protected GetunekKreta gatunek;
	protected int wartoscOdzywcza = random.nextInt(200, 240);
	protected ObiektyZiemne[][] wZiemi;
	
	
	
	Kret(GetunekKreta gatunekKreta, ObiektyZiemne[][] tablica){
		this.gatunek = gatunekKreta;
		this.wZiemi = tablica;
	}
	
	@Override
	public void goMole() {
		int y = random.nextInt(this.wZiemi.length);
		int x = random.nextInt(this.wZiemi[0].length);
		if(this.wZiemi[y][x] instanceof ObiektyZiemne) {
			this.wartoscOdzywcza += this.wZiemi[y][x].wartoscOdzywcza;
			System.out.println("Mniam! Zjedzone kalorie: "+this.wZiemi[y][x].wartoscOdzywcza+" w lokalizacji ("+x+";"+y+")");
			this.wZiemi[y][x] = null;
			
			
		}else {
			System.out.println("Pusto :(");
		}

	}

	@Override
	public String getNutritionValueOf() {
		return String.valueOf(this.wartoscOdzywcza);
	}

}
