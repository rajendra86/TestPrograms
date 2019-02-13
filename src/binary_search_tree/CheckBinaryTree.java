package binary_search_tree;

public class CheckBinaryTree {
	private Node root;
	private Node prev;

	public CheckBinaryTree() {
		root = null;
	}

	public boolean isBST() {
		prev = null;
		return isBST(root);
	}

	/*
	 * Returns true if given search tree is binary search tree
	 */
	public boolean isBST(Node node) {
		if (node != null) {
			if (!isBST(node.left))
				return false;

			if (prev != null && node.data <= prev.data)
				return false;
			prev = node;
			return isBST(node.right);
		}
		return true;
	}

	/* Method to insert node in BST */
	public void insert(int id) {
		Node newNode = new Node(id);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (id < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	public static void main(String[] args) {

		CheckBinaryTree bst = new CheckBinaryTree();
		/*
		 * Using insert to create BST
		 * 
		 * bst.insert(3); bst.insert(8); bst.insert(1); bst.insert(4);
		 * bst.insert(6); bst.insert(2); bst.insert(10); bst.insert(9);
		 * 
		 * Returns true
		 * 
		 * System.out.println("Is tree a BST--> " + bst.isBST());
		 */

		/*
		 * Manually creating BT
		 */
		bst.root = new Node(6);
		bst.root.left = new Node(3);
		bst.root.left.left = new Node(2);
		bst.root.left.right = new Node(4);
		bst.root.right = new Node(10);
		bst.root.right.left = new Node(6);
		bst.root.right.right = new Node(12);

		System.out.println("Is tree a BST--> " + bst.isBST());

	}
}