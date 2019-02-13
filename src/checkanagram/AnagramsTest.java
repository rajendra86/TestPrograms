package checkanagram;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramsTest {

	public AnagramsTest() {
		System.out.println("In constructor!");
	}
	
	@Test
	public void wordsShouldBeAnagram() {
		assertTrue("Words should be anagram",
				Anagrams.isAnagram("meow", "weom"));

	}

	@Test
	public void wordsShouldNotBeAnagram() {
		assertFalse("Words shouldnot be anagram",
				Anagrams.isAnagram("meo", "weow"));
	}

}
