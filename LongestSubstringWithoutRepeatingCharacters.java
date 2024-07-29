package leetcode;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
//		String s = "abcabcbb";
		String s = " ";
		
		System.out.println(lengthOfLongestSubstring(s));
	}

	public static int lengthOfLongestSubstring(String s) {
		
		if(s.length() == 0) return 0;
		if (s.length() == 1) return 1;
		
		int left = 0;
		int right = 0;
		
		int maxLen = 0;
		HashSet<Character> set = new HashSet<Character>();
		
		while (right < s.length())
		{
			if (set.add(s.charAt(right)))
			{
				right++;
			}
			else {
				maxLen = Math.max(maxLen, right - left);
//				System.out.println(s.substring(left, right));
				set.remove(s.charAt(left));
				left++;
			}
		}
		
		maxLen = Math.max(maxLen, right - left);
		
		return maxLen;
	}
}
