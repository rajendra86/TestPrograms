package customLinkedList;

public class TestCircularLinkedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CircularLinkedList linkedList=new CircularLinkedList();
        //linkedList.insert(66);
        linkedList.insert(55);
        linkedList.insert(44);
        linkedList.insert(33);
        linkedList.insert(22);
        linkedList.insert(11);
        
        linkedList.displayLinkedList();
        linkedList.findCircularOrNot();
        
        System.out.println();
        linkedList.makeLinkedListCircular();
        //linkedList.displayLinkedList();
        linkedList.findCircularOrNot();

	}

}
