package leetcode;

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOne_I {
	public static void main(String[] args) {
		System.out.println(minOperations(new int[] { 0, 1, 1, 1, 0, 0 }));
		System.out.println(minOperations(new int[] { 0, 1, 1, 1 }));
	}

	public static int minOperations(int[] nums) {
		int res = 0;
		int n = nums.length;

		for (int i = 0; i < n - 2; i++) {
			if (nums[i] == 0) {
				res++;
				nums[i] = 1;
				nums[i + 1] = nums[i + 1] == 1 ? 0 : 1;
				nums[i + 2] = nums[i + 2] == 1 ? 0 : 1;
			}
		}

		return (nums[n - 1] + nums[n - 2]) == 2 ? res : -1;
	}
}
