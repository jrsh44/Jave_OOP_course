package bozena2022;

public class Main {

	public static void main(String[] args) {
		Bozena bozenka = new Bozena(new PoleMinowe());
		for(int i = 0; i < 50; i++) {
			bozenka.destroyMines();
		}

	}

}
