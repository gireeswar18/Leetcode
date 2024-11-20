package leetcode;

public class MaximumSumOfDistinctSubarraysWithLengthK {
	public static void main(String[] args) {
		int[] t1 = { 1, 5, 4, 2, 9, 9, 9 };
		System.out.println(maximumSubarraySum(t1, 3)); // 15

		int[] t2 = { 4, 4, 4 };
		System.out.println(maximumSubarraySum(t2, 3)); // 0
	}

	public static long maximumSubarraySum(int[] nums, int k) {
		long maxSum = 0, currSum = 0;
		int[] freq = new int[100001];
		int left = 0, right = 0;
		int dup = 0;

		while (right < k) {

			if (freq[nums[right]] != 0) {
				dup++;
			}

			currSum += nums[right];

			freq[nums[right]]++;
			right++;
		}

		if (dup == 0)
			maxSum = Math.max(maxSum, currSum);

		while (right < nums.length) {
			if (freq[nums[left]] > 1)
				dup--;
			
			freq[nums[left]]--;
			currSum -= nums[left];
			left++;
			
			if (freq[nums[right]] != 0) {
				dup++;
			}

			currSum += nums[right];

			freq[nums[right]]++;
			right++;
			
			if (dup == 0)
				maxSum = Math.max(maxSum, currSum);
		}

		return maxSum;
	}
}
