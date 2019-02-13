package dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simDate = new SimpleDateFormat("dd-MM-yyy");
		Date newDate = new Date();
		System.out.println(simDate.format(newDate));

		SimpleDateFormat oldDate = new SimpleDateFormat("dd-MM-yyy");
		Date oldDte = oldDate.parse("10-12-2014");

		System.out.println(new SimpleDateFormat("z Z dd-MMMM-yyyy")
				.format(oldDte));

		System.out.println(oldDte.compareTo(newDate));
	}

}
