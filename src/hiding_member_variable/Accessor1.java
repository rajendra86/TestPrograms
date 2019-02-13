package hiding_member_variable;

public class Accessor1 {

	public static void main(String[] args) {
		Toy toy = new Toy();
		
		toy.setOne("one");
		toy.setTwo("two");
		toy.setThree("three");
		toy.setFour("four");
		toy.setFive("five");
		
		
		System.out.println(toy);

	}

}
