package overloading;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import serialization.Employee;

/**
 * Java program to demonstrate some best practice to following while overloading
 * method in Java.This Java program shows a case of confusing method overloading
 * in Java
 * 
 * @author Javin Paul
 */
public class OverloadingTest {
//	public static void testMethod(String s) {
//		System.out.println("hello");
//	}

	public static void testMethod(Integer s) {
		System.out.println("hello 1");
	}
	
	public static void testMethod(Number s) {
		System.out.println("hello 2");
	}
	
	public static void testMethod(Object b) {
		System.out.println("hai");
	}

	public static void main(String args[]) {
		
		testMethod(null);
		ArrayList abc = new ArrayList();
		List bcd = new LinkedList();

		ConfusingOverloading co = new ConfusingOverloading();
		co.hasDuplicates(abc); // should call to ArryList overloaded method
		co.hasDuplicates(bcd); // should call to LinkedList overloaded method
		
		OverloadingTest over = new OverloadingTest();
		//Inner inner = over.new Inner();
		Inner inner = new OverloadingTest.Inner();
		
	}
	
	private static class Inner implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			
			return 0;
		}
		
	}
}

class ConfusingOverloading {

	public boolean hasDuplicates(List collection) {
		System.out.println("overloaded method with Type List ");
		return true;
	}

	public boolean hasDuplicates(ArrayList collection) {
		System.out.println("overloaded method with Type ArrayList ");
		return true;
	}

	public boolean hasDuplicates(LinkedList collection) {
		System.out.println("overloaded method with Type LinkedList ");
		return true;
	}

}
