package externalization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizeEmployee {

	public static void main(String[] args) {

		Employee object1 = new Employee(1, "amy");
		Employee object2 = new Employee(2, "ankit");

		ChildEmployee child = new ChildEmployee();
		child.setName("Child1");
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Java\\ser.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);

			System.out
					.println("Serialization process has started, serializing employee objects...");
			oout.writeObject(object1);
			oout.writeObject(object2);
			oout.writeObject(child);

			oout.close();
			System.out.println("Object 1 HashCode--> " + object1.hashCode());
			System.out.println("Object Serialization completed.");

			// System.out.println("Deserialization Process started..");
			// FileInputStream fis = new FileInputStream("ser.txt");
			// ObjectInput oit = new ObjectInputStream(fis);
			// Employee emp;
			// while( (emp=(Employee)oit.readObject())!=null ){
			// System.out.println(emp);
			// }
			// oit.close();
			// System.out.println("Deserialization Process Completed..");

			InputStream fin = new FileInputStream("C:\\Java\\ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);

			System.out
					.println("DeSerialization process has started, displaying deSerialized employee objects...");
			// while( oin.readObject()!=null );
			Employee emp;
			emp = (Employee) oin.readObject();
			System.out.println(emp);
			System.out.println("Emp HashCode--> " + emp.hashCode()
					+ " Equals--> " + object1.equals(emp));
			emp = (Employee) oin.readObject();
			System.out.println(emp);
			System.out.println("Emp HashCode--> " + emp.hashCode()
					+ " Equals--> " + object2.equals(emp));

			ChildEmployee ch = (ChildEmployee) oin.readObject();
			System.out.println("Child Name " + ch.getName());
			oin.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException fnof) {
			fnof.printStackTrace();
		}
	}
}
