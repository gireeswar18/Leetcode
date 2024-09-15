package leetcode;

import java.util.Arrays;

public class FindTheLongestSubstringContainingVowelsInEvenCounts {
	public static void main(String[] args) {
		
		String s = "eleetminicoworoep";
		
		System.out.println(findTheLongestSubstring(s));
	}

	public static int findTheLongestSubstring(String s) {
		int res = 0;
		int prefix = 0;
		
		int[] char_map = new int[26];
		char_map[0] = 1;
		char_map[4] = 2;
		char_map[8] = 4;
		char_map[14] = 8;
		char_map[20] = 16;
		
		int[] first = new int[32];
		
		Arrays.fill(first, -1);
		
		for (int i = 0; i < s.length(); i++) {
			
			prefix = prefix ^ char_map[s.charAt(i) - 'a'];
			
			if (first[prefix] == -1 && prefix != 0)
				first[prefix] = i;
			
			res = Math.max(res, i - first[prefix]);	
		}
		
		return res;
	}
}
