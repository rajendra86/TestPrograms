package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TryHashMap implements TryCollections {

	@Override
	public void doOperations() {
		Map<Integer, String> newMap = new HashMap<Integer, String>();
		newMap.put(5, "Factory");
		newMap.put(2, "AbstractFactory");
		newMap.put(4, "Builder");
		newMap.put(19, "Facade");
		newMap.put(1, "Singleton");
		newMap.put(3, "Prototype");

		 printMapOne(newMap);
		 //printMapTwo(newMap);
		 //printMapThree(newMap);
		 //printMapFour(newMap);

		 
		System.out.println(newMap.containsKey(222) + " " + newMap.get(222));
		
		
	}

	private void printMapOne(Map<Integer, String> map) {
		System.out.println("Method One -- EntrySet ForEach!");

		for (Map.Entry<Integer, String> entry : map.entrySet()) {
			System.out.println("Key=" + entry.getKey() + ",Value="
					+ entry.getValue());
		}
		
	}

	private void printMapTwo(Map<Integer, String> map) {
		System.out.println("\nIn Method -- KeySet ForEach!");

		for (Integer key : map.keySet()) {
			System.out.println("Key=" + key + ",Value=" + map.get(key));
		}
	}

	private void printMapThree(Map<Integer, String> map) {
		System.out.println("\nIn Method -- EntrySet Iterator!");
		Set<Map.Entry<Integer, String>> map1 = map.entrySet();
		Iterator<Entry<Integer, String>> it = map1.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println("Key=" + entry.getKey() + ",Value="
					+ entry.getValue());
		}
	}

	private void printMapFour(Map<Integer, String> map) {
		System.out.println("\nIn Method -- KeySet Iterator!");

		Iterator<Integer> it = map.keySet().iterator();
		Integer key;
		while (it.hasNext()) {
			key = it.next();
			System.out.println("Key=" + key + ",Value=" + map.get(key));
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TryHashMap().doOperations();

		

	}

}
