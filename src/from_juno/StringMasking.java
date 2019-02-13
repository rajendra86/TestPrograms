package from_juno;

public class StringMasking {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String originalString = null;
		String maskedString = null;
		
		
		originalString = "Vodafone@123";
		//maskedString = originalString;		
		maskedString = maskString(originalString);
		System.out.println(originalString);
		System.out.println(maskedString);
	}
	
	public static String maskString(String originalString) {
		//String maskedString = null;
		//maskedString = originalString;
		StringBuilder maskedString = new StringBuilder();
		
		for (int i = 0; i < originalString.length(); i++)
			//maskedString = maskedString.replace(originalString.charAt(i), '*');
			maskedString.append('*');
		
		return maskedString.toString();
	}

}
