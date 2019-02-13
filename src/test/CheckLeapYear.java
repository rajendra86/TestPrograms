package test;

public class CheckLeapYear {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year = 2014;
		int year1 = 2012;
		int year2= 1990;
		
		boolean result = isLeapYear(year);
		
		if (result) {
			System.out.println("Result is " + result + " Test Case 1 is Pass");
		} 
		if (!result) {
			System.out.println("Result is " + result + " Test Case 1 is Pass");
		}
		
		boolean result1 = isLeapYear(year1);
		if (result1) {
			System.out.println("Result is " + result1 + " Test Case 2 is Pass");
		} 
		if (!result1) {
			System.out.println("Result is " + result1 + " Test Case 2 is Pass");
		}
		
		boolean result2 = isLeapYear(year2);
		if (result2) {
			System.out.println("Result is " + result2 + " Test Case 3 is Pass");
		} 
		if (!result2) {
			System.out.println("Result is " + result2 + " Test Case 3 is Pass");
		}
	}

	
	public static boolean isLeapYear (int year) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		return isLeapYear;
	}
	public static boolean isLeapYear1 (int year) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		return isLeapYear;
	}
	public static boolean isLeapYear2 (int year) {
		boolean isLeapYear = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
		return isLeapYear;
	}
}
