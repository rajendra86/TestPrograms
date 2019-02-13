package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	static Map<String, String> region = new HashMap<String, String>();
	static Map<String, Integer> regionwise_call_drop = new HashMap<String, Integer>();

	public static void main(String[] args) {

		if(regionwise_call_drop.isEmpty()){
			regionwise_call_drop.put("South", 0);
			regionwise_call_drop.put("North", 0);
			regionwise_call_drop.put("West", 0);
			regionwise_call_drop.put("East", 0);
		}
		
		for (int i = 0; i < 21; i++) {
			testMethod();
		}
	}

	public static void testMethod() {

	}
}
