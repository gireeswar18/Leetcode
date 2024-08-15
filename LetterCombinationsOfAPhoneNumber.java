package leetcode;

import java.util.*;

public class LetterCombinationsOfAPhoneNumber {
	public static void main(String[] args) {

		System.out.println(letterCombinations("23"));

	}

	static List<String> list;
//	static HashMap<Character, String> map = new HashMap<Character, String>();
	static String[] map = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
	
	public static List<String> letterCombinations(String digits) {
		
		if (digits.length() == 0) return new ArrayList<String>();

//		map.put('2', "abc");
//		map.put('3', "def");
//		map.put('4', "ghi");
//		map.put('5', "jkl");
//		map.put('6', "mno");
//		map.put('7', "pqrs");
//		map.put('8', "tuv");
//		map.put('9', "wxyz");
		
		
		list = new ArrayList<String>();

		make(digits, 0, new StringBuilder());

		return list;

	}

	private static void make(String digits, int currDigitInd, StringBuilder currStr) {

		if (currStr.length() == digits.length()) {
			list.add(currStr.toString());
			return;
		}

//		String letters = map.get(digits.charAt(currDigitInd));
		String letters = map[digits.charAt(currDigitInd) - '0'];

		for (int i = 0; i < letters.length(); i++) {

			make(digits, currDigitInd + 1, currStr.append(letters.charAt(i)));
			
			currStr.deleteCharAt(currStr.length() - 1);
		}	

	}
}
