package bigdecimaldouble;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;

public class BigDecimalDoubleTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// floating point calculation
		double amount1 = 2.15;
		double amount2 = 1.10;		
		System.out.println("difference between 2.15 and 1.0 using double is: "
				+ (amount1 - amount2));

		// Use BigDecimal for financial calculation
		BigDecimal amount3 = new BigDecimal("2.15");
		BigDecimal amount4 = new BigDecimal("1.10");
		System.out
				.println("difference between 2.15 and 1.0 using BigDecimal is: "
						+ (amount3.subtract(amount4)));
		
		String aa = "123";
		Long ll = new Long(new String(aa.getBytes()));
		System.out.println(ll);
		
		System.out.println();		
		
		
		
	}

}
