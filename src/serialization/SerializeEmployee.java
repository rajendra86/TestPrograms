package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serialization.Employee;

public class SerializeEmployee {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Department dept1 = new Department("HR");
		Department dept2 = new Department("SALES");
		Employee object1 = new Employee(1, "amy", dept1);
		Employee object2 = new Employee(2, "ankit", dept2);

		try {
			FileOutputStream fout = new FileOutputStream("ser.txt");
			ObjectOutputStream oout = new ObjectOutputStream(fout);

			System.out
					.println("Serialization process has started, serializing employee objects...");
			oout.writeObject(object1);
			oout.writeObject(object2);
			oout.close();
			System.out.println("Object Serialization completed.");

			InputStream fin = new FileInputStream("ser.txt");
			ObjectInput oin = new ObjectInputStream(fin);

			System.out
					.println("DeSerialization process has started, displaying deSerialized employee objects...");

			Employee emp;
			emp = (Employee) oin.readObject();
			System.out.println(emp);
			emp = (Employee) oin.readObject();
			System.out.println(emp);
			oin.close();

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (ClassNotFoundException fnof) {
			fnof.printStackTrace();
		}

	}

}
