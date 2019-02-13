package pubpackage;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParentTest {

	private int number;
	private int num;

	public ParentTest(int number, int num) {
		this.number = number;
		this.num = num;
	}

	@Parameters
	//@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] { { 15, 20 }, { 20, 22 }, { 30, 5 } };
		return Arrays.asList(data);
	}

	Parent par = new Parent();

	/*
	 * @BeforeClass public static void beforeClassMethod() {
	 * System.out.println("Starting testing - Class...."); }
	 * 
	 * @Before public void beforeMethod() {
	 * System.out.println("Starting testing...."); }
	 */

	@Test
	//(expected=FileNotFoundException.class)
	public void additionOfNumberAndNumShouldMatch() {
		Assert.assertEquals("Value is not as expected", 35,
				par.calculate(number, num));
	}

	/*@Test
	public void additionOfNumberShouldMatch() {
		Assert.assertEquals("Expected value is 75", 75,
				par.calculate(number, num));
	}

	@Test
	public void objectShouldNotBeNull() {
		Assert.assertNotNull("Object is null!!!", par);
	}

	@Test
	public void objectShouldBeNull() {
		Parent par1 = new Parent();
		Assert.assertNull("Object is not Null!!!", par1);
	}*/
	/*
	 * @Test public void yetAnotherTest () {
	 * System.out.println("In yetAnotherTest method...." + number);
	 * 
	 * }
	 */

	/*
	 * @After public void afterMethod() {
	 * System.out.println("After testing...."); }
	 * 
	 * @AfterClass public static void afterClassMethod() {
	 * System.out.println("After testing - Class...."); }
	 */
}
