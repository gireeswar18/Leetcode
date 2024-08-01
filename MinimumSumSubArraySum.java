package leetcode;

public class MinimumSumSubArraySum {
	public static void main(String[] args) {
		int target = 4;
		int arr[] = {1, 4, 4};
		
		System.out.println(minSubArrayLen(target, arr));
	}

	public static int minSubArrayLen(int target, int[] nums) {
		
		int minLen = Integer.MAX_VALUE;
		int sum = 0;
		int left = 0;
		int right = 0;
		
		while (right < nums.length) {
			
			sum += nums[right];
			
			while (left < nums.length && sum >= target) {
				
				minLen = Math.min(minLen, right - left + 1);
				
				sum -= nums[left];
				left++;
				
			}
			
			right++;
			
		}
		
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	}
}
