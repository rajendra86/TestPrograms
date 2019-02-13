package test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

	/**
	 * @param args
	 * @throws InvocationTargetException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 */
	public static void main(String[] args) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException,
			NoSuchMethodException, SecurityException {
				
		System.out.println("Starting Reflection Test");
		Class<test.Reflection> testClass = Reflection.class;

		Method[] reflectionMethods = testClass.getMethods();

		Field[] declaredFields = testClass.getDeclaredFields();
		for (int i = 0; i < declaredFields.length; i++) {
			System.out.println(" Fields--> " + declaredFields[i]);
			
		}

		for (int i = 0; i < reflectionMethods.length; i++) {
			// System.out.println(" Methods --> " +
			// reflectionMethods[i].getName());
			if (reflectionMethods[i].getName().equalsIgnoreCase("getValue")) {
				Method method = testClass.getMethod("getValue", null);
				// System.out.println(method);
				method.invoke(new Reflection(), null);
			}
		}

	}

}
