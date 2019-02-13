package cloneexample;

public class Dog implements Cloneable {
	private String name;
	private String category;
	private int size;
	private Cat cat;

	public Dog(String name, String category, int size, Cat cat) {
		super();
		this.name = name;
		this.category = category;
		this.size = size;
		this.cat = cat;		
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @param size
	 *            the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @return the cat
	 */
	public Cat getCat() {
		return cat;
	}

	/**
	 * @param cat
	 *            the cat to set
	 */
	public void setCat(Cat cat) {
		this.cat = cat;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
//		Dog g = (Dog) super.clone();
//		g.setCat(new Cat(g.getCat().getName()));
//		return g;		
	}
}
