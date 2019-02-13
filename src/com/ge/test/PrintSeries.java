package com.ge.test;

public class PrintSeries {

	public static void main(String[] args) {
		
	}
	public static int print_number(int k) {
		
		if(k == 1) {
			System.out.println(k);
		}
		
		if(k != 0) {
			//System.out.print(k);
			System.out.print(print_number(++k) + " " + print_number(k));
		}
		return k;
	}

}
