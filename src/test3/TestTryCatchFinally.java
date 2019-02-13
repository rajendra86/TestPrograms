package test3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestTryCatchFinally {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String S1= new String("hai");
		String S2=new String("hai");
		System.out.println("S1--> " + S1.hashCode() + " S2--> " + S2.hashCode());
		System.out.println("S1 equals S2? --> " + S1.equals(S2));
		
		System.out.println(strReturn());
		Double d = new Double(2.44);
		List<Integer> ints = Arrays.asList(1, 2, 3);
		List<Number> nums = new ArrayList<Number>();
		nums.add(12);
		nums.add(12.5);
		// nums = ints;
		nums.add(2.30);

		List<Integer> intss = Arrays.asList(1, 2, 3, 4);
		List<? extends Number> numss;
		numss = intss;		
		//numss.add(d);
		
		List<Integer> int1 = Arrays.asList(1, 2, 3, 4, 5);
		
		System.out.println(int1.getClass());
		List<? super Integer> num1;
		num1 = int1;		
		System.out.println(num1.getClass());
		
		List<Integer> no1 = new ArrayList<Integer>();
		
		no1.addAll(int1);
        System.out.println(no1);
        
        
		//listOperate(nums);
	}

	public static void listOperate(List<Number> listr) {
		for (Number ni:listr) {
			System.out.println(ni);
		}
	}

	@SuppressWarnings("finally")
	public static String strReturn() {

		try {
			// throw new Exception();
			return "abc 1";
		} catch (Exception e) {
			return "abc 2";
		} finally {
			return "abc 3";
		}
	}

}
