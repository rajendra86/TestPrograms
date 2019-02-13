package garbage_collection_test;

public class Address {
	private String street;
	private int pincode;
	private String houseno;

	public Address(String street, int pincode, String houseno) {
		super();
		this.street = street;
		this.pincode = pincode;
		this.houseno = houseno;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", pincode=" + pincode
				+ ", houseno=" + houseno + "]";
	}

	public final String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getHouseno() {
		return houseno;
	}

	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}

}
