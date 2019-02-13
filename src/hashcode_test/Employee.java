package hashcode_test;

import java.util.HashMap;
import java.util.Map;

public final class Employee {

	private Integer id;
	private String name;

	public Employee(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		System.out.println("In hashCode()!");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In Equals()!");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public static void main(String[] args) {
		Map<Employee, Integer> map = new HashMap<Employee, Integer>();

		Employee emp1 = new Employee(12, "Ramesh");
		System.out.println("Emp1 " + emp1.hashCode());
		map.put(emp1, 1);
		System.out.println(map);

		// emp1.name = "Umesh";
		// System.out.println(emp1.hashCode());
		//
		// System.out.println(map.get(emp1));

		Employee emp2 = new Employee(124, "Ramesh");
		System.out.println("Emp2 " + emp2.hashCode());
		map.put(emp2, 2);
		System.out.println(map);
		emp1.id = 120;
		System.out.println(map);
		System.out.println("Emp1 " + emp1.hashCode());
		System.out.println(map.get(emp1));

		for (Map.Entry<Employee, Integer> entry : map.entrySet()) {
			System.out.println("Key " + entry.getKey());
			System.out.println("Value " + entry.getValue());
		}

		String s = "xyzabc";
		StringBuilder str = new StringBuilder(s);
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
