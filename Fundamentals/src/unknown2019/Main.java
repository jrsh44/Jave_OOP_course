package unknown2019;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		TabliczkaMnozenia tab = new TabliczkaMnozenia(11);
		tab.printRangeOfValues();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Wprowadz pierwsza liczbe naturalnia dodatnia: ");
		int num1 = scanner.nextInt();
		System.out.print("Wprowadz druga liczbe naturalnia dodatnia: ");
		int num2 = scanner.nextInt();
		int result = tab.calculate(num1, num2);
		System.out.println(result);
		
		System.out.println("Wprowadz trzecia liczbe do porownania z wynikiem: ");
		int num3 = scanner.nextInt();
		System.out.println("Is "+result+" bigger than "+num3+": "+tab.isBigger(result,num3));
		
		User user = new User("Mateusz", "Jarosz", 14);
		System.out.println(user);
		
		User user2 = new User("Mateusz", "Jarosz", 24);
		System.out.println(user2);
		
		Administrator admin = new Administrator("mmmm","MMMM",14);
		System.out.println(admin);
	
				
		
		
	}

}
