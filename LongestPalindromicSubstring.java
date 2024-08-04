package leetcode;

public class LongestPalindromicSubstring {
	public static void main(String[] args) {

		System.out.println(longestPalindrome("babab"));

	}

	public static String longestPalindrome(String s) {

		int len = s.length();
		boolean[][] dp = new boolean[len][len];

		char[] arr = s.toCharArray();

		int maxLen = 1;
		int startInd = 0;

		for (int i = 0; i < len; i++) {
			dp[i][i] = true;
		}

		for (int i = 0; i < len - 1; i++) {

			if (arr[i] == arr[i + 1]) {

				dp[i][i + 1] = true;
				if (maxLen < 2) {
					maxLen = 2;
					startInd = i;
				}
			}

		}

		for (int i = 3; i <= len; i++) {

			for (int j = 0; j < len - i + 1; j++) {

				// j -> row
				// k -> col

				int k = j + i - 1;

				if (arr[j] == arr[k] && dp[j + 1][k - 1]) {
					dp[j][k] = true;

					if (maxLen < i) {
						maxLen = i;
						startInd = j;
					}

				}

			}

		}

		return s.substring(startInd, startInd + maxLen);
	}
}
