package garbage_collection_test;

public class Person {

	private Address add;

	public static void main(String[] args) {
		Person person1 = new Person();
		Person person2 = new Person();

		Address add = new Address("5th Cross", 560078, "No 420");
		person1.setAdd(add);
		person2.setAdd(add);

		add = null;
		System.out.println(add);
		System.out.println("Person Address= " + person1.getAdd());
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
}
