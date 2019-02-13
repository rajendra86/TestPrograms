package array_programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ArrayToMap {

	public static void main(String[] args) {
		String[][] strArray = { { "United States", "New York" },
				{ "United Kingdom", "London" }, { "Netherland", "Amsterdam" },
				{ "Japan", "Tokyo" }, { "France", "Paris" } };

		Map<String, String> arrayMap = new HashMap<String, String>();

		for (int i = 0; i < strArray.length; i++) {

			for (int j = 0; j < strArray[i].length; j++) {
				String key = strArray[i][0];
				String value = strArray[i][1];
				arrayMap.put(key, value);
			}
		}
		System.out.println("***Printing Map***");
		Iterator<Map.Entry<String, String>> mapIt = arrayMap.entrySet()
				.iterator();

		while (mapIt.hasNext()) {
			Map.Entry<String, String> entry = mapIt.next();
			System.out.println("Key====> " + entry.getKey());
			System.out.println("Value==>" + entry.getValue());

		}
	}

}
