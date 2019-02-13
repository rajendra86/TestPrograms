package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class UnmodifiableMapTest {

	public static void main(String[] args) {
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("eBay", 5555);
		Map<String, Integer> map3 = Collections.unmodifiableMap(new HashMap<String, Integer>(map1));

		System.out.println("Map1 = " + map1.entrySet());
		System.out.println("Map3 = " + map3.entrySet());

		map1.put("TCS", 4444);
		System.out.println("Map1 = " + map1.entrySet());
		System.out.println("Map3 = " + map3.entrySet());
		
		//map3.put("TEK", 3333);
		
		
		System.out.println("Map3 = " + map3.get("eBay"));

	}

}

