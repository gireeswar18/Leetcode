package leetcode;

public class MakeStringASubsequenceUsingCyclicIncrements {
	public static void main(String[] args) {
		System.out.println(canMakeSubsequence("abc", "ad"));
		System.out.println(canMakeSubsequence("zc", "ad"));
		System.out.println(canMakeSubsequence("ab", "d"));
	}

	public static boolean canMakeSubsequence(String str1, String str2) {
		int m = str1.length();
		int n = str2.length();

		if (m < n)
			return false;

		int ind = 0;

		for (char x : str1.toCharArray()) {
			char y = str2.charAt(ind);

			if (x != y) {
				if ((x - 'a' + 1) % 26 == (y - 'a')) {
					ind++;
				}
			}
			else {
				ind++;
			}

			if (ind == n)
				return true;
		}

		return false;
	}
}
