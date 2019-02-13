/**
 * 
 */
package pubpackage;

/**
 * @author prasaraj
 * 
 */
public class Parent {

	public static void sayBye() {
		System.out.println("Hello to Parent!!!");
	}

	public void sayHello() {
		System.out.println("Hello to Parent!!!");
	}

	public int calculate(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		System.out.println(new Parent().calculate(10, 20));
	}
}
