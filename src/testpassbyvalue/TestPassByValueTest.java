package testpassbyvalue;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestPassByValueTest {
	TestPassByValue test = new TestPassByValue();

	@BeforeClass
	public static void setup() {
		System.out.println("Hai...!");
	}

	@Before
	public void beforeMethod() {
		System.out.println("assertTrue!");
	}
	
	@Test
	public int stringsShouldMatch() {
		assertTrue("Strings are Equal!", test.stringTest("meow", "meow"));
		return 1;
	}

	@Test
	public void stringsShouldnotMatch() {
		assertTrue("Strings not equal!", test.stringTest("meow", "bow bow"));
	}

	@AfterClass
	public static void afterSetup() {
		System.out.println("Bye...!");
	}
}
