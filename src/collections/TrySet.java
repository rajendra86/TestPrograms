package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TrySet implements TryCollections {

	@Override
	public void doOperations() {

		Set<Integer> newset = new HashSet<Integer>();
		newset.add(11);
		newset.add(16);
		newset.add(11);
		newset.add(77);
		System.out.println("Newset== " + newset);
		
		// List<Integer> intlist = new ArrayList<Integer>();
		// intlist.add(20);
		// intlist.add(11);
		// intlist.add(10);
		// intlist.add(11);
		//
		// newset.addAll(intlist);
		// System.out.println("Newset + intlist== " + newset);
		//
		// Set<Integer> sorted = new TreeSet<Integer>();
		// sorted.addAll(intlist);
		//
		// System.out.println("Sorted== " + sorted);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TrySet().doOperations();

		Set<Employee> newSet = new HashSet<Employee>();
		newSet.add(null);

		newSet.add(new Employee("Ankit"));

		System.out.println("\nNewset" + newSet);

		Set<Integer> treeSet = new TreeSet<Integer>();

		treeSet.add(10);
		treeSet.add(9);
		treeSet.add(101);
		treeSet.add(3);

		System.out.println(treeSet);

		Set<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(10);
		hashSet.add(9);
		hashSet.add(101);
		hashSet.add(3);

		System.out.println(hashSet);

		for (Iterator<Integer> it = treeSet.iterator(); it.hasNext();) {
			Integer integer = (Integer) it.next();
			System.out.println(integer);

		}
	}
}

class Employee {
	Employee(String name) {
		this.name = name;
	}

	private String name;

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
