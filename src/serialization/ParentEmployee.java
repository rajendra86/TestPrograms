package serialization;

import java.io.Serializable;

public class ParentEmployee implements Serializable {
	private static final long serialVersionUID = 1L;

	public ParentEmployee() {
		System.out.println("In Parent Constructor!");
	}

}
