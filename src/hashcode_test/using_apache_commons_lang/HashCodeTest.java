package hashcode_test.using_apache_commons_lang;

import hashcode_test.Employee;

import java.util.Collections;
import java.util.Objects;

import org.apache.commons.lang.builder.HashCodeBuilder;

public class HashCodeTest {

	
	public static void main(String[] args) {

		Employee emp1 = new Employee(12, "Ramesh");
		System.out.println("Emp1= " + emp1.hashCode());
		System.out.println("Emp1 identityHashCode= "
				+ System.identityHashCode(emp1));
		System.out.println("Emp1 hashCode= "
				+ HashCodeBuilder.reflectionHashCode(emp1, false));

		System.out.println("Using Objects = " + Objects.hashCode(emp1));

		Employee emp2 = new Employee(13, "Suresh");
		System.out.println(emp2 instanceof Employee);

		System.out.println(emp1.getClass().isInstance(emp2));
		
		
		
	}
}
