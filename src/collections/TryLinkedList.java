package collections;

import java.util.LinkedList;

public class TryLinkedList implements TryCollections{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TryLinkedList().doOperations();		
		
	}

	@Override
	public void doOperations() {
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("hai");
		llist.add("hello");
		llist.add("how are u?");
		System.out.println(llist);
	}
}
