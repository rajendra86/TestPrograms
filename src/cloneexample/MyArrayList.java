package cloneexample;

import java.util.ArrayList;

public class MyArrayList extends ArrayList<Integer> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MyArrayList mylist = new MyArrayList();
		Object obj = mylist.clone();
		System.out.println(obj.getClass());

	}

	public Object clone() {
		System.out.println("In Clone method");
		return super.clone();

	}

}
