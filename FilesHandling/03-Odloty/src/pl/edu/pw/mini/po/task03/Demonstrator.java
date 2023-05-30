package pl.edu.pw.mini.po.task03;

import pl.edu.pw.mini.po.task03.lot.Lot;
import pl.edu.pw.mini.po.task03.narzedzia.FlightsPraser;
import pl.edu.pw.mini.po.task03.narzedzia.FlightsProcessor;
import pl.edu.pw.mini.po.task03.narzedzia.wyjatki.CheckInException;

public class Demonstrator {

	public static void main(String[] args) {
		try {
			FlightsProcessor fp = new FlightsProcessor(FlightsPraser.parseFlights("/loty.txt"));
			System.out.println("=============================");
			for(Lot lot : fp.getExpectedArrivals()) {
				System.out.println(lot);
			}
			System.out.println("=============================");
			for(Lot lot : fp.getFlightsOrdered()) {
				System.out.println(lot);
			}
			
		} catch (CheckInException e) {
			e.printStackTrace();
		}
		
	}

}
