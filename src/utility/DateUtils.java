package utility;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;

import junit.framework.TestCase;
import pass_by_value.Employee;

public class DateUtils extends TestCase {

	public static void main(String[] args) throws ParseException {
		DateFormat format = new SimpleDateFormat("dd.MM.yyyy");
		Date date = format.parse("22.11.2200");
		String strDate = format.format(new Date());

		System.out.println(date);

		System.out.println(strDate);

		System.out.println(Math.sqrt(8));
		System.out.println("Ceil== " + Math.ceil(Math.sqrt(8)));
		System.out.println("Floor== " + Math.floor(3));

		Employee emp = new Employee();
		String s = new String("AB");
		System.out.println(emp.hashCode());
		System.out.println(System.identityHashCode(emp));

		String s1 = "HI";
		String s2 = "hi";
		System.out.println((s1 == s2) + " " + s1.equals(s2));

		int i = 0;
		boolean t = true;
		boolean f = false, b;
		System.out.println((i++) == 0);
		System.out.println(i);
		b = (t | ((i++) == 0));
		System.out.println(b + " " + i);
		b = (f | ((i += 2) > 0));
		System.out.println(i);
		System.out.println(b);
		System.out.println("************************");

		int i1;
		float f1 = 2.3f;
		double d = 2.7;
		i1 = ((int) Math.ceil(f1)) * ((int) Math.round(d));
		System.out.println(i1);
		
		DateFormat df = new SimpleDateFormat();
	}
}