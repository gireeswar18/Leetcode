package leetcode;

public class NumberOfSubstringsContainingAllThreeCharacters {
	public static void main(String[] args) {
		System.out.println(numberOfSubstrings("abcabc"));
		System.out.println(numberOfSubstrings("aaacb"));
		System.out.println(numberOfSubstrings("abc"));
	}

	public static int numberOfSubstrings(String s) {
		int res = 0;
		int[] freq = new int[3];
		int n = s.length();
		int l = 0;
		
		for (int r = 0; r < n; r++) {
			freq[s.charAt(r) - 'a']++;
			
			while (freq[0] >= 1 && freq[1] >= 1 && freq[2] >= 1) {
				res += (n - r);
				freq[s.charAt(l) - 'a']--;
				l++;
			}
		}
		
		return res;
	}
}
