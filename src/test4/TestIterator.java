package test4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestIterator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		list1.add("Hello");
		Set<String> possibleAction = new HashSet<String>();
		possibleAction.add("Hello");
		/*Iterator<String> it = list1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		for (Iterator<String> it = possibleAction.iterator();it.hasNext();) {
			//System.out.println(it.next());
			
			if(possibleAction.contains(it.next())){
				System.out.println("Element Present");
			}
		}

	}

}
