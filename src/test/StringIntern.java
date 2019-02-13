package test;

public class StringIntern {

	public static void main(String[] args) {
		String s3 = new String("ABC");
		String s1 = "ABC";

		System.out.println(s3 == s1);
		System.out.println(s3.intern() == s1);
		System.out.println(s3.equals(s1));
	}

}
