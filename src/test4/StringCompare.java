package test4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StringCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
				
//		String elementValue = "100092,100091";
//		String[] elementVal = elementValue.split(",");		
//		
//		String elementName = "mobileID";
//		int count = 0;
//		
//		for (String value: elementVal) {
//			count++;
//			if(value.equalsIgnoreCase("100092") && elementName.equalsIgnoreCase("MBB")){
//				System.out.println(value);
//				break;
//			} else if(value.equalsIgnoreCase("100092") && elementName.equalsIgnoreCase("mobileID")) {
//				System.out.println(value);
//				break;				
//			}
//		}
//		System.out.println(count);

		BigDecimal maximumQuantity = null;
		BigDecimal finalMaximumQuantity = null;
		BigDecimal tilMaxQuantity = new BigDecimal("2048");
		//1048576
		
		maximumQuantity = tilMaxQuantity.divide(new BigDecimal("1024"), 3, RoundingMode.HALF_UP);
		System.out.println("Value of maximumQuantity--> " + maximumQuantity);
	
		finalMaximumQuantity = maximumQuantity.setScale(0, tilMaxQuantity.ROUND_HALF_UP);
		System.out.println("Value of maximumQuantity--> " + finalMaximumQuantity.toString());
	}

}
