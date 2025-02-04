package leetcode;

public class MaximumAscendingSubarraySum {
	public static void main(String[] args) {
		int[] t1 = { 10, 20, 30, 5, 10, 50 };
		System.out.println(maxAscendingSum(t1));

		int[] t2 = { 10, 20, 30, 40, 50 };
		System.out.println(maxAscendingSum(t2));

		int[] t3 = { 12, 17, 15, 13, 10, 11, 12 };
		System.out.println(maxAscendingSum(t3));
	}

	public static int maxAscendingSum(int[] nums) {
		int max = 0;
		int curr = nums[0];
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				curr += nums[i];
			}
			else {
				max = Math.max(max, curr);
				curr = nums[i];
			}
		}
		
		return Math.max(max, curr);
	}
}
