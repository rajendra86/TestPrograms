package cloneexample;

public class BlackCatCloneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		BlackCat cat1 = new BlackCat("Black Meow");
		Cat cat = new Cat("Blacky");
		cat1.setCat(cat);
		//System.out.println(cat1.getCatname() + " " + cat1.getName());

		BlackCat cat2 = (BlackCat) cat1.clone();
		System.out.println(cat2.getCatname() + " " + cat2.getCat().getName());

		cat2.setCatname("White Meow");

		System.out.println(cat2.getCatname() + " " + cat2.getCat().getName());
		
		//cat.setName("Pinky");
		
		System.out.println(cat2.getCatname() + " " + cat2.getCat().getName());
		
		System.out.println("cat1==cat2 " + (cat1 == cat2));
		System.out.println("cat1==cat2 " + cat1.equals(cat2));
		System.out.println("cat1==cat2 " + cat1.hashCode() + " " + cat2.hashCode() );

	}

}
