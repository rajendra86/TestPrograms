package test2;

public enum TestConstants {

 SUNDAY("Monday"),
 MONDAY("Sunday");
 private String value;

TestConstants(final String str){
	 value = str;
 }

/**
 * @return the value
 */
public String getValue() {
	return value;
}

}
