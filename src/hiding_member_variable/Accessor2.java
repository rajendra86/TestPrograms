package hiding_member_variable;

public class Accessor2 extends Toy {

	private String five;

	public static void main(String[] args) {
		Accessor2 toy = new Accessor2();

		toy.setOne("one");
		toy.setTwo("two");
		toy.setThree("three");
		toy.setFour("four");
		toy.setFive("five");

		System.out.println(toy);
	}

	public String getFive() {
		return five;
	}

	public void setFive(String five) {
		this.five = five;
	}

}
