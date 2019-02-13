package testpassbyvalue;

public class TestPassByValue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// String s1 = new String("Hello Chikkappa!");
		// System.out.println(s1);
		// System.out.println("Hashcode - -> " + s1.hashCode());
		// someMethod(s1);
		// System.out.println(s1);
		// System.out.println("Hashcode - -> " + s1.hashCode());

		Employee emp1 = new Employee();
		emp1.setID(120);
		emp1.setName("Ramesha");

		Employee emp2 = new Employee();
		emp2.setID(140);
		emp2.setName("Umesha");

		System.out.println(emp1.getID() + " " + emp1.getName());
		System.out.println(emp2.getID() + " " + emp2.getName());
		modifyEmployee(emp1, emp2);
		System.out.println(emp1.getID() + " " + emp1.getName());
		System.out.println(emp2.getID() + " " + emp2.getName());
	}

	public static void modifyEmployee(Employee emp1, Employee emp2) {
		emp1.setID(200);
		emp2.setID(300);

		emp1.setName("Ammer");
		emp2.setName("Policea");
	}

	public static void someMethod(String s) {
		System.out.println("Hashcode - Method -> " + s.hashCode());
		s = "Yaaru Chikkappa!";
		System.out.println("Hashcode - Method -> " + s.hashCode());
	}

	public boolean stringTest(String a, String b) {
		return a.equalsIgnoreCase(b);
	}
}

class Employee {
	private int ID;
	private String name;

	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD
	 *            the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
