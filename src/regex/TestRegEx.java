package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegEx {

	public static final String EXAMPLE_TEST = "This is my small example string which I'm going to use for pattern matching.";

	public static void main(String[] args) {

		// System.out.println(EXAMPLE_TEST.matches("\\w.*"));
		String[] splitString = (EXAMPLE_TEST.split("\\s+"));
		// System.out.println(splitString.length);// should be 14
		for (String string : splitString) {
			// System.out.println(string);
		}
		// replace all whitespace with tabs
		// System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));

		// System.out.println("true".matches("[a-z]rue"));

		// System.out.println("2true".matches("[\\d].*"));

		Pattern pattern = Pattern.compile("\\w+");
		// in case you would like to ignore case sensitivity,
		// you could use this statement:
		// Pattern pattern = Pattern.compile("\\s+", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(EXAMPLE_TEST);
		// check all occurance
		while (matcher.find()) {
			System.out.print("Start index: " + matcher.start());
			System.out.print(" End index: " + matcher.end() + " ");
			System.out.println(matcher.group());
		}

		String text = "This is the text which is to be searched "
				+ "for occurrences of the word 'is'.";

		String patternString = "is";

		pattern = Pattern.compile(patternString);
		matcher = pattern.matcher(text);

		int count = 0;
		while (matcher.find()) {
			count++;
			System.out.println("found: " + count + " : " + matcher.start()
					+ " - " + matcher.end() + matcher.group());

		}
	}

}
