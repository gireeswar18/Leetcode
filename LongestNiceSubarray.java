package leetcode;

public class LongestNiceSubarray {
	public static void main(String[] args) {
		System.out.println(longestNiceSubarray(new int[] { 1, 3, 8, 48, 10 }));
		System.out.println(longestNiceSubarray(new int[] { 3, 1, 5, 11, 13 }));
	}

	public static int longestNiceSubarray(int[] nums) {
		int l = 0;	
		int n = nums.length;
		int res = 1;
		int curr = 0;
		
		for (int r = 0; r < n; r++) {
			while ((curr & nums[r]) != 0) {
				curr = curr ^ nums[l];
				l++;
			}
			
			curr = curr | nums[r];
			res = Math.max(res, r - l + 1);
		}
		
		return res;
	}
}
