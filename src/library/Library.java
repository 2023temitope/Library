package library;

import java.util.ArrayList;

public class Library {
	private ArrayList<Item> items = new ArrayList<>();

	public Library() {
		super();
	}

	public void addtoLibrary(Item title) {
		items.add(title);
	}

	public boolean removebyId(int id) {
		for (Item item : items) {
			if (item.getId() == id) {
				this.items.remove(item);
				return true;

			}

		}
		return false;

	}

}
