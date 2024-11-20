package leetcode;

import java.util.Arrays;

public class FindThePowerOfKSizedSubarrays_I {
	public static void main(String[] args) {
		int[] t1 = { 1, 2, 3, 4, 3, 2, 5 };
		System.out.println(Arrays.toString(resultsArray(t1, 3)));

		int[] t2 = { 2, 2, 2, 2, 2 };
		System.out.println(Arrays.toString(resultsArray(t2, 4)));

		int[] t3 = { 3, 2, 3, 2, 3, 2 };
		System.out.println(Arrays.toString(resultsArray(t3, 2)));
		
		int[] t4 = {80, 124, 54, 49, 50, 51};
		System.out.println(Arrays.toString(resultsArray(t4, 3)));
	}

	public static int[] resultsArray(int[] nums, int k) {
		
		if (k == 1) return nums;
		
		int n = nums.length;
		
		int[] res = new int[n - k + 1];
		
		int l = 0, r = 0, x = -1;
		
		for (int i = 1; i < k; i++) {
			if (nums[i] != nums[i - 1] + 1) {
				x = i;
			}
			r++;
		}
		int ind = 0;
		
		while (r < n) {
			if (l < x) {
				res[ind] = -1;
			}
			else if (nums[r] == nums[r - 1] + 1) {
				res[ind] = nums[r];
			}
			
			if (nums[r] != nums[r - 1] + 1) {
				res[ind] = -1;
				x = r;
			}
			r++;
			l++;
			ind++;
		}
		
		return res;
		
	}
}
