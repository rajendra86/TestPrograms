package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = 1L;
	private int i;

	private SerializedSingleton() {
	}

	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.instance;
	}

	public Object readResolve() {
		return getInstance();
	}

	public static void main(String[] args) throws Throwable {

		SerializedSingleton s = SerializedSingleton.getInstance();
		s.i = 5;

		System.out.println("before serialization::" + s.i + " " + s.hashCode());
		OutputStream fio = new FileOutputStream("ser.txt");
		ObjectOutput oos = new ObjectOutputStream(fio);
		oos.writeObject(SerializedSingleton.getInstance());
		oos.close();

		s.i = 7; // modified after serialization
		System.out.println("After serialization::" + s.i + " " + s.hashCode());

		InputStream is = new FileInputStream("ser.txt");
		ObjectInput ois = new ObjectInputStream(is);
		SerializedSingleton deserialized = (SerializedSingleton) ois
				.readObject();
		System.out.println("After serialization::" + deserialized.i + " "
				+ deserialized.hashCode());
	}
}