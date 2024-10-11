package leetcode;

import java.util.*;

public class TheNumberOfTheSmallestUnOccupiedChair {
	public static void main(String[] args) {
//		int[][] t = { { 1, 4 }, { 2, 3 }, { 4, 6 } };
		int[][] t = { { 3, 10 }, { 1, 5 }, { 2, 6 } };

		int tF = 0;

		System.out.println(smallestChair(t, tF));
	}

	public static int smallestChair(int[][] times, int targetFriend) {
		PriorityQueue<Integer> chairs = new PriorityQueue<>();
		PriorityQueue<int[]> leav_occ = new PriorityQueue<>((a, b) -> a[0] - b[0]);
		
		int targetArrival = times[targetFriend][0];
		int n = times.length;

		// ascending the arrival time
		Arrays.sort(times, (a, b) -> a[0] - b[0]);
		
		for (int[] x : times)
			System.out.println(Arrays.toString(x));

		// chair filling
		for (int i = 0; i < n; i++)
			chairs.add(i);
		System.out.println(chairs);

		for (int i = 0; i < n; i++) {
			while (!leav_occ.isEmpty() && leav_occ.peek()[0] <= times[i][0]) {
				chairs.offer(leav_occ.poll()[1]);
			}
			
			if (times[i][0] == targetArrival) {
				break;
			}
			
			leav_occ.offer(new int[] {times[i][1], chairs.poll()});
			
		}
	
		return chairs.peek();
	}
}
