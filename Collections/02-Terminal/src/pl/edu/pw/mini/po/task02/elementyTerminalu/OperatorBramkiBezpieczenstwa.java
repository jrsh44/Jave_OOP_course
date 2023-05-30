package pl.edu.pw.mini.po.task02.elementyTerminalu;

import pl.edu.pw.mini.po.task02.pasazer.BagazPodreczny;
import pl.edu.pw.mini.po.task02.pasazer.Pasazer;

public class OperatorBramkiBezpieczenstwa{

	protected ObslugaBramkiBezpieczenstwa bramkaBezpieczenstwa;
	
	public OperatorBramkiBezpieczenstwa(BramkaBezpieczenstwa bb){
		this.bramkaBezpieczenstwa = bb;
	}
	
	public void sprawdzPasazera(Pasazer pasazer) {
		for(BagazPodreczny bagaz : pasazer.getBagazePodreczne()) {
			try {
				System.out.println("Skanuje bagaz: "+ bagaz);
				if(!this.bramkaBezpieczenstwa.skanujBagaz(pasazer, bagaz)) {
					pasazer.usunBagazPodreczny(bagaz);
				}
			} catch (KielbasaException e) {
				System.out.println("Kielbasie mowimy stanowcze nie!!!");
			}
		}
	}
}
