package leetcode;

import java.util.Arrays;

public class MaximumXORForEachQuery {
	public static void main(String[] args) {
		int[] t1 = { 0, 1, 1, 3 };
		int[] t2 = { 2, 3, 4, 7 };
		int[] t3 = { 0, 1, 2, 2, 5, 7 };
		
		System.out.println(Arrays.toString(getMaximumXor(t1, 2)));
		System.out.println(Arrays.toString(getMaximumXor(t2, 3)));
		System.out.println(Arrays.toString(getMaximumXor(t3, 3)));
	}

	public static int[] getMaximumXor(int[] nums, int maximumBit) {
//		int max = (int) Math.pow(2, maximumBit) - 1;
		int max = (1 << maximumBit) - 1;
		int n = nums.length;
		int[] res = new int[n];
		
		int currPrefix = 0;
		
		for (int i = 0; i < n; i++) {
			currPrefix = currPrefix ^ nums[i];
			res[n - i - 1] = max - currPrefix;
		}
		
		return res;
	}
}
