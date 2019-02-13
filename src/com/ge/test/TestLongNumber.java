package com.ge.test;

import java.util.Date;

public class TestLongNumber {

	public static void main(String[] args) {
		System.out.println("Testing Logging service on Predix Platform!");
		Long mob = new Long("9900913305");
		System.out.println(Long.MAX_VALUE > mob);
		
		System.out.println("Date==> " + new Date());
		
		String mob_no = "9900-91-3305";
		String modified_no = mob_no.substring(0, 4) + mob_no.substring(5, 7) + mob_no.substring(8);
		System.out.println(modified_no);

		
		StringBuffer GET_BUSINESS_ID_SSO = new StringBuffer(100);
		
		GET_BUSINESS_ID_SSO.append("SELECT R.BUSINESS_ID FROM PERSON P"
		+ "LEFT JOIN PERSON_ROLE PR ON P.PERSON_ID = PR.PERSON_ID AND PR.ACTIVE_IND='Y' "
		+ "LEFT JOIN ROLE R ON R.ROLE_ID = PR.ROLE_ID AND R.ACTIVE_IND='Y' "
		+ "WHERE P.SSO = '999999200' AND P.ACTIVE_IND='Y'");
		
		System.out.println(GET_BUSINESS_ID_SSO.toString());
	
	}

}

