package from_juno;

import java.util.ArrayList;
import java.util.List;

public class ClassA {

	/**
	 * @param args
	 */

	public static void main(String[] args) {

		// testMethod();
throw new NullPointerException();
	}

	public static void testMethod() {
		ClassB obj = new ClassB();
		ClassB obj1 = null;
		obj.setName("Vishal");

		List<ClassB> list = new ArrayList<ClassB>();
		list.add(obj);
		list.add(obj1);

		for (ClassB sub : list) {
			System.out.println(sub.getName());
		}
	}

}
