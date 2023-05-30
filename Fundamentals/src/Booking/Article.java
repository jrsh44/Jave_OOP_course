package Booking;

public class Article extends Publication {

	private String autor;
	private String title;
	private int year;
	private String journal;
	
	Article(String autor, String title,int year, String journalName){
		this.autor = autor;
		this.title = title;
		this.year = year;
		this.journal = journalName;
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
	
	String journalName() {
		return this.journal;
	}
	
	public String toString() {
		return "Article(autor = "+this.autor()+", title =  "+this.title()+", year = "+this.year()+", journal = "+this.journalName()+")";
		
	}

}
