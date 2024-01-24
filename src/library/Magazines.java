package library;

public class Magazines extends Item {
	private String title;
	private int pages;
	private int date;

	public Magazines(String title, int pages, int date) {
		super();
		this.title = title;
		this.pages = pages;
		this.date = date;
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
