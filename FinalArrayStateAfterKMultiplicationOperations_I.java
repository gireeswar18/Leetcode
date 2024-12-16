package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class FinalArrayStateAfterKMultiplicationOperations_I {
	public static void main(String[] args) {
		int[] t1 = { 2, 1, 3, 5, 6 };
		System.out.println(Arrays.toString(getFinalState(t1, 5, 2)));

		int[] t2 = { 1, 2 };
		System.out.println(Arrays.toString(getFinalState(t2, 3, 4)));
	}

	public static int[] getFinalState(int[] nums, int k, int multiplier) {

		int n = nums.length;
		PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);

		for (int i = 0; i < n; i++) {
			minHeap.add(new int[] {i, nums[i]});
		}
		
		while (k-- != 0) {
			int ind = minHeap.poll()[0];
			nums[ind] *= multiplier;
			minHeap.add(new int[] {ind, nums[ind]});
		}

		return nums;
	}
}
