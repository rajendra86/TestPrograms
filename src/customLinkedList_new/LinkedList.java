package customLinkedList_new;

public class LinkedList {

	private Node head;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	/**
	 * Method to add the node at the end of list
	 * 
	 * @param element
	 */
	public void addNode(Node element) {
		if (head == null) {
			head = element;
		} else {
			Node current = head;
			while (current.next != null)
				current = current.next;

			current.setNext(element);
		}
	}

	/**
	 * Utility method to print the list
	 */
	public void printList() {
		Node current = head;
		if (current != null)
			System.out.print(current.getData() + " ");

		while (current.next != null) {
			current = current.next;
			System.out.print(current.getData() + " ");
		}
	}

	/**
	 * Method to detect loop in a linked list
	 * 
	 * @return true if list has loop false otherwise
	 */
	public boolean detectLoop() {
		Node slow = this.head;
		Node fast = this.head;

		while (fast != null && fast.next != null) {
			slow = slow.next; // 1 hop
			fast = fast.next.next; // 2 hops

			if (slow == fast)
				return true;
		}
		return false;
	}

	/**
	 * Method to find the middle node in the linked list
	 * 
	 * @return middlenode
	 */
	public Node findMiddleNode() {

		if (head == null)
			return null;

		Node current = head;
		Node middle = head;
		System.out.println();
		int count = 0;
		while (current != null) {
			current = current.next;
			if (count % 2 == 1 && current != null) {
				middle = middle.next;
			}
			count++;
		}
		return middle;
	}

	/**
	 * Method to remove duplicates from unsorted list.
	 */

	public void remove_duplicates() {
		Node current = null, current1 = null;
		current = head;

		/* Pick elements one by one */
		while (current != null && current.next != null) {
			current1 = current;

			/* Compare the picked element with rest of the elements */
			while (current1.next != null) {
				/* If duplicate then delete it */
				if (current.getData() == current1.next.getData()) {
					/* sequence of steps is important here */
					current1.next = current1.next.next;
				} else {
					current1 = current1.next;
				}
			}
			current = current.next;
		}
	}

	/**
	 * Method to remove duplicates from SortedList.
	 */
	public void removeDuplicatesFromSortedList() {
		/* Another reference to head */
		Node current = head;

		/* Pointer to store the next pointer of a node to be deleted */
		Node next_next;

		/* do nothing if the list is empty */
		if (head == null)
			return;

		/* Traverse list till the last node */
		while (current.next != null) {

			/* Compare current node with the next node */
			if (current.data == current.next.data) {
				next_next = current.next.next;
				current.next = null;
				current.next = next_next;
			} else
				// advance if no deletion
				current = current.next;
		}
	}

	/**
	 * Method to reverse the list
	 * 
	 * @param Node
	 *            head
	 * @return head of reversed list
	 */

	public Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	/**
	 * Recursive Method to reverse the list
	 */

	public Node recursiveReverse(Node node) {
		//System.out.println("Node== " + node.getData());
		if (node == null || node.next == null) {
			return node;
		}
		//System.out.println("Node.next== " + node.next.getData());
		Node remaining = recursiveReverse(node.next);
		//System.out.println("Remaining== " + remaining.getData());
		//System.out.println("Node== " + node.getData());
		node.next.next = node;
		node.next = null;
		return remaining;
	}

	/**
	 * Method to swap Nodes x and y in linked list by changing links
	 * 
	 * @param x
	 * @param y
	 */
	public void swapNodes(Object x, Object y) {
		// Nothing to do if x and y are same
		if (x == y)
			return;

		// Search for x (keep track of prevX and CurrX)
		Node prevX = null, currX = head;
		while (currX != null && currX.data != x) {
			prevX = currX;
			currX = currX.next;
		}

		// Search for y (keep track of prevY and currY)
		Node prevY = null, currY = head;
		while (currY != null && currY.data != y) {
			prevY = currY;
			currY = currY.next;
		}

		// If either x or y is not present, nothing to do
		if (currX == null || currY == null)
			return;

		// If x is not head of linked list
		if (prevX != null)
			prevX.next = currY;
		else
			// make y the new head
			head = currY;

		// If y is not head of linked list
		if (prevY != null)
			prevY.next = currX;
		else
			// make x the new head
			head = currX;

		// Swap next pointers
		Node temp = currX.next;
		currX.next = currY.next;
		currY.next = temp;
	}

	/**
	 * Method to find Nth node from last
	 * 
	 * @param count
	 *            n
	 * @return Nth node from last
	 */

	public Node GetNthNodeFromLast(int n) {
		Node ptr1 = head;
		Node ptr2 = head;

		for (int i = 0; i < n - 1; i++) {
			if (ptr2 == null)
				return null;
			ptr2 = ptr2.next;
		}

		while (ptr2 != null) {
			ptr2 = ptr2.next;
			ptr1 = ptr1.next;
		}

		return ptr1;
	}

