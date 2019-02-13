package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class CHMTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String, String> chm = new ConcurrentHashMap<String, String>();

		chm.put("HTC", "M8");
		chm.put("Sony", "Z3");
		chm.put("Moto", "G3");
		chm.put("Apple", "Iphone6");

		for (String value : chm.values()) {
			System.out.println(value);
		}

		Iterator<Entry<String, String>> it = chm.entrySet().iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			chm.put("HTC", "Iphone");
		}

	}

}
