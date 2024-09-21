package leetcode;

import java.util.Arrays;

public class CountingBits {
	public static void main(String[] args) {
		
		int n = 1;
		
		System.out.println(Arrays.toString(countBits(n)));
		
	}

	public static int[] countBits(int n) {
		
		int[] dp = new int[n + 1];
		
		dp[0] = 0;
		
		if (n == 0) return dp;
		
		dp[1] = 1;
		
		for (int i = 2; i < n + 1; i++) {
			dp[i] = dp[i / 2] + i % 2;
		}
		
		return dp;
		
	}
}
