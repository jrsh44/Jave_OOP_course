package pl.edu.pw.mini.po.task03.narzedzia;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.edu.pw.mini.po.task03.lot.Lot;
import pl.edu.pw.mini.po.task03.lot.Odlot;
import pl.edu.pw.mini.po.task03.lot.Przylot;
import pl.edu.pw.mini.po.task03.narzedzia.wyjatki.CheckInException;

public class FlightsPraser {

	public static List<Lot> parseFlights(String filePath) throws CheckInException{
		Scanner scanner = new Scanner(FlightsPraser.class.getResourceAsStream(filePath), StandardCharsets.UTF_8);
		if(scanner.equals(null)) {
			scanner.close();
			return null;
		} else {
			List<Lot> loty = new ArrayList<Lot>();
			scanner.useDelimiter("###");
			while(scanner.hasNextLine()) {
				Lot lot;
				switch(scanner.next()) {
				case("O"):
					lot = new Odlot(
							scanner.next(), 
							scanner.next(), 
							scanner.next(), 
							scanner.next(), 
							scanner.next(), 
							FlightsPraser.getCheckIn(scanner.next()));
					break;
				default:
					lot = new Przylot(
							scanner.next(), 
							scanner.next(), 
							scanner.next(), 
							scanner.next(), 
							scanner.nextBoolean(), 
							scanner.nextInt()
							);
					break;
				}
				scanner.nextLine();
				System.out.println(lot);
				loty.add(lot);
			}
			scanner.close();
			return loty;
		}
	}
	
	private static int[] getCheckIn(String checkIn) throws CheckInException {
		Scanner scannerCheckIn = new Scanner(checkIn);
		scannerCheckIn.useDelimiter("-");
		if(scannerCheckIn.equals(null)) {
			scannerCheckIn.close();
			return null;
		} else {
			int start = scannerCheckIn.nextInt();
			int end = scannerCheckIn.nextInt();
			scannerCheckIn.close();
			if(start <= end) {
				int[] ans = {start, end};
				return ans;
			} else {
				throw new CheckInException();
			}
		}
	}
	
}
