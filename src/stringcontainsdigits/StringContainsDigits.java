package stringcontainsdigits;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringContainsDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String digits = "9900913305";

		Pattern pattern = Pattern.compile(".*\\D.*");
		Matcher match = pattern.matcher(digits);
		System.out.println(match.matches());
		
		Byte bObj = new Byte("10");
	    //use byteValue method of Byte class to convert it into byte type.
	    byte b = bObj.byteValue();
	    System.out.println(b);
	    
	    char a = 'a'; char A = 'A';
	    System.out.println(a + " " + A);
	    a++; A++; 
	    System.out.println(a + " " + A);
	    a++; A++; 
	    System.out.println(a + " " + A);
	}

}
