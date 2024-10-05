package leetcode;

public class PermutationInString {
	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "eidbooo";

		System.out.println(checkInclusion(s1, s2));
	}

	public static boolean checkInclusion(String s1, String s2) {

		int[] freq = new int[26];
		int[] window = new int[26];

		for (char c : s1.toCharArray())
			freq[c - 'a']++;

		int left = 0, right = 0;

		while (right < s2.length()) {
			
			char c = s2.charAt(right);
			window[c - 'a']++;
			
			if (right - left + 1 == s1.length()) {
				if (equals(freq, window))
					return true;
				
				window[s2.charAt(left) - 'a']--;
				left++;
			}
			
			right++;

		}
		
		return false;

	}
	
	public static boolean equals(int[] a, int[] b) {
		
		for (int i = 0; i < 26; i++) {
			if (a[i] != b[i]) return false;
		}
		
		return true;
		
	}
}

















