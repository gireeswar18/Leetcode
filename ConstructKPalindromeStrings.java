package leetcode;

public class ConstructKPalindromeStrings {
	public static void main(String[] args) {
		System.out.println(canConstruct("annabelle", 2));
		System.out.println(canConstruct("leetcode", 3));
		System.out.println(canConstruct("true", 4));
		System.out.println(canConstruct("ab", 10));
	}

	public static boolean canConstruct(String s, int k) {
		int oddCnt = 0;
		int[] freq = new int[26];
		
		for (char c : s.toCharArray()) {
			freq[c - 'a']++;
		}
		for (int f : freq) {
			if (f % 2 == 1) {
				oddCnt++;
			}
		}
		if (oddCnt > k || s.length() < k) {
			return false;
		}
		return true;
	}
}
