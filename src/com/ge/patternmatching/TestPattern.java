package com.ge.patternmatching;

import java.util.regex.Pattern;

public class TestPattern {

	public static void main (String... args) {
		
//		 if(Pattern.matches("^[a-zA-Z0-9_' ']*$", "Oil & Gas")){
//			 System.out.println("True");
//		 } else {
//			 System.out.println("False");
//		 }
		String artist = "Sonu Nigam";
		String ss = "\"artist\":\""+ artist +"\",";
		String year = "\"year\":" + 2016 + ",";
		
		System.out.println(ss + " " + year);
	}
}
