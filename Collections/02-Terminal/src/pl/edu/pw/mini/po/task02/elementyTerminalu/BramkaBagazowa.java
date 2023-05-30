package pl.edu.pw.mini.po.task02.elementyTerminalu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.edu.pw.mini.po.task02.pasazer.Bagaz;
import pl.edu.pw.mini.po.task02.pasazer.Bilet;

public class BramkaBagazowa implements ObslugaBramkiBagazowej{
	
	protected Map<Bilet, List<Bagaz>> zbiorBagazy = new HashMap<>();
	
	public void zdajBagaz(Bilet bilet, Bagaz bagaz) {
		if(!this.zbiorBagazy.containsKey(bilet)) {
			this.zbiorBagazy.put(bilet, new ArrayList<Bagaz>());
		}
		this.zbiorBagazy.get(bilet).add(bagaz);
	}

}
