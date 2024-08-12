package leetcode;

import java.util.Arrays;

public class ConcatenationOfArray {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 1 };
		
		System.out.println(Arrays.toString(getConcatenation(nums)));
	}

	public static int[] getConcatenation(int[] nums) {
		
		int n = nums.length;
		int[] res = new int[n * 2];
		
		for (int i = 0; i < n; i++) {
			
			res[i] = nums[i];
			res[i + n] = nums[i];
			
		}
		
		return res;
		
	}
}
