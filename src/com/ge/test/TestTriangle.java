package com.ge.test;
public class TestTriangle {
	 
	static int i=1;
	public static void main(String[] args) {
	
		printNumber(4, 1);

	}
	
	
	
	private static void printNumber(int n, int numberOfCall)
	{
		int startNumber=1+(numberOfCall-1)*(numberOfCall+2)/2;
		pintNumberInLine(1,startNumber, numberOfCall);
		
		if(n+1==numberOfCall)
		{
			return;
		}
		else
		{
			printNumber(n, ++numberOfCall);
		}
	}



	private static void pintNumberInLine(int numberOfCall, int startNumber, int lineNumber) {
	
		
		if(numberOfCall==lineNumber)
		{
			System.out.println("\n");
			return;
		}
		System.out.print(startNumber);
		pintNumberInLine(++numberOfCall,--startNumber, lineNumber);
		
	}





	

}
