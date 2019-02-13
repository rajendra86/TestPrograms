package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
	public static void main(String[] args) {

		Object s = "Hello World!";
		Object s2 = "Bye World!";
		try {

			// create a new file with an ObjectOutputStream
			FileOutputStream out = new FileOutputStream("test.txt");
			ObjectOutputStream oout = new ObjectOutputStream(out);

			// write something in the file
			oout.writeObject(s);

			// reset the stream and rewrite what is already written
			// oout.reset();
			s = "Bye1 World";
			// write something again
			oout.writeObject(s);

			// close the stream
			oout.close();

			// create an ObjectInputStream for the file we created before
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(
					"test.txt"));

			// read and print a string
			System.out.println("" + (String) ois.readObject());
			System.out.println("" + (String) ois.readObject());

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
