package library;

public abstract class Item implements Comparable<Item> {
	public static int count = 0;
	private int id;
	private String title;
	private int pages;
	private int date;
	private String name;
	private boolean available = true;

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

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	@Override
	public int compareTo(Item o) {
		if (id < o.id) {
			return -1;
		} else if (id > o.id) {
			return +1;
		} else {
			return 0;

		}
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
