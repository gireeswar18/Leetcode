package leetcode;

public class LongestStrictlyIncreasingOrStrictlyDecreasingSubarray {
	public static void main(String[] args) {

		System.out.println(longestMonotonicSubarray(new int[] { 1, 4, 3, 3, 2 }));
		System.out.println(longestMonotonicSubarray(new int[] { 3, 3, 3, 3 }));
		System.out.println(longestMonotonicSubarray(new int[] { 3, 2, 1 }));

	}

	public static int longestMonotonicSubarray(int[] nums) {
		int maxI = 1;
		int maxD = 1;
		int l = 0;
		int r = 1;
		
		int n = nums.length;
		
		while (r < n) {
			if (nums[r] > nums[r - 1]) {
				maxI = Math.max(maxI, r - l + 1);
			}
			else {
				l = r;
			}
			r++;
		}
		l = 0;
		r = 1;
		
		while (r < n) {
			if (nums[r] < nums[r - 1]) {
				maxI = Math.max(maxI, r - l + 1);
			}
			else {
				l = r;
			}
			r++;
		}
		
		return Math.max(maxI, maxD);
	}
	
//	public static int longestMonotonicSubarray(int[] nums) {
//		int max = 1;
//		int l_inc = 0, l_dec = 0;
//		int r_inc = 1, r_dec = 1;
//		
//		int n = nums.length;
//		
//		while (r_inc < n || r_dec < n) {
//			
//			if (r_inc < n) {
//				if (nums[r_inc] > nums[r_inc - 1]) {
//					max = Math.max(max, r_inc - l_inc + 1);
//				}
//				else {
//					l_inc = r_inc;
//				}
//			}
//			if (r_dec < n) {
//				if (nums[r_dec] < nums[r_dec - 1]) {
//					max = Math.max(max, r_dec - l_dec + 1);
//				}
//				else {
//					l_dec = r_dec;
//				}
//			}
//			r_inc++;
//			r_dec++;
//		}
//	
//		return max;
//	}
}
