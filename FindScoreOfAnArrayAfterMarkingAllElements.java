package leetcode;

import java.util.*;

public class FindScoreOfAnArrayAfterMarkingAllElements {
	public static void main(String[] args) {
		int[] t1 = { 2, 1, 3, 4, 5, 2 };
		System.out.println(findScore(t1));

		int[] t2 = { 2, 3, 5, 1, 3, 2 };
		System.out.println(findScore(t2));
	}

	public static long findScore(int[] nums) {
		long score = 0;
		int n = nums.length;
		boolean[] marked = new boolean[n];

		Queue<int[]> minHeap = new PriorityQueue<>(
				(a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
		
		for (int i = 0; i < n; i++) {
			minHeap.add(new int[] {i, nums[i]});
		}
		
		while (!minHeap.isEmpty()) {
			int ind = minHeap.peek()[0];
			minHeap.poll();
			
			if (!marked[ind]) {
				score += nums[ind];
				marked[ind] = true;
				
				if (ind != 0) marked[ind - 1] = true;
				if (ind != n - 1) marked[ind + 1] = true;
			}
		}
		
		

		return score;
	}
}
