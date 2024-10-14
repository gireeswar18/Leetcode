package leetcode;

import java.util.*;

public class MaximumScoreAfterApplyingKOperations {
	public static void main(String[] args) {
//		int[] a = { 10, 10, 10, 10, 10 };
		int[] a = { 1, 10, 3, 3, 3 };
		
		System.out.println(maxKelements(a, 3));
	}

	public static long maxKelements(int[] nums, int k) {
		long res = 0;
		
		Queue<Integer> maxHeap = new PriorityQueue<>((a, b) -> b - a);
		
		for (int num : nums)
			maxHeap.add(num);
		
		for (int i = 0; i < k; i++) {
			int peek = maxHeap.poll();
			res += peek;
			maxHeap.add(Math.ceilDiv(peek, 3));
		}
		
		return res;
	}
}
