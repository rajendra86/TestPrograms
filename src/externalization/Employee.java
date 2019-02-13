package externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Employee extends ParentEmployee implements Externalizable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;

	// This constructor is called during deSerializaition process, as we have
	// implemented Externalizable.
	public Employee() {
		System.out.println("In Employee!");
		id = 100;
	}

	public Employee(Integer id, String name) {
		System.out.println("In new Employee!");
		this.id = id;
		this.name = name;
	}

	// @Override
	// public boolean equals(Object obj) {
	// if (this == obj) {
	// return true;
	// }
	// if (obj == null) {
	// return false;
	// }
	// if (getClass() != obj.getClass()) {
	// return false;
	// }
	// Employee emp1 = (Employee) obj;
	// if (id == null) {
	// if (emp1.id != null)
	// return false;
	// } else if (!id.equals(emp1.id))
	// return false;
	//
	// if (name == null) {
	// if (emp1.name != null)
	// return false;
	// } else if (!name.equalsIgnoreCase(emp1.name))
	// return false;
	//
	// return true;
	// }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return id;

	}

	/*
	 * define how Serialization process will write objects.
	 */
	@Override
	public void writeExternal(ObjectOutput oo) throws IOException {
		System.out.println("in writeExternal()");
		oo.writeInt(id);
		oo.writeObject(name);
	}

	/*
	 * define how deSerialization process will read objects.
	 */
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("in readExternal()");
		this.id = in.readInt();
		this.name = (String) in.readObject();
	}

	/**
	 * Read resolve
	 */
	public Object readResolve() {
		System.out.println("In Readresolve " + this.id + " " + this.name);
		return this;
	}
}
