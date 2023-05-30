package pl.edu.pw.mini.po.task03.narzedzia;

import java.util.Comparator;

import pl.edu.pw.mini.po.task03.lot.Lot;

public class FlightComparator implements Comparator<Lot> {

	@Override
	public int compare(Lot o1, Lot o2) {
		return o1.getIdLotu().length() - o2.getIdLotu().length();
	}

}
