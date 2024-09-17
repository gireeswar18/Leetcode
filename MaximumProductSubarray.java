package leetcode;

public class MaximumProductSubarray {
	public static void main(String[] args) {

		int[] nums = { 2, 3, -2, 4 };

		System.out.println(maxProduct(nums));
	}

	public static int maxProduct(int[] nums) {

		int res = nums[0];

		int min = res;
		int max = res;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			}

			min = Math.min(nums[i], nums[i] * min);
			max = Math.max(nums[i], nums[i] * max);

			res = Math.max(res, max);
		}

		return res;

	}
}
