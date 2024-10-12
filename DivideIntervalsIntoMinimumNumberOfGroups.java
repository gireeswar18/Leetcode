package leetcode;

import java.util.*;

public class DivideIntervalsIntoMinimumNumberOfGroups {
	public static void main(String[] args) {
//		int[][] intervals = { { 5, 10 }, { 6, 8 }, { 1, 5 }, { 2, 3 }, { 1, 10 } };
		
		int[][] intervals = {
			    {441459, 446342},
			    {801308, 840640},
			    {871890, 963447},
			    {228525, 336985},
			    {807945, 946787},
			    {479815, 507766},
			    {693292, 944029},
			    {751962, 821744}
			};

		System.out.println(minGroups(intervals));
	}

	public static int minGroups(int[][] intervals) {
				
		Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
		
		for (int[] x : intervals) {
			System.out.print(Arrays.toString(x) + " ");
		}
		
		System.out.println();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		for (int[] arr : intervals) {
			System.out.println("Peek: " + pq.peek());
			if (!pq.isEmpty() && pq.peek() < arr[0])
				pq.poll();
			pq.add(arr[1]);
			
			System.out.println("PQ: " + pq);
		}
		
		
		return pq.size();
		
	}
}
