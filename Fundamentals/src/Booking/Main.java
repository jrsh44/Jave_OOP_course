package Booking;

import java.util.Random;

public class Main {

	public static void main(String[] args) throws Exception {
		Random random = new Random();
		
		Book b1 = new Book(String.valueOf(random.nextInt(1,100)),String.valueOf(random.nextInt(1,100)),random.nextInt(1000,2023),random.nextInt(50,500));
		System.out.println(b1);
		
		Book b2 = new Booklet(String.valueOf(random.nextInt(1,100)),String.valueOf(random.nextInt(1,100)),random.nextInt(1000,2023),random.nextInt(50,500), random.nextBoolean());
		System.out.println(b2);
		
		System.out.println(b1.getSummerize());
	}
	
	
	
	

}
