package leetcode;

public class LongestSubArrayWithMaximumBitwiseAND {
	public static void main(String[] args) {
		
		int[] arr = {96317,96317,96317,96317,96317,96317,96317,96317,96317,279979};
		
		System.out.println(longestSubarray(arr));
		
	}

	public static int longestSubarray(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int len = 0;
		int left = 0;
		int right = 0;
		
		while (right < nums.length) {
			
			while (right < nums.length && nums[left] == nums[right]) {
				right++;
			}
			
			if (max < nums[left]) {
				max = nums[left];
				len = right - left;
			}
			else if (max == nums[left])
				len = Math.max(len, right - left);
			left = right;
			
			System.out.println("left: " + left);
			System.out.println("right: " + right);
		}
		
		return len;
		
	}
}
