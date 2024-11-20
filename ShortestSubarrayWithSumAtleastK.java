package leetcode;

import java.util.Deque;
import java.util.LinkedList;

public class ShortestSubarrayWithSumAtleastK {
	public static void main(String[] args) {
		int[] t1 = { 1, 2 };
		System.out.println(shortestSubarray2(t1, 4));

		int[] t2 = { 10, -5, 200 };
		System.out.println(shortestSubarray2(t2, 150));
	}

	public static int shortestSubarray(int[] nums, int k) {
		int n = nums.length;
		
		long[] prefixSum = new long[n + 1];
		
		for (int i = 1; i < n + 1; i++) {
			prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
		}
		
		Deque<Integer> deque = new LinkedList<>();
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < prefixSum.length; i++) {
			
			while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= k) {
				min = Math.min(min, i - deque.pollFirst());
			}
			
			while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
				deque.pollLast();
			}
			
			deque.addLast(i);
		}
		
		return (min == Integer.MAX_VALUE) ? -1 : min;
		
	}
	public static int shortestSubarray2(int[] nums, int k) {
		int n = nums.length;

		long[] prefixSum = new long[n + 1];

		for (int i = 1; i < n + 1; i++) {
			prefixSum[i] = prefixSum[i - 1] + nums[i - 1];
		}

//		Deque<Integer> deque = new LinkedList<>();
		int first = 0;
		int last = 0;
		int[] q = new int[n + 1];
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < prefixSum.length; i++) {

			while (first < last && prefixSum[i] - prefixSum[q[first]] >= k) {
				min = Math.min(min, i - q[first++]);
			}

			while (first < last && prefixSum[i] <= prefixSum[q[last - 1]]) {
				last--;
			}

			q[last++] = i;
		}

		return (min == Integer.MAX_VALUE) ? -1 : min;

	}
}
