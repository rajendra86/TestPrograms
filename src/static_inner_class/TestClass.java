package static_inner_class;

public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HighLevelClass high = new HighLevelClass();
		HighLevelClass.InnerClass inner = new HighLevelClass.InnerClass();
		HighLevelClass.AnotherInnerClass newinner = high.new AnotherInnerClass();

		high.setName("Higher");
		inner.setInnerName("Inner");
		newinner.setNewName("anotherInner");

		System.out.println(high.getName());
		System.out.println(inner.getInnerName());
		System.out.println(newinner.getNewName());

	}
}