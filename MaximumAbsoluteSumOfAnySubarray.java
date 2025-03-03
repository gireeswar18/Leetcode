package leetcode;

public class MaximumAbsoluteSumOfAnySubarray {
	public static void main(String[] args) {
		System.out.println(maxAbsoluteSum(new int[] { 1, -3, 2, 3, -4 }));
		System.out.println(maxAbsoluteSum(new int[] { 2, -5, 1, -4, 3, -2 }));
	}

	public static int maxAbsoluteSum(int[] nums) {
		int maxPos = 0, maxNeg = 0;

		int sum = 0;

		for (int num : nums) {
			sum += num;
			
			if (sum < 0)
				sum = 0;

			maxPos = Math.max(maxPos, sum);

		}
		
		sum = 0;
		for (int num : nums) {
			sum += num;
			
			if (sum > 0)
				sum = 0;
			
			maxNeg = Math.min(maxNeg, sum);
		}

		return Math.max(maxPos, Math.abs(maxNeg));

	}
}