	/**
	 * Method to print Nth node from last
	 * 
	 * @param count
	 *            n
	 */
	public void printNthFromLast(int n) {
		int len = 0;
		Node temp = head;

		// 1) count the number of nodes in Linked List
		while (temp != null) {
			temp = temp.next;
			len++;
		}

		// check if value of n is not more than length of
		// the linked list
		if (len < n)
			return;

		temp = head;

		// 2) get the (n-len+1)th node from the begining
		for (int i = 1; i < len - n + 1; i++)
			temp = temp.next;

		System.out.println(temp.data);
	}

	/**
	 * Method to remove a node given pointer to it. This method doesn't work if
	 * given node is last node.
	 * 
	 * @param Node
	 *            node to be deleted
	 */

	public void removeNode(Node node) {
		Node tmp = node.next;
		node.data = tmp.data;
		node.next = tmp.next;
	}

	/**
	 * Method to merge 2 sorted linked list, returns next of temp head.
	 * 
	 * @param list
	 *            l1
	 * @param list
	 *            l2
	 * @return temp head after merging
	 */

	public Node sortedMerge(LinkedList l1, LinkedList l2) {
		Node head1 = l1.head;
		Node head2 = l2.head;
		Node tempHead = new Node(0);
		Node l = tempHead;

		while (head1 != null && head2 != null) {
			if (head1.getData() <= head2.getData()) {
				l.next = head1;
				head1 = head1.next;
			} else {
				l.next = head2;
				head2 = head2.next;
			}
			l = l.next;
		}
		while (head1 != null) {
			l.next = head1;
			l = l.next;
			head1 = head1.next;
		}

		while (head2 != null) {
			l.next = head2;
			l = l.next;
			head2 = head2.next;
		}
		return tempHead.next;
	}

	/**
	 * This function rotates a linked list counter-clockwise and updates the
	 * head. The function assumes that k is smaller than size of linked list. It
	 * doesn't modify the list if k is greater than or equal to size
	 * 
	 * @param k
	 */
	public void rotate(int k) {
		if (k == 0)
			return;

		// Let us understand the below code for example k = 4
		// and list = 10->20->30->40->50->60.
		Node current = head;

		// current will either point to kth or NULL after this
		// loop. current will point to node 40 in the above example
		int count = 1;
		while (count < k && current != null) {
			current = current.next;
			count++;
		}

		// If current is NULL, k is greater than or equal to count
		// of nodes in linked list. Don't change the list in this case
		if (current == null)
			return;

		// current points to kth node. Store it in a variable.
		// kthNode points to node 40 in the above example
		Node kthNode = current;

		// current will point to last node after this loop
		// current will point to node 60 in the above example
		while (current.next != null)
			current = current.next;

		// Change next of last node to previous head
		// Next of 60 is now changed to node 10
		current.next = head;

		// Change head to (k+1)th node
		// head is now changed to node 50
		head = kthNode.next;

		// change next of kth node to null
		kthNode.next = null;
	}

	/**
	 * This method creates a new list with intersection of 2 lists
	 * 
	 * @return Node head
	 * @param LinkedList
	 *            l1
	 * @param LinkedList
	 *            l2
	 */

	public LinkedList sortedIntersection(LinkedList l1, LinkedList l2) {
		Node l1_head = l1.head;
		Node l2_head = l2.head;

		LinkedList l3 = new LinkedList();
		while (null != l1_head && null != l2_head) {
			if (l1_head.getData() == l2_head.getData()) {
				l3.addNode(new Node(l1_head.getData()));
				l1_head = l1_head.next;
				l2_head = l2_head.next;
			} else if (l1_head.getData() < l2_head.getData()) {
				l1_head = l1_head.next;
			} else {
				l2_head = l2_head.next;
			}
		}
		return l3;
	}

	/**
	 * Iterative method to calculate length of LinkedList.
	 * 
	 * @param list
	 * @return length
	 */

	public int length(LinkedList list) {
		int length = 0;
		Node head = list.head;
		while (head != null) {
			length++;
			head = head.next;
		}
		return length;
	}

	/**
	 * Recursive method to calculate length of LinkedList.
	 * 
	 * @param list
	 * @return length
	 */
	public int recursiveLength(LinkedList list) {
		return recursiveLength(list.head);
	}

	/**
	 * Overloaded method
	 * 
	 * @param head
	 * @return length
	 */
	private int recursiveLength(Node head) {
		if (head == null)
			return 0;
		return 1 + recursiveLength(head.next);
	}

	/**
	 * Method to get Nth node in Linked List
	 * 
	 * @param position
	 *            n
	 * @return node
	 */

	public Node getNthNode(int n) {

		return null;
	}

	/**
	 * Class representing Node
	 */
	public static class Node {
		private Node next;
		private Integer data;

		Node(Integer data) {
			this.data = data;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Integer getData() {
			return this.data;
		}
	}
}
