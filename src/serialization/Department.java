package serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Department implements Serializable {

	private static final long serialVersionUID = 1L;

	public Department(String name) {
		this.name = name;
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public final void writeObject(ObjectOutputStream out) throws IOException {
		System.out.println("writeObject");
	}

	public final Object readObject(ObjectInputStream in) throws IOException,
			ClassNotFoundException {
		System.out.println("readObject");
		return null;
	}
}
