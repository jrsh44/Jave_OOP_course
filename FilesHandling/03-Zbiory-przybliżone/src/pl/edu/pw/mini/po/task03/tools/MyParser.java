package pl.edu.pw.mini.po.task03.tools;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import pl.edu.pw.mini.po.task03.pacjent.Pacjent;
import pl.edu.pw.mini.po.task03.pacjent.PacjentKobieta;
import pl.edu.pw.mini.po.task03.pacjent.PacjentMezczyzna;
import pl.edu.pw.mini.po.task03.wyjatki.NieunikalneIdException;

public class MyParser {
	
	public static Set<Pacjent> parsePatients() throws NieunikalneIdException{
		Scanner scanner = new Scanner(MyParser.class.getResourceAsStream("/pacjenci_bad.txt"));
		if(scanner.equals(null)) {
			return null;
		} else {
			Set<Pacjent> pacjenci = new HashSet<Pacjent>();
			Set<Integer> usedId = new HashSet<Integer>();
			scanner.useDelimiter("#");
			while(scanner.hasNextLine()) {
				int id = scanner.nextInt();
				if(usedId.contains(id)) {
					throw new NieunikalneIdException();
				}
				usedId.add(id);
				Pacjent pacjent;
				switch(scanner.next()) {
				case("M"):
					pacjent = new PacjentMezczyzna(
							id,
							scanner.nextInt(),
							scanner.nextDouble(),
							scanner.nextBoolean(),
							scanner.nextBoolean(),
							scanner.nextBoolean()
							);
					break;
				default:
					pacjent = new PacjentKobieta(
							id, 
							scanner.nextInt(), 
							scanner.nextDouble(), 
							scanner.nextBoolean(), 
							scanner.next(), 
							scanner.nextBoolean()
							);
				}
				scanner.nextLine();
				pacjenci.add(pacjent);
			}
			scanner.close();
			return pacjenci;
		}
	}

}
