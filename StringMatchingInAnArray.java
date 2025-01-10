package leetcode;

import java.util.*;

public class StringMatchingInAnArray {
	public static void main(String[] args) {
		String[] t1 = { "mass", "as", "hero", "superhero" };
		System.out.println(stringMatching(t1));

		String[] t2 = { "leetcode", "et", "code" };
		System.out.println(stringMatching(t2));

		String[] t3 = { "blue", "green", "bu" };
		System.out.println(stringMatching(t3));
		
		String[] t4 = { "aa", "gggggggggggg", "zzzzz" };
		System.out.println(stringMatching(t4));
	}

	public static List<String> stringMatching(String[] words) {
		List<String> res = new ArrayList<>();
		int n = words.length;
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) continue;
				
				if (words[j].contains(words[i])) {
					res.add(words[i]);
					break;
				}
			}
		}
		
		return res;
	}
}
