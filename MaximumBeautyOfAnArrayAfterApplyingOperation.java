package leetcode;

import java.util.Arrays;

public class MaximumBeautyOfAnArrayAfterApplyingOperation {
	public static void main(String[] args) {
		int[] t1 = { 4, 2, 1, 6 };
		System.out.println(maximumBeauty(t1, 2));

		int[] t2 = { 1, 1, 1, 1 };
		System.out.println(maximumBeauty(t2, 10));

		int[] t3 = { 49, 27 };
		System.out.println(maximumBeauty(t3, 12));

		int[] t4 = { 5, 57, 46 };
		System.out.println(maximumBeauty(t4, 15));
	}

	public static int maximumBeauty(int[] nums, int k) {
		Arrays.sort(nums);

		int range = k * 2;

		int l = 0, r = 0;

		while (r < nums.length) {
			if (nums[r] - nums[l] > range) {
				l++;
			}
			r++;
		}
		
		return r - l;

	}
}
