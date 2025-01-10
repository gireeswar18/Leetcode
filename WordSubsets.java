package leetcode;

import java.util.*;

public class WordSubsets {
	public static void main(String[] args) {
		String[] words = { "amazon", "apple", "facebook", "google", "leetcode" };
		String[] t1 = { "a", "l" };
		String[] t2 = { "oc", "ec", "ceo" };
		String[] t3 = { "l", "e" };

		System.out.println(wordSubsets(words, t1));
		System.out.println(wordSubsets(words, t2));
		System.out.println(wordSubsets(words, t3));
	}
	
	public static boolean match(int[] a, int[] b) {
		for (int i = 0; i < 26; i++) {
			if (a[i] < b[i]) {
				return false;
			}
		}
		return true;
	}

	public static List<String> wordSubsets(String[] words1, String[] words2) {
		List<String> res = new ArrayList<>();
		
		int[] freq = new int[26];
		for (String word : words2) {
			int[] temp = new int[26];
			for (char c : word.toCharArray()) {
				temp[c - 'a']++;
				freq[c - 'a'] = Math.max(freq[c - 'a'], temp[c - 'a']);
			}
			
		}
		for (String word : words1) {
			int[] map = new int[26];
			for (char c : word.toCharArray()) {
				map[c - 'a']++;
			}
			
			if (match(map, freq))
				res.add(word);
		}
		
		return res;
	}
}
