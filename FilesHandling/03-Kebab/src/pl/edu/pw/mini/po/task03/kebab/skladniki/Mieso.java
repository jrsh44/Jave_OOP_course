package pl.edu.pw.mini.po.task03.kebab.skladniki;

public enum Mieso {
	KURCZAK,
	WOLOWINA,
	MIX;

	public static Mieso getMieso(String nazwa) {
		switch(nazwa) {
		case("kurczak"):
			return Mieso.KURCZAK;
		case("wolowina"):
			return Mieso.WOLOWINA;
		case("mix"):
			return Mieso.MIX;
		default: 
			return null;
		}
	}
}
