package collections;

import java.util.Hashtable;

public class TryHashTable implements TryCollections {

	@Override
	public void doOperations() {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(50, "Effective Java");
		table.put(63, "Java");
		
		table.elements();
		System.out.println(table);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TryHashTable().doOperations();

	}

}
