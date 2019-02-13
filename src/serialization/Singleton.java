package serialization;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Singleton implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static Singleton instance = new Singleton();
	private int i;

	public static Singleton getInstance() {
		return instance;
	}

	private Singleton() {
	}

	private void readObject(ObjectInputStream ois) throws IOException,
			ClassNotFoundException {
		ois.defaultReadObject();		
		//System.out.println(instance.i + " " + this.i);
		//System.out.println(instance.hashCode() + " " + this.hashCode());
		instance.i = this.i;
	}

	private Object readResolve() {
		System.out.println("In readResolve");
		//instance.i = this.i; -- without this line insatnce.i will return modified value after serialization, if this line uncommented we can comment readObject method
		return instance;
	}

	public static void main(String[] args) throws Throwable {

		Singleton s = Singleton.getInstance();
		s.i = 5;
		
		System.out.println("before serialization::"+s.i+" "+ s.hashCode());
		ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
		ObjectOutputStream oos = new java.io.ObjectOutputStream(baos);
		oos.writeObject(getInstance());
		oos.close();

		s.i = 7; // modified after serialization
		System.out.println("After serialization::"+s.i+" "+ s.hashCode());
		
		InputStream is = new ByteArrayInputStream(baos.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(is);
		Singleton deserialized = (Singleton) ois.readObject();
		System.out.println("After serialization::"+deserialized.i+" "+ deserialized.hashCode());
	}
}