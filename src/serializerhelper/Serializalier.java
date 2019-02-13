package serializerhelper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import serializerbeans.Cat;


public class Serializalier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cat meow = new Cat("PINKU", 3);
		Cat meow1 = new Cat("BLACKY", 4);		
		
		try {
			FileOutputStream fos = new FileOutputStream("C:/cat.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			System.out.println("Serializing the object...");
//			System.out.println("Cat name    --> " + meow.getName());
//			System.out.println("Cat Size    --> " + meow.getSize());
//			System.out.println("Hash Code --> " + meow.hashCode());
//			System.out.println("Object    --> " + meow.toString());
			oos.writeObject(meow);
			oos.writeObject(meow1);
			System.out.println("Object serialized...");
			fos.close();
			oos.close();
			System.out.println();
			System.out.println("De - Serializing the object...");
			
			FileInputStream fis = new FileInputStream("C:/cat.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			meow = (Cat)ois.readObject();
			
			while(meow != null) {				
				System.out.println("Cat name    --> " + meow.getName());
				System.out.println("Cat Size    --> " + meow.getSize());
				System.out.println("Hash Code --> " + meow.hashCode());
				System.out.println("Object    --> " + meow.toString());	
				System.out.println();
				meow = (Cat)ois.readObject();
			}
			//meow = (Cat)ois.readObject();
			//meow1 = (Cat)ois.readObject();
			/*System.out.println("Cat name    --> " + meow.getName());
			System.out.println("Cat Size    --> " + meow.getSize());
			System.out.println("Hash Code --> " + meow.hashCode());
			System.out.println("Object    --> " + meow.toString());	
			
			System.out.println("Cat name    --> " + meow1.getName());
			System.out.println("Cat Size    --> " + meow1.getSize());
			System.out.println("Hash Code --> " + meow1.hashCode());
			System.out.println("Object    --> " + meow1.toString());	*/
			//System.out.println("Object De - serialized...");
			//fis.close();
			//ois.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
