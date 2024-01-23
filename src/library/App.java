package library;

public class App {

	public static void main(String[] args) {

		Books mybook = new Books();
		mybook.setTitle("The love Shack by Jane Costello");
		mybook.setPages(222);
		mybook.setDate(2015);

		Newspaper mynewspaper = new Newspaper();
		mynewspaper.setTitle("The Royal Connections");
		mynewspaper.setPages(25);
		mynewspaper.setDate(2024 / 01 / 01);

		Magazines mymagazines = new Magazines();
		mymagazines.setTitle("Women's Health");
		mymagazines.setPages(20);
		mymagazines.setDate(2023 / 01 / 01);

		System.out.println(mybook);
		System.out.println(mynewspaper);
		System.out.println(mymagazines);

		Library mylibrary = new Library();
		mylibrary.addtoLibrary(mybook);
		mylibrary.addtoLibrary(mynewspaper);
		mylibrary.addtoLibrary(mymagazines);
		System.out.println(mylibrary);

	}
}
