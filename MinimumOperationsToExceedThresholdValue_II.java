package leetcode;

import java.util.PriorityQueue;

public class MinimumOperationsToExceedThresholdValue_II {
	public static void main(String[] args) {
		System.out.println(minOperations(new int[] { 2, 11, 10, 1, 3 }, 10));
		System.out.println(minOperations(new int[] { 1, 1, 2, 4, 9 }, 20));
	}

	public static int minOperations(int[] nums, int k) {
		PriorityQueue<Long> pq = new PriorityQueue<>();

		for (int num : nums)
			pq.add((long) num);

		int op = 0;
		while (pq.size() > 1 && pq.peek() < k) {
			long newNum = pq.poll() * 2 + pq.poll();

			pq.add(newNum);
			op++;
		}

		return op;
	}
}
