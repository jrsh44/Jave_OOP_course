package pl.edu.pw.mini.po.task03.kebab.skladniki;

public enum Dodatek {
	RYZ,
	KASZA,
	FRYTKI;
	
	public static Dodatek getDodatek(String nazwa) {
		switch(nazwa) {
		case("ryz"):
			return Dodatek.RYZ;
		case("kasza"):
			return Dodatek.KASZA;
		case("frytki"):
			return Dodatek.FRYTKI;
		default: 
			return null;
		}
	}

}
