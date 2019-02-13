package customLinkedList_new;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		LinkedList list2 = new LinkedList();
		LinkedList.Node loopNode = new LinkedList.Node(20);

		LinkedList.Node one = new LinkedList.Node(11);
		LinkedList.Node two = new LinkedList.Node(13);
		LinkedList.Node three = new LinkedList.Node(15);
		LinkedList.Node four = new LinkedList.Node(17);
		LinkedList.Node five = new LinkedList.Node(19);
		LinkedList.Node six = new LinkedList.Node(21);

		list.addNode(one);
		list.addNode(two);
		// list.addNode(loopNode);
		list.addNode(three);
		list.addNode(four);
		// list.addNode(loopNode);
		list.addNode(five);
		list.addNode(six);

		/* ********************************************** */
		System.out.println("----Started-----");
		list.recursiveReverse(list.getHead());

		/* ********************************************** */

		// System.out.println("First list : ");
		// list.printList();

		// Remove the node
		/*
		 * list.removeNode(one); System.out.println("\nNew List:- ");
		 * list.printList();
		 */

		// System.out.println("\nMiddle Element --> "
		// + list.findMiddleNode().getData());
		// System.out.println("\nList has LOOP --> " + list.detectLoop());

		LinkedList.Node l1 = new LinkedList.Node(11);
		LinkedList.Node l2 = new LinkedList.Node(12);
		LinkedList.Node l3 = new LinkedList.Node(13);
		LinkedList.Node l4 = new LinkedList.Node(14);
		LinkedList.Node l5 = new LinkedList.Node(16);
		LinkedList.Node l6 = new LinkedList.Node(18);

		list2.addNode(l1);
		list2.addNode(l2);
		list2.addNode(l3);
		list2.addNode(l4);
		// list2.addNode(l5);
		// list2.addNode(l6);

		// System.out.println("\nSecond list : ");
		// list2.printList();

		/*
		 * System.out.println("\nMerging 2 lists"); LinkedList.Node newhead =
		 * list.sortedMerge(list, list2); while (newhead != null) {
		 * System.out.print(newhead.getData() + " "); newhead =
		 * newhead.getNext(); }
		 */

		System.out.println("\nFirst list : ");
		list.printList();
		System.out.println("\nSecond list : ");
		list2.printList();
		LinkedList list3 = new LinkedList();
		list3 = list3.sortedIntersection(list, list2);
		System.out.println("\nAfter Intersection : ");
		list3.printList();

		System.out.println("\nLength= " + list.length(list) + " : "
				+ list.length(list2) + " : " + list.length(list3));

		System.out.println("Recursive Length= " + list.recursiveLength(list)
				+ " : " + list.recursiveLength(list2) + " : "
				+ list.recursiveLength(list3));
	}
}
