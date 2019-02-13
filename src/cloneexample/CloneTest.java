package cloneexample;

public class CloneTest {

	/**
	 * @param args
	 * @throws CloneNotSupportedException
	 */
	public static void main(String[] args) throws CloneNotSupportedException {

		Cat blacky = new Cat("Blacky");
		Dog goldy = new Dog("Cheeku", "Golden Retriver", 5, blacky);

		Dog goldy2 = (Dog) goldy.clone();

		System.out.println("Dog's Name->:" + goldy2.getName() + " Category->: "
				+ goldy2.getCategory() + " Size--> " + goldy2.getSize()
				+ " Cat--> " + goldy2.getCat().getName());

		goldy.setCategory("Normal Breed");
		goldy.setName("Bunty");
		goldy.setSize(10);
		//goldy.getCat().setName("Billi");

		System.out.println("Dog's Name->:" + goldy.getName() + " Category->: "
				+ goldy.getCategory() + " Size--> " + goldy.getSize()
				+ " Cat--> " + goldy.getCat().getName());

		System.out.println("Dog's Name->:" + goldy2.getName() + " Category->: "
				+ goldy2.getCategory() + " Size--> " + goldy2.getSize()
				+ " Cat--> " + goldy2.getCat().getName());

		System.out.println("Equal --> " + (goldy2.equals(goldy))
				+ " HashCode--> " + goldy.hashCode() + " " + goldy2.hashCode());

		System.out.println("Goldy --> " + goldy.getCat().hashCode()
				+ " Goldy2--> " + goldy2.getCat().hashCode());

		System.out.println(goldy.getClass() == goldy2.getClass());
	}
}
