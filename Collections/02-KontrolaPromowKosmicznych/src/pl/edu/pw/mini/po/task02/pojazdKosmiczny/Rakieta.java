package pl.edu.pw.mini.po.task02.pojazdKosmiczny;

import pl.edu.pw.mini.po.task02.wyjatki.WyjatekBrakTlenu;
import pl.edu.pw.mini.po.task02.wyjatki.WyjatekTransportu;

public abstract class Rakieta implements PojazdKosmiczny{

	protected int iloscTlenu;
	protected int iloscZalogi;
	protected String miejscePrzylotu;
	protected int dniPozaZiemia;
	
	public Rakieta(int iloscTlenu, int iloscZalogi, String miejscePrzylotu) throws WyjatekTransportu {
		if(iloscTlenu < 500) {
			throw new WyjatekBrakTlenu("Mamy wyciek tlenu, polecimy, gdy tylko znajdzie się taśma klejąca");
		}
		if(iloscZalogi < 5) {
			throw new WyjatekTransportu("Wczoraj kapitan mial urodziny nie polecimy");
		}
		this.iloscTlenu = iloscTlenu;
		this.iloscZalogi = iloscZalogi;
		this.miejscePrzylotu = miejscePrzylotu;
		this.dniPozaZiemia = 0;
	}

	@Override
	public String toString() {
		return "Rakieta [iloscTlenu=" + iloscTlenu + ", iloscZalogi=" + iloscZalogi + ", miejscePrzylotu="
				+ miejscePrzylotu + ", dniPozaZiemia=" + dniPozaZiemia + "]";
	}

	@Override
	public void zuzycieTlenu(int ileZuzyto) {
		this.iloscTlenu -= ileZuzyto;
	}
	
	@Override
	public int getIloscTlenu() throws WyjatekBrakTlenu{
		if(this.iloscTlenu <= 100) {
			throw new WyjatekBrakTlenu("Rakieta rozpoczęła przyspieszony powrót na Ziemię");
		}
		return this.iloscTlenu;
	}
	
	public void kolejnyDzien() {
		this.dniPozaZiemia++;
	}
	
}
