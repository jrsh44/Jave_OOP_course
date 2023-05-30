package pl.edu.pw.mini.po.task02.elementyTerminalu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import pl.edu.pw.mini.po.task02.pasazer.Bagaz;
import pl.edu.pw.mini.po.task02.pasazer.Pasazer;
import pl.edu.pw.mini.po.task02.przedmioty.Kielbasa;
import pl.edu.pw.mini.po.task02.przedmioty.Przedmiot;
import pl.edu.pw.mini.po.task02.przedmioty.PrzedmiotNielegalny;

public class BramkaBezpieczenstwa implements ObslugaBramkiBezpieczenstwa{
	
	protected Map<Pasazer, List<PrzedmiotNielegalny>> zbiorPrzedmiotow = new HashMap<Pasazer, List<PrzedmiotNielegalny>>();
	
	public boolean skanujBagaz(Pasazer pasazer, Bagaz bagaz) throws KielbasaException {
		for(Przedmiot przedmiot : bagaz.pobierzPrzedmiotyZBagazu()) {
			
			if(przedmiot instanceof Kielbasa) {
				throw new KielbasaException();
			}
			if(przedmiot.getStopienNielegalnosci() > 0) {
				if(!this.zbiorPrzedmiotow.containsKey(pasazer)) {
					this.zbiorPrzedmiotow.put(pasazer, new ArrayList<PrzedmiotNielegalny>());
					return false;
				}
			}
		}
		return true;
		
	}

}
