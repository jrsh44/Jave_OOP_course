package pl.edu.pw.mini.po.task03.kebab.skladniki;

public enum Rozmiar {
	S,
	M,
	L;
	
	public static Rozmiar getRozmiar(String nazwa) {
		switch(nazwa) {
		case("S"):
			return Rozmiar.S;
		case("M"):
			return Rozmiar.M;
		case("L"):
			return Rozmiar.L;
		default: 
			return null;
		}
	}

}
