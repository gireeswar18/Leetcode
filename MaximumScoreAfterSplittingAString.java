package leetcode;

public class MaximumScoreAfterSplittingAString {
	public static void main(String[] args) {
		System.out.println(maxScore("011101"));
		System.out.println(maxScore("00111"));
		System.out.println(maxScore("1111"));
		System.out.println(maxScore("00"));
		System.out.println(maxScore("01"));
		System.out.println(maxScore("10"));
	}

	public static int maxScore(String s) {
		
		int n = s.length();
		int[] prefix = new int[n];
		char[] arr = s.toCharArray();
		
		int max = 0;
		
		int cnt = 0;
		
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == '0') {
				++cnt;
			}
			prefix[i] = cnt;
		}
		
		prefix[n - 1] = prefix[n - 2];
		cnt = 0;
		
		for (int i = n - 1; i > 0; i--) {
			if (arr[i] == '1') {
				++cnt;
			}
			max = Math.max(max, cnt + prefix[i]);
		}
				
		return max;

	}
}
