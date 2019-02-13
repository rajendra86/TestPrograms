package from_juno;

public class Reflection {

	private String str1;	

	private int var1;
	
	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public String getStr1() {
		return str1;
	}


	public void setStr1(String str1) {
		this.str1 = str1;
	}
	
	public String getValue() {
		System.out.println("This is a method in Reflection Class");
		return "hello";
	}

}
