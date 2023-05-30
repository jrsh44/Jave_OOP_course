package pl.edu.pw.mini.po.task03.narzedzia;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import pl.edu.pw.mini.po.task03.kebab.Kebab;
import pl.edu.pw.mini.po.task03.kebab.KebabNaTalerzu;
import pl.edu.pw.mini.po.task03.kebab.KebabWCiescie;

public class KebabParser {
	
	public static List<Kebab> parseKebab() {
        Scanner scanner = new Scanner(KebabParser.class.getResourceAsStream("/kebaby.txt"), StandardCharsets.UTF_8);
		scanner.useDelimiter("---");
        if(scanner.equals(null)) {
			return null;
		} else {
			List<Kebab> kebaby = new ArrayList<Kebab>();
			while(scanner.hasNextLine()) {
				String rozmiar = scanner.next();
				Kebab kebab;
				if(scanner.hasNextBoolean()) {
					kebab = new KebabWCiescie(
							rozmiar, 
							scanner.nextBoolean(), 
							scanner.next(), 
							scanner.nextInt(), 
							scanner.nextDouble()
							);
				} else {
					kebab = new KebabNaTalerzu(
							rozmiar, 
							scanner.next(), 
							scanner.next(), 
							scanner.nextInt(), 
							scanner.nextBoolean(), 
							scanner.nextDouble()
							);
				}
				kebaby.add(kebab);
				scanner.nextLine();
			}
			scanner.close();
			return kebaby;
		}
	}
	

}
