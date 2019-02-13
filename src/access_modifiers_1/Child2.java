package access_modifiers_1;

public class Child2 extends Child1 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Child1 ch = new Child1();
		Child2 ch1 = new Child2();
		ch1.clone();
		//ch.clone();
	}

}
