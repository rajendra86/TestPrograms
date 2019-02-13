package utility;

public enum SimpleEnum {
	/**
	 * Holds the OWNER attribute.
	 */
	OWNER("Owner"),
	/**
	 * Holds the ADMINL1 attribute.
	 */
	ADMINL1("AdminL1"),
	/**
	 * Holds the ADMINL2 attribute.
	 */
	ADMINL2("AdminL2");
	/**
	 * Holds the String value.
	 */
	private String value;

	/**
	 * @constructor RoleType.
	 * @param roleValue
	 *            String
	 */
	private SimpleEnum(final String roleValue) {
		System.out.println("In constructor");
		value = roleValue;
	}

	/**
	 * Returns String.
	 * 
	 * @return value
	 */
	public String getValue() {
		return value;
	}
}
