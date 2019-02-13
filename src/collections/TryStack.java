package collections;

import java.util.Stack;

public class TryStack implements TryCollections {

	@Override
	public void doOperations() {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(12);
		stack.push(20);
		stack.push(40);
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.search(20));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TryStack().doOperations();

	}

}
