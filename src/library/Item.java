package library;

import java.util.Objects;

public class Item {
	public static int count = 0;
	private int id;
	private String title;
	private int pages;
	private int date;

//constructors
	public Item() {
		super();
		this.id = count++;
	}

	public Item(String title, int pages, int date) {
		super();
		this.id = count++;
		this.title = title;
		this.pages = pages;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

//	public void print() {
//		System.out.println("TITLE:" + this.getTitle());
//	}

	@Override
	public int hashCode() {
		return Objects.hash(title, pages, date);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return false;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", title=" + title + ", pages=" + pages + ", date=" + date + "]";
	}

}
