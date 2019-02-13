package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class TryArrayList implements TryCollections {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TryArrayList().doOperations();

	}

	@Override
	public void doOperations() {
		ArrayList<String> alist = new ArrayList<String>();

		CopyOnWriteArrayList<String> clist = new CopyOnWriteArrayList<String>();
		
		alist.add("a");
		alist.add("b");
		alist.add("c");
		alist.add("d");
		System.out.println(alist);
		alist.set(2, "D");
		alist.add(null);
		
		System.out.println(alist);
		
		
		Iterator<String> lit = alist.iterator();

		while (lit.hasNext()) {
			System.out.println("Lit " + lit.next());

			// alist.remove(1); //ConcurrentModificationException

		}
		System.out.println(alist.size());

		alist.add("g");
		ListIterator<String> lit1 = alist.listIterator();
		System.out.println(lit1.next());

		// String[] sa = new String[alist.size()];
		// alist.toArray(sa);
		// for (String i : sa) {
		// System.out.print(i + " ");
		// }
		//
		// clist.addAll(alist);
		//
		// ListIterator<String> lit = alist.listIterator();
		// System.out.println(alist);
		// lit.add("z");
		// System.out.println(alist);
		// System.out.println(lit.next());
		// lit.set("f");
		// // lit.add("f");
		// System.out.println(alist);
		//
		// Iterator<String> it = clist.iterator();
		// while (it.hasNext()) {
		// // System.out.println(clist);
		// String s = it.next();
		// // System.out.println(s);
		// if (s.equalsIgnoreCase("c")) {
		// clist.add("g");
		// }
		//
		// }

	}

}
