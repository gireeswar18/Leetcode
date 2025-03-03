package leetcode;

import java.util.*;

public class PartitionArrayAccordingToGivenPivot {
	public static void main(String[] args) {
		int[] t1 = { 9, 12, 5, 10, 14, 3, 10 };
		System.out.println(Arrays.toString(pivotArray(t1, 10)));

		int[] t2 = { -3, 4, 3, 2 };
		System.out.println(Arrays.toString(pivotArray(t2, 2)));
	}

	public static int[] pivotArray(int[] nums, int pivot) {
		int n = nums.length;
		
		int[] min = new int[n];
		int[] max = new int[n];
		
		int i = 0, j = 0;
		int cnt = 0;

		for (int num : nums) {
			if (num > pivot)
				max[j++] = num;
			else if (num < pivot)
				min[i++] = num;
			else
				cnt++;
		}
		
		int ind = 0;
		
		for (int k = 0; k < i; k++) {
			nums[ind++] = min[k];
		}
		for (int k = 0; k < cnt; k++) {
			nums[ind++] = pivot;
		}
		for (int k = 0; k < j; k++) {
			nums[ind++] = max[k];
		}
		return nums;
	}
}
