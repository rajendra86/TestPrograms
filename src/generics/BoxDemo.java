package generics;

import java.util.ArrayList;
import java.util.List;

public class BoxDemo {
	public static <U> void addBox(U u, List<Box<U>> boxes) {
		Box<U> box = new Box<U>();
		box.add(u);
		boxes.add(box);
	}

	public static <U> void outputBoxes(List<Box<U>> boxes) {
		int counter = 0;
		for (Box<U> box : boxes) {
			U boxContents = box.get();
			System.out.println("Box # " + counter + " contains ["
					+ boxContents.toString() + "]");
			counter++;
		}
	}

	public static void main(String[] args) {
		List<Box<Integer>> listOfIntegerBoxes = new ArrayList<Box<Integer>>();
		
		BoxDemo.<Integer> addBox(Integer.valueOf(10), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes);
		BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		BoxDemo.outputBoxes(listOfIntegerBoxes);
	}
}
