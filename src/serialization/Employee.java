package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// extends ParentEmployee
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private Department dept;

	public Employee(Integer id, String name, Department dept) {
		System.out.println("In new Employee!");
		this.id = id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept= "
				+ dept.getName() + "]";
	}

	public final void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("writeObject");
	}

	public final Object readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		System.out.println("readObject");
		return null;
	}
	
	/**
	 * Read resolve
	 */
	public Object readResolve() {
		System.out.println("In Readresolve");
		return this;
	}

}
