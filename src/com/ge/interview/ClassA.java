package com.ge.interview;

public class ClassA extends ClassB {

	public void testMethod(){
		super.testMethod();
		System.out.println("ClassA");
		
	}
	
	public static void main(String[] args) {
		new ClassA().testMethod();

	}

}
