package library;

public class App {

	public static void main(String[] args) {
		Library lib = new Library();

		lib.registerPerson(new Person("James A"));
		lib.registerPerson(new Person("John B"));
		lib.registerPerson(new Person("Josh C"));
		System.out.println(lib);

		lib.deletePerson(1);
		System.out.println(lib);

		lib.updatePerson(2, "John Brand", 34);
		System.out.println(lib);

		lib.addItem(new Books());
		lib.addItem(new Newspaper("The Royal Connections", 25, 2024 / 01 / 01));
		lib.addItem(new Magazines("Women's Health", 20, 2023 / 01 / 01));
		System.out.println(lib);

		Books mybook = new Books();
		mybook.setTitle("The love Shack by Jane Costello");
		mybook.setPages(222);
		mybook.setDate(2015);

		Newspaper mynewspaper = new Newspaper(null, 0, 0);
		mynewspaper.setTitle("The Royal Connections");
		mynewspaper.setPages(25);
		mynewspaper.setDate(2024 / 01 / 01);

		Magazines mymagazines = new Magazines(null, 0, 0);
		mymagazines.setTitle("Women's Health");
		mymagazines.setPages(20);
		mymagazines.setDate(2023 / 01 / 01);

		System.out.println(mybook);
		System.out.println(mynewspaper);
		System.out.println(mymagazines);

	}

}
