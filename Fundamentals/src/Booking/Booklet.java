package Booking;

public class Booklet extends Book{

	private boolean published;
	
	Booklet(String autor, String title, int year, int pages, boolean published) throws Exception {
		super(autor, title, year, pages);
		this.published = published;
		if(pages>BOOKLET_PAGE_LIMIT) {
			throw new Exception("Book from this journal can't be that large!");
		}

	}
	
	public boolean ifPublished() {
		return this.published;
	}
}
