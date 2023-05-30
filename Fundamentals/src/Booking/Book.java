package Booking;

import java.util.Random;

public class Book extends Publication implements summerizeBook{
	private Random random = new Random();
	private String autor;
	private String title;
	private int year;
	private int pages;
	final int BOOKLET_PAGE_LIMIT = 250;
	
	Book(String autor, String title,int year, int pages){
		this.autor = autor;
		this.title = title;
		this.year = year;
		this.pages = pages;
	}
	
	@Override
	String autor() {
		return this.autor;
	}

	@Override
	String title() {
		return this.title;
	}

	@Override
	int year() {
		return this.year;
	}
	
	int pages() {
		return this.pages;
		
	}
	
	public String toString() {
		return "Book(autor = "+this.autor()+", title =  "+this.title()+", year = "+this.year()+", pages = "+this.pages()+")";
		
	}

	@Override
	public String getSummerize() {
		String summary = "";
		for(int i=0; i<20; i++) {
			int rand = random.nextInt(52);
			char c =  (rand < 26) ? 'A':'a';
			c = (char) (c + rand%26);
			summary += String.valueOf(c);
		}
		return summary;
	}
}
