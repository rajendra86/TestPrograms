package log4jtest;

import hashcode_test.Employee;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import stringmanipulation.StringPermutation;

public class Log4JTest {

	public static void main(String[] args) {

		Logger def = Logger.getLogger(Log4JTest.class);

		Logger log = new Log4JTest().log(Employee.class.getCanonicalName());

		log.setLevel(Level.ALL);
		// log.log(Level.ALL, map);
	}

	public Logger log(String className) {
		Logger logger = Logger.getLogger(className);
		// BasicConfigurator.configure();
		DOMConfigurator.configure("log4j.xml");

		return logger;
	}
}
