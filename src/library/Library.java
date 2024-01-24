package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private ArrayList<Item> items = new ArrayList<>();
	private List<Person> people = new ArrayList<>();

	public Library() {
		super();

	}

	public void checkOutItem(String title) {
		for (Item item : items) {
			if (item.getTitle().equals(title)) {
				item.setAvailable(false);
				return;
			}
		}
		System.out.println("No item found with title:" + title);

	}

	public void checkOutItem(int id) {
		for (Item item : items) {
			if (item.getId() == (id)) {
				item.setAvailable(true);
				return;
			}
			System.out.println("No item found with id:" + id);
		}

	}

	public void checkInItem(String title) {

		for (Item item : items) {
			if (item.getTitle().equals(title)) {
				item.setAvailable(true);
				return;
			}

			System.out.println("No item found with title:" + title);
		}

	}

	public void checkInItem(int id) {
		for (Item item : items) {
			if (item.getId() == (id)) {
				item.setAvailable(false);
				return;
			}
			System.out.println("No item found with id:" + id);
		}

	}

	public boolean addItem(Item item) {
		return this.items.add(item);
	}

	public boolean removeItem(Item item) {
		return this.items.remove(item);
	}

	public void updateItem(String title, int pages, int date) {
		for (Item i : items) {
			i.setTitle(title);
			return;
		}
	}

	public boolean registerPerson(Person p) {
		return this.people.add(p);

	}

	public void deletePerson(int id) {
		for (Person p : people) {
			if (p.getId() == id) {
				this.people.remove(p);
				return;
			}
		}
		System.out.println("No person withid:" + id);
	}

	public void updatePerson(int id, String name, int age) {
		for (Person p : people) {
			if (p.getId() == id) {
				p.setName(name);
				return;

			}
		}

		System.out.println("No person with id:" + id);
	}

	@Override
	public String toString() {
		return "Library [items=" + items + ", people=" + people + "]";
	}

}
