package kret2021;
import java.util.Random;
import kret2021.Kret.GetunekKreta;

public class Environment {
	
	private Random random = new Random();
	final private int wartoscOdzywczasDzdzownicy = 3;
	protected ObiektyZiemne[][] wZiemi;
	protected MoleMotion kretInterface;
	protected Kret kret;
	
	
	
	Environment( int wysokoscTabeli, int szerokoscTabeli, int iloscLarw, int iloscDzdzownic){
		this.wZiemi = new ObiektyZiemne[wysokoscTabeli][szerokoscTabeli];
		wypelnijGleba();
		umiescLarwy(iloscLarw);
		umiescDzdzownice(iloscDzdzownic);
	}
	
	Environment( int wysokoscTabeli, int szerokoscTabeli, int iloscLarw, int iloscDzdzownic, GetunekKreta gatunekKreta){
		this.wZiemi = new ObiektyZiemne[wysokoscTabeli][szerokoscTabeli];
		this.kret = new Kret(gatunekKreta, this.wZiemi);
		wypelnijGleba();
		umiescLarwy(iloscLarw);
		umiescDzdzownice(iloscDzdzownic);
	}
	
	public void runMole() {
		for(int i = 0; i < 10; i++) {
			this.kret.goMole();
			this.showEnvironment();
		}
		System.out.println(kret.getNutritionValueOf());
	}
	
	private void wypelnijGleba() {
		for(int i = 0; i < this.wZiemi.length; i++) {
			for(int j = 0; j < this.wZiemi[0].length; j++) {
				this.wZiemi[i][j] = new Gleba(0);
			}
		}
	}
	
	private void umiescLarwy(int ile) {
		while(ile!=0) {
			int y = random.nextInt(this.wZiemi.length);
			int x = random.nextInt(this.wZiemi[0].length);
			if(this.wZiemi[y][x] instanceof Gleba) {
				this.wZiemi[y][x] = new Larwa(random.nextInt(3,5));
				ile--;
			}
		}
	}
	
	private void umiescDzdzownice(int ile) {
		while(ile!=0) {
			int y = random.nextInt(this.wZiemi.length);
			int x = random.nextInt(this.wZiemi[0].length);
			if(this.wZiemi[y][x] instanceof Gleba) {
				this.wZiemi[y][x] = new Dzdzownica(this.wartoscOdzywczasDzdzownicy);
				ile--;
			}
		}
	}
	
	public void showEnvironment() {
		for(int i = 0; i < this.wZiemi.length; i++) {
			for(int j = 0; j < this.wZiemi[0].length; j++) {
				if(this.wZiemi[i][j] instanceof Gleba) {
					System.out.print("#\t");
				} else if(this.wZiemi[i][j] instanceof Dzdzownica) {
					System.out.print("{}\t");
				} else if(this.wZiemi[i][j] instanceof Larwa) {
					System.out.print("@\t");
				} else {
					System.out.print(" \t");
				}
			}
			System.out.println("");
		}
	}
}
