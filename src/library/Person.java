package library;

public class Person implements Comparable<Person> {
	public static int count;
	private int id = count++;
	private String name;
	private int age;

	// constructors
	public Person(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String setName() {
		return name;

	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", getName()=" + getName() + ", setName()="
				+ setName() + ", getId()=" + getId() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public int compareTo(Person o) {
		if (id < o.id) {
			return -1;
		} else if (id > o.id) {
			return +1;
		} else {
			return 0;
		}
	}

	public void setName(String name2) {
		// TODO Auto-generated method stub

	}

}
