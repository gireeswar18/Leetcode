package leetcode;

import java.util.*;

public class CountVowelStringsInRanges {
	public static void main(String[] args) {
		String[] w1 = { "aba", "bcb", "ece", "aa", "e" };
		int[][] q1 = { { 0, 2 }, { 1, 4 }, { 1, 1 } };
		System.out.println(Arrays.toString(vowelStrings(w1, q1)));

		String[] w2 = { "a", "e", "i" };
		int[][] q2 = { { 0, 2 }, { 0, 1 }, { 2, 2 } };
		System.out.println(Arrays.toString(vowelStrings(w2, q2)));
	}
	
	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}

	public static int[] vowelStrings(String[] words, int[][] queries) {
		int n = words.length;
		int[] prefix = new int[n + 1];
		int m = queries.length;
		int[] res = new int[m];

		for (int i = 0; i < words.length; i++) {
			prefix[i + 1] = prefix[i];
			
			if (isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length() - 1))) {
				prefix[i + 1]++;
			}

		}
		
		for (int i = 0; i < m; i++) {
			res[i] = prefix[queries[i][1] + 1] - prefix[queries[i][0]];
		}
		
		return res;
	}
}
