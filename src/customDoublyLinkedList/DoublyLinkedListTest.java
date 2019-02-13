package customDoublyLinkedList;

public class DoublyLinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DoublyLinkedList<String> dList = new DoublyLinkedList<String>();
		DoublyLinkedList.Node<String> node = new DoublyLinkedList.Node<String>("Suzuki");
		
		dList.add(node);
	}

}
