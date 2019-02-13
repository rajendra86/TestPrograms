package collections;

/**
 * Main class to test ArrayListCustom functionality.
 */

public class CustomListApp {
	public static void main(String... a) {
		CustomList<Integer> list = new CustomList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(2);

		list.display();
		System.out.println("\nelement at index " + 1 + " = " + list.get(1));
		System.out.println("element removed from index " + 1 + " = "
				+ list.remove(1));

		System.out
				.println("\nlet's display list again after removal at index 1");

		list.display();

		// list.remove(11); //will throw IndexOutOfBoundsException, because
		// there is no element to remove on index 11.
		// list.get(11); //will throw IndexOutOfBoundsException, because there
		// is no element to get on index 11.

	}
}
