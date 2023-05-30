package pl.edu.pw.mini.po.task03.narzedzia;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import pl.edu.pw.mini.po.task03.lot.Lot;
import pl.edu.pw.mini.po.task03.lot.Przylot;

public class FlightsProcessor {
	
	protected List<Lot> allFlights;
	
	public FlightsProcessor(List<Lot> loty) {
		this.allFlights = loty;
	}
	
	public List<Przylot> getExpectedArrivals(){
		List<Przylot> oczekiwanePrzyloty = new ArrayList<Przylot>();
		Iterator<Lot> iterator = this.allFlights.iterator();
		while(iterator.hasNext()) {
			Lot lot = iterator.next();
			if(lot instanceof Przylot) {
				if(!((Przylot) lot).getCzyWyladowal()) {
					oczekiwanePrzyloty.add((Przylot) lot);
				}
			}
		}
		return oczekiwanePrzyloty;
	}
	
	public List<Lot> getFlightsOrdered(){
		List<Lot> lotyPosortowane = new ArrayList<Lot>();
		lotyPosortowane.addAll(this.allFlights);
		lotyPosortowane.sort(new FlightComparator());
		return lotyPosortowane;
	}	

}
