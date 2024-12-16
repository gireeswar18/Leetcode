package leetcode;

import java.util.*;

public class ContinuousSubarrays {

	public static void main(String[] args) {
		int[] t1 = { 5, 4, 2, 4 };
		System.out.println(continuousSubarrays(t1));

		int[] t2 = { 1, 2, 3 };
		System.out.println(continuousSubarrays(t2));
	}

	public static long continuousSubarrays(int[] nums) {
		int n = nums.length;
		long cnt = 0;

		int left = 0, right = 0;
		Deque<Integer> minQueue = new ArrayDeque<>();
		Deque<Integer> maxQueue = new ArrayDeque<>();
		
		while (right < n) {
			while (!minQueue.isEmpty() && nums[right] < minQueue.peekLast()) {
				minQueue.removeLast();
			}
			minQueue.add(nums[right]);
			
			while (!maxQueue.isEmpty() && nums[right] > maxQueue.peekLast()) {
				maxQueue.removeLast();
			}
			maxQueue.add(nums[right]);
			
			while (maxQueue.peek() - minQueue.peek() > 2) {
				if (maxQueue.peek() == nums[left]) {
					maxQueue.pollFirst();
				}
				if (minQueue.peek() == nums[left]) {
					minQueue.pollFirst();
				}
				
				left++;
			}
			
			cnt += right - left + 1;
			right++;
			
		}

		return cnt;

	}
}
