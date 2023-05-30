package pl.edu.pw.mini.po.task02.elementyTerminalu;

import pl.edu.pw.mini.po.task02.pasazer.BagazGlowny;
import pl.edu.pw.mini.po.task02.pasazer.Pasazer;

public class OperatorBramkiBagazowej{

	protected ObslugaBramkiBagazowej bramkaBagazowa;
	
	public OperatorBramkiBagazowej(BramkaBagazowa bb) {
		this.bramkaBagazowa = bb;
	}
	
	public void pobierzBagaze(Pasazer pasazer) {
		for(BagazGlowny bagaz : pasazer.oddajBagazeGlowne()) {
			System.out.println("Zdaje bagaz: "+bagaz);
			this.bramkaBagazowa.zdajBagaz(pasazer.pokazBilet(), bagaz);
		}
	}
}
