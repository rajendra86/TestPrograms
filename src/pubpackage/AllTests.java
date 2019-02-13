package pubpackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import checkanagram.AnagramsTest;

@RunWith(Suite.class)
@SuiteClasses({ ParentTest.class, AnagramsTest.class })
public class AllTests {

}
