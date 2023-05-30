package pl.edu.pw.mini.po.task03;

import java.util.HashSet;
import java.util.Set;

import pl.edu.pw.mini.po.task03.pacjent.PacjentKobieta;
import pl.edu.pw.mini.po.task03.tools.MyProcessor;
import pl.edu.pw.mini.po.task03.wyjatki.NieunikalneIdException;

public class Demonstrator {

	public static void main(String[] args) {
		Set<PacjentKobieta> pacjentki = new HashSet<PacjentKobieta>();
		try {
			pacjentki = MyProcessor.getWomanData();
		} catch (NieunikalneIdException e) {
			e.printStackTrace();
		}
		for(PacjentKobieta pacjentka : pacjentki) {
			System.out.println(pacjentka);
		}
		
	}

}
