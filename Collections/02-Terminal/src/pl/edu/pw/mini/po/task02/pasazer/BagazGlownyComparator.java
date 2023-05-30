package pl.edu.pw.mini.po.task02.pasazer;

import java.util.Comparator;

public class BagazGlownyComparator implements Comparator<BagazGlowny> {

	@Override
	public int compare(BagazGlowny o1, BagazGlowny o2) {
		return o1.Id - o2.Id;
	}

}
