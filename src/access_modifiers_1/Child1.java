package access_modifiers_1;
//extends Parent
public class Child1   {

	/**
	 * @param args
	 * @throws CloneNotSupportedException 
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Parent parent = new Parent();
		Child1 child = new Child1();
		
		Child2 ch1 = new Child2();
		
		parent.print();
		
		//parent.clone();
		child.clone();
		ch1.clone();
	}

}
