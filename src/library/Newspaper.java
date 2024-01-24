package library;

public class Newspaper extends Item {

	private String publisher;
	private String title;
	private int pages;
	private int date;

	public Newspaper(String title, int pages, int date) {
		super();
		this.title = title;
		this.pages = pages;
		this.date = date;

	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public int getPages() {
		return pages;
	}

	@Override
	public void setPages(int pages) {
		this.pages = pages;
	}

	@Override
	public int getDate() {
		return date;
	}

	@Override
	public void setDate(int date) {
		this.date = date;
	}

}