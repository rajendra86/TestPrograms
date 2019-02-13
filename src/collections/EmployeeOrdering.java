package collections;

import java.util.Set;
import java.util.TreeSet;

public class EmployeeOrdering implements Comparable<EmployeeOrdering> {

	private String name;
	private int Id;
	private int sal;

	public static void main(String[] argss) {

		EmployeeOrdering emp1 = new EmployeeOrdering();
		EmployeeOrdering emp2 = new EmployeeOrdering();
		EmployeeOrdering emp3 = new EmployeeOrdering();
		EmployeeOrdering emp4 = new EmployeeOrdering();

		emp1.setId(12);
		emp1.setName("John");
		emp1.setSal(5000);

		emp2.setId(13);
		emp2.setName("Mary");
		emp2.setSal(6000);

		emp3.setId(9);
		emp3.setName("Peter");
		emp3.setSal(15000);

		emp4.setId(15);
		emp4.setName("Gavin");
		emp4.setSal(25000);

		Set<EmployeeOrdering> treeset = new TreeSet<EmployeeOrdering>();

		treeset.add(emp1);
		treeset.add(emp2);
		treeset.add(emp3);
		treeset.add(emp4);

		System.out.println(treeset.toString());
	}

	@Override
	public String toString() {
		return "EmployeeOrdering [name=" + name + ", Id=" + Id + ", sal=" + sal
				+ "]";
	}

	@Override
	public int compareTo(EmployeeOrdering o) {
		
		return this.sal - o.sal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}
