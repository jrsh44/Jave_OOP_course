package pl.edu.pw.mini.po.task02.pojazdKosmiczny;

import pl.edu.pw.mini.po.task02.wyjatki.WyjatekBiznesowy;
import pl.edu.pw.mini.po.task02.wyjatki.WyjatekTransportu;

public final class PromKosmiczny extends Rakieta {
	
	protected int maxLadownosc;
	protected int zaladowanie;
	
	public PromKosmiczny(int iloscTlenu, int iloscZalogi, String miejscePrzylotu, int maxLadownosc, int zaladowanie) throws WyjatekTransportu {
		super(iloscTlenu, iloscZalogi, miejscePrzylotu);
		if(maxLadownosc * 0.5 > zaladowanie) {
			throw new WyjatekBiznesowy("Dorzuccie wiecej towaru!");
		}
		this.maxLadownosc = maxLadownosc;
		this.zaladowanie = zaladowanie;
	}

	@Override
	public String toString() {
		return "PromKosmiczny [maxLadownosc=" + maxLadownosc + ", zaladowanie=" + zaladowanie + ", iloscTlenu="
				+ iloscTlenu + ", iloscZalogi=" + iloscZalogi + ", miejscePrzylotu=" + miejscePrzylotu
				+ ", dniPozaZiemia=" + dniPozaZiemia + "]";
	}




}
