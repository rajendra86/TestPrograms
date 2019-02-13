package test1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collect {

	public static void main(String[] args) {

		Collection<String> col = new ArrayList<String>();
		Set<String> set = new HashSet<String>();
		List<Integer> lis = new ArrayList<Integer>();

		col.add("Hello");
		col.add("hai");
		col.add("How are you");

		set.add("10");
		set.add("9");
		set.add("12");
		set.add("56");

		lis.add(10);
		lis.add(9);
		lis.add(12);
		lis.add(56);

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("1");
		ar.add("2");

		col.addAll(ar);
		// col.retainAll(ar);
		col.removeAll(ar);

		for (String s : set) {
			System.out.println(s);
		}

		System.out.println();

		Iterator<String> it = col.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		// String[] st = col.toArray(new String[0]);
		// System.out.println(st.length);
		// for (int j = 0; j < st.length; j++) {
		// System.out.println(st[j]);
		// }

		System.out.println(col.size());

		for (Integer i : lis) {
			System.out.println(i);
		}
		String[] arg = { "if", "it", "is", "to", "be", "it", "is", "up", "to",
				"me", "to", "delegate" };

		Map<String, Integer> m = new HashMap<String, Integer>();

		for (String a : arg) {
			Integer freq = m.get(a);
			m.put(a, (freq == null) ? 1 : freq + 1);
		}

		System.out.println(m.size() + " distinct words:");
		System.out.println(m);

		Collect c = new Collect();

		System.out.println(col);
		System.out.println(c);
		System.out.println();
		System.out.println(c.toString());
	}
}
