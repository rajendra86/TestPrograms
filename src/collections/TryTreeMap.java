package collections;

import java.util.Map;
import java.util.TreeMap;

public class TryTreeMap implements TryCollections {

	@Override
	public void doOperations() {
		TreeMap<String, Integer> tree = new TreeMap<String, Integer>();
		tree.put(null, null);
		tree.put("One", 10);
		tree.put("Two", 20);
		tree.put("Three", 30);
		tree.put("Five", 40);
		System.out.println(tree);

		TreeMap<Employee, Integer> empTree = new TreeMap<Employee, Integer>();
		
		

		Employee e1 = new Employee();
		e1.setId(100);
		e1.setName("Ammer");
		empTree.put(e1, 1000);

		Employee e2 = new Employee();
		e2.setId(200);
		e2.setName("Police");

		empTree.put(e2, 2000);

		System.out.println(empTree);
	}

	public static void main(String[] args) {
		new TryTreeMap().doOperations();

		Map<String, String> M = new TreeMap<String, String>();
		long start = System.currentTimeMillis();
		for (int i = 0; i < 100000; i++) {
			M.put(Integer.toString(i), "foo");
		}
		long end = System.currentTimeMillis();
		System.out.println("Timings ==> " + (end - start));
		
	}

	class Employee implements Comparable<Employee> {
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + "]";
		}

		private int id;
		private String name;

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public int compareTo(Employee o) {
			System.out.println("comapareTo " + this.id + " " + o.id);
			return this.id - o.id;
		}

		@Override
		public int hashCode() {
			System.out.println("In hashCode()!");
			// final int prime = 31;
			// int result = 1;
			// result = prime * result + ((id == 0) ? 0 : id);
			// result = prime * result + ((name == null) ? 0 : name.hashCode());
			// return result;
			return super.hashCode();
		}

	}
}
