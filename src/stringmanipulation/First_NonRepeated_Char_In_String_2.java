package stringmanipulation;

import java.util.LinkedHashMap;
import java.util.Map;

public class First_NonRepeated_Char_In_String_2 {

	public static void main(String[] args) {
		String s1 = "FGABDACGCBE";
		String s2 = "ABCDF";
		non_repeating_char(s1, s2);
		non_repeating_char_2(s1, s2);
		
	}

	public static void non_repeating_char(String s1, String s2) {
		for (char ch : s1.toCharArray()) {
			if (s1.indexOf(ch) == s1.lastIndexOf(ch)) {

				if (s2.indexOf(ch) != -1) {
					System.out.println("Non Repeating Char:- " + ch);
					break;
				}
			}
		}
	}

	public static void non_repeating_char_2(String s1, String s2) {
		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		Character cha;
		for (char ch : s1.toCharArray()) {
			cha = new Character(ch);
			if (charMap.containsKey(cha)) {
				charMap.put(cha, (charMap.get(cha) + 1));
			} else {
				charMap.put(cha, 1);
			}
		}

		for (Map.Entry<Character, Integer> it : charMap.entrySet()) {
			if (it.getValue() == 1) {
				if (s2.indexOf(it.getKey().charValue()) != -1) {
					System.out.println("Non Repeating Char:- " + it.getKey());
					break;
				}
			}
		}
	}
}
