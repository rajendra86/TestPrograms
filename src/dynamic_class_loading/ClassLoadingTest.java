package dynamic_class_loading;

public class ClassLoadingTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("dynamic_class_loading.TestClass");
	}

}
