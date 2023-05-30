package statki2018;

import java.util.Random;

public enum Kierunek {
	GORA,
	DOL,
	LEWO,
	PRAWO;
	
	private static final Random random = new Random();
	
	public static Kierunek losuj() {
		Kierunek[] kierunki = values();
		return kierunki[random.nextInt(kierunki.length)];
	}
}
