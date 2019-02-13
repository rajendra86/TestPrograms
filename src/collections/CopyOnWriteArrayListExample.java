package collections;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String args[]) {

		List<String> threadSafeList = new CopyOnWriteArrayList<String>();
		threadSafeList.add("Java");
		threadSafeList.add("J2EE");
		threadSafeList.add("Collection");

		// add, remove operator is not supported by CopyOnWriteArrayList
		// iterator
		Iterator<String> failSafeIterator = threadSafeList.iterator();
		while (failSafeIterator.hasNext()) {
			System.out.printf("Read from CopyOnWriteArrayList : %s %n",
					failSafeIterator.next());
			// failSafeIterator.remove(); // not supported in
			// CopyOnWriteArrayList
			// in Java
		}

		List<String> list = new CopyOnWriteArrayList<String>();// new
																// ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		// get the iterator
		Iterator<String> it = list.iterator();

		while (it.hasNext()) {
			// System.out.println("list is:" + list);
			String str = it.next();
			System.out.println(str);

			// if (str.equals("2"))
			// list.remove("5");
			// if (str.equals("3"))
			// list.add("3 found");
			// // below code don't throw ConcurrentModificationException
			// // because it doesn't change modCount variable of list
			// if (str.equals("4"))
			// list.set(1, "4");
		}

	}
}
