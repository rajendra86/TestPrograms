package print_method_name;

public class PrintMethodName {

	public static void main(String[] args) {
		doSomeMethod();
	}

	public static void doSomeMethod() {

		System.out.println(Thread.currentThread().getStackTrace()[0]);
		System.out.println(Thread.currentThread().getStackTrace()[1]
				.getMethodName()
				+ " : "
				+ Thread.currentThread().getStackTrace()[1].getClassName());
		System.out.println(Thread.currentThread().getStackTrace()[2]);
	}
}
