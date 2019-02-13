package customDoublyLinkedList;

public class DoublyLinkedList<E> {
	private Node<E> head;

	static class Node<E> {
		private Node<E> next;
		private Node<E> previous;
		private E element;

		Node(E element) {
			this.setElement(element);
		}

		public Node<E> getNext() {
			return next;
		}

		public Node<E> getPrevious() {
			return previous;
		}

		public E getElement() {
			return element;
		}

		public void setElement(E element) {
			this.element = element;
		}

	}

	public void add(Node<E> node) {
		Node<E> current;

		if (head == null) {
			head = node;
		} else {
			current = head;

			while (current.getNext() != null)
				current = current.getNext();

			node.previous = current;
			current.next = node;
		}
	}

	public void printList() {

	}
}
