package collections;

import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class TryConcurrentSkipListSet implements TryCollections {

	@Override
	public void doOperations() {

	}

	public static void main(String... args) {
		Set<String> trySet = new ConcurrentSkipListSet<String>();
	}

}
