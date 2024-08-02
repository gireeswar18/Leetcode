package leetcode;

import java.util.PriorityQueue;

public class KthLargestElementInAnArray {
	public static void main(String[] args) {
		
//		int[] arr = {3,2,1,5,6,4};
		int[] arr = {3,2,3,1,2,4,5,5,6};
		
		int k = 4;
		
		System.out.println(findKthLargest(arr, k));
		 
	}

	public static int findKthLargest(int[] nums, int k) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>((a, b) -> b - a);
		
		for (int num : nums)
			queue.add(num);
		
		while (!queue.isEmpty()) {
            if (--k == 0)
            	return queue.poll();
            
            queue.poll();
        }
		
		
		return -1;
		
		
	}
}
