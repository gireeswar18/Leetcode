package leetcode;

import java.util.Arrays;

public class SpecialArray_II {
	public static void main(String[] args) {
		int[] t1 = { 3, 4, 1, 2, 6 };
		int[][] q1 = { { 0, 4 } };

		System.out.println(Arrays.toString(isArraySpecial(t1, q1)));

		int[] t2 = { 4, 3, 1, 6 };
		int[][] q2 = { { 0, 2 }, { 2, 3 } };

		System.out.println(Arrays.toString(isArraySpecial(t2, q2)));
	}

	public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
		boolean[] ans = new boolean[queries.length];
		
		int[] parity = new int[nums.length];
		int sameParityCount = 0;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] % 2 == nums[i - 1] % 2) {
				sameParityCount++;
			}
			parity[i] = sameParityCount;
		}
		
		for (int i = 0; i < queries.length; i++) {
			ans[i] = parity[queries[i][0]] == parity[queries[i][1]];
		}
		
		return ans;
	}
}
