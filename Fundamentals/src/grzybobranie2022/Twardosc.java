package grzybobranie2022;

import java.util.Random;

public enum Twardosc {
	TWARDY,
	SREDNIOTWARDY,
	MIEKKI;
	
	private static final Random random = new Random();
	
	public static Twardosc losowa() {
		Twardosc[] twardosci = values();
		return twardosci[random.nextInt(twardosci.length)];
	}
}
