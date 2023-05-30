package pl.edu.pw.mini.po.task02.elementyTerminalu;

import pl.edu.pw.mini.po.task02.pasazer.Bagaz;
import pl.edu.pw.mini.po.task02.pasazer.Pasazer;

public interface ObslugaBramkiBezpieczenstwa {
	
	boolean skanujBagaz(Pasazer pasazer, Bagaz bagaz) throws KielbasaException;

}
