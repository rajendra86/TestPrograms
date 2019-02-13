package collections;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;

public class TryDequeue implements TryCollections {

	@Override
	public void doOperations() {
		Deque<Integer> stack = new ArrayDeque<Integer>(5);
		stack.add(12);
		printCollection(stack);
		stack.add(15);
		printCollection(stack);
		stack.add(33);
		printCollection(stack);
		stack.add(44);
		printCollection(stack);
		stack.add(66);
		printCollection(stack);		
//		stack.offer(455);
//		printCollection(stack);
		stack.remove();
		printCollection(stack);
		stack.add(999);
		printCollection(stack);
//		stack.offer(888);
//		printCollection(stack);
		stack.remove();
		printCollection(stack);
		stack.poll();
		printCollection(stack);
		
		stack.push(420);
		printCollection(stack);
		stack.pop();
		printCollection(stack);
	}
	
	public void printCollection(Collection<? extends Number> col) {
		System.out.println(col);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TryDequeue().doOperations();

	}

}
