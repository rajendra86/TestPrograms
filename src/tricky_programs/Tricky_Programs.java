package tricky_programs;

import java.util.HashSet;

public class Tricky_Programs {

	public static void main(String[] args) {
		HashSet<Short> shortSet = new HashSet<Short>();
		for (short i = 0; i < 100; i++) {
			shortSet.add(i);
			shortSet.remove(i - 1);
		}
		System.out.println(shortSet.size());

	}

}
