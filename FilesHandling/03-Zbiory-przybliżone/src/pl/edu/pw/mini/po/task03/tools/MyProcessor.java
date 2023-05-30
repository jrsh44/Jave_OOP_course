package pl.edu.pw.mini.po.task03.tools;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import pl.edu.pw.mini.po.task03.pacjent.Pacjent;
import pl.edu.pw.mini.po.task03.pacjent.PacjentKobieta;
import pl.edu.pw.mini.po.task03.wyjatki.NieunikalneIdException;

public class MyProcessor {
	
	public static Set<PacjentKobieta> getWomanData() throws NieunikalneIdException{
		Set<PacjentKobieta> pacjentki = new HashSet<PacjentKobieta>();
		Iterator<Pacjent> iterator = MyParser.parsePatients().iterator();
		while(iterator.hasNext()) {
			Pacjent pacjent = iterator.next();
			if(pacjent instanceof PacjentKobieta) {
				pacjentki.add((PacjentKobieta) pacjent);
			}
		}
		return pacjentki;
	}
	
	public static Set<Pacjent> trimData() throws NieunikalneIdException{
		Set<Pacjent> pacjenciTemp = new HashSet<Pacjent>();
		Iterator<Pacjent> iterator = MyParser.parsePatients().iterator();
		while(iterator.hasNext()) {
			Pacjent pacjent = iterator.next();
			if(pacjent.getTemperatura() >= 36.4) {
				pacjenciTemp.add(pacjent);
			}
		}
		return pacjenciTemp;
	}

}
