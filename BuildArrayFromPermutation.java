package leetcode;

import java.util.Arrays;

public class BuildArrayFromPermutation {
	public static void main(String[] args) {
		
		int[] nums = {0,2,1,5,3,4};
		
		System.out.println(Arrays.toString(buildArray(nums)));
		
	}

	public static int[] buildArray(int[] nums) {
		
//		int[] ans = new int[nums.length];
//		
//		for (int i = 0; i < nums.length; i++) {
//			
//			ans[i] = nums[nums[i]];
//			
//		}
//		
//		return ans;
		
		arr(0, nums);
		return nums;
	}
	
	private static void arr(int i, int[] nums) {
		
		if (i == nums.length) return;
		
		int temp = nums[nums[i]];
		
		arr(i + 1, nums);
		
		nums[i] = temp;
		
	}
}
