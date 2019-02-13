package com.ge.test;

public class TestClass {

	public void someMethod(Number n) {
		System.out.println("One");
	}

	public void someMethod(Integer n) {
		System.out.println("Two");
	}

//	public void someMethod(String n) {
//		System.out.println("Three");
//	}

	public static void main(String[] args) {

		new TestClass().someMethod(null);
	}

}
