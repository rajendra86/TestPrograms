package ways_of_creating_object;

import java.io.Serializable;

import varargs.TestVarArgs;

public class CreateObject implements Cloneable, Serializable {
	String hai = "hai";
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public CreateObject() {
		System.out.println("Object Created!");
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Cloning!!");
		return super.clone();

	}

	public static void main(String[] args) throws CloneNotSupportedException,
			ClassNotFoundException, InstantiationException,
			IllegalAccessException {
		System.out.println("Different ways of creating objects!");

		CreateObject obj1 = new CreateObject();
		CreateObject obj2 = (CreateObject) obj1.clone();
		System.out.println("----");
		CreateObject obj3 = (CreateObject) Class.forName(
				"ways_of_creating_object.CreateObject").newInstance();

		// CreateObject obj4 = (CreateObject)
		// CreateObject.class.getClassLoader()
		// .loadClass("varargs.TestVarArgs").newInstance();

		String s = (String) CreateObject.class.getClassLoader()
				.loadClass("java.lang.String").newInstance();

		System.out.println(s.hashCode());

		System.out.println(obj3.getClass().toString() + " "
				+ CreateObject.class.toString());
	}

}
