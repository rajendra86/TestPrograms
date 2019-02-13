package externalization;

import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ChildEmployee extends Employee {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void writeExternal(ObjectOutput oo) throws IOException {
		System.out.println("in writeExternal() child ");
		oo.writeObject(name);
	}
	
	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		System.out.println("in readExternal() child");
		this.name = (String) in.readObject();
		
	}
}
