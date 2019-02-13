package test1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class A {
	int x;
	public A() {
		x =10;
		System.out.println("Parent");
	}
	public List start() {
		System.out.println("TestA");
		return new ArrayList<String>();
	}

	public void process() {
		System.out.println("In Parent Class");
	}

	// static int[] a;
	// static {
	// a[0] = 2;
	//
	// }

	private Integer i;
	

	public void A1(int y) {
		x = i + y;

	}

	public static void go(int n) {
		// System.out.println("Short ");
	}

	public static void go(short n) {
		// System.out.println("Short1 ");
	}

	public static void main(String[] args) throws Exception {
		// new A().A1(new Integer(0));
		Short y = 6;
		Integer aa = 0;
		go(aa);
		go(y);

		File a = new File("..\\note.log");
		// a.createNewFile();
		if (a.isDirectory()) {
			System.out.println("yes");
		} else if (a.isFile()) {
			System.out.println(a.getCanonicalPath());
		}

		List<String> filterList = null;// = new ArrayList<String>();

		// System.out.println(filterList.size());

		// if (filterList != null && filterList.isEmpty()) {
		// System.out.println("List Empty");
		// }

		try {
			filterList = readFilter();
			System.out.println(filterList.size());
			for (String ss : filterList) {
				System.out.println(ss);
			}
		} catch (Exception e) {
			System.out.println("Exception in main");
		}

		// if (filterList.contains("active")) {
		// System.out.println("Hello Sir " + filterList.size());
		// }
		//

		String s = "Active";
		//
		// if (filterList.contains(s.toLowerCase())) {
		// System.out.println("Contains");
		// }

		int aa1 = 10;
		if (aa1 == 10
				&& ((filterList != null && !filterList
						.contains(s.toLowerCase())) || (filterList == null))) {
			System.out.println("inside");

		}
		
		String aaa= "";
		aaa = "hai";

	}

	private static List<String> readFilter() {
		List<String> filterValueList = null;
		String[] filterValue = null;

		try {
			String filter = "suspended";

			if (filter != null && !filter.isEmpty()) {
				filterValue = filter.split(",");

				filterValueList = new ArrayList<String>();

				for (String filtervalue : filterValue) {
					filterValueList.add(filtervalue.toLowerCase());
				}
			}

		} catch (Exception e) {
			System.out.println("filter is null");
		}
		return filterValueList;
		
	}
}
