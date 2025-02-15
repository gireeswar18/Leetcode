package leetcode;

public class MaximumSumOfAPairWithEqualSumOfDigits {
	public static void main(String[] args) {
		System.out.println(maximumSum(new int[] { 18, 43, 36, 13, 7 }));
		System.out.println(maximumSum(new int[] { 10, 12, 19, 14 }));
	}

	public static int maximumSum(int[] nums) {
		int max = -1;
		
		int[] map = new int[82];

		for (int num : nums) {
			int sum = digitSum(num);
			
			if (map[sum] != 0) {
				max = Math.max(map[sum] + num, max);
			}
			map[sum] = Math.max(map[sum], num);

		}
		return max;

	}

	public static int digitSum(int num) {
		int sum = 0;
		while (num != 0) {
			sum += (num % 10);
			num /= 10;
		}

		return sum;
	}
}
