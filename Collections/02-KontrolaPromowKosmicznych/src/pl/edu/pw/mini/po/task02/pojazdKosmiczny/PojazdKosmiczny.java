package pl.edu.pw.mini.po.task02.pojazdKosmiczny;

import pl.edu.pw.mini.po.task02.wyjatki.WyjatekBrakTlenu;

public interface PojazdKosmiczny {
	
	int getIloscTlenu() throws WyjatekBrakTlenu;
	void zuzycieTlenu(int ileZuzyto);

}
