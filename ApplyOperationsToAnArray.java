package leetcode;

import java.util.Arrays;

public class ApplyOperationsToAnArray {
	public static void main(String[] args) {
		int[] t1 = { 1, 2, 2, 1, 1, 0 };
		System.out.println(Arrays.toString(applyOperations(t1)));
		int[] t2 = { 847, 847, 0, 0, 0, 399, 416, 416, 879, 879, 206, 206, 206, 272 };
		System.out.println(Arrays.toString(applyOperations(t2)));
	}

	public static int[] applyOperations(int[] nums) {
		int n = nums.length;
		for (int i = 0; i < n - 1; i++) {

			if (nums[i] == nums[i + 1]) {
				nums[i] *= 2;
				nums[i + 1] = 0;
			}

		}

		int ind = 0, zero = 0;

		while (ind < n) {
			if (nums[ind] != 0 && nums[zero] == 0) {
				nums[zero] = nums[ind];
				nums[ind] = 0;
				ind++;
				zero++;
			}
			else if (nums[zero] != 0 && nums[ind] != 0) {
				ind++;
				zero++;
			}
			else {
				ind++;
			}
			

		}

		return nums;
	}

}
