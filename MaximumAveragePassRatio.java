package leetcode;

import java.util.PriorityQueue;

public class MaximumAveragePassRatio {
	public static void main(String[] args) {
		int[][] t1 = { { 1, 2 }, { 3, 5 }, { 2, 2 } };
		System.out.println(maxAverageRatio(t1, 2));

		int[][] t2 = { { 2, 4 }, { 3, 9 }, { 4, 5 }, { 2, 10 } };
		System.out.println(maxAverageRatio(t2, 4));
	}

	public static double maxAverageRatio(int[][] classes, int extraStudents) {

		class Pair {
			double inc;
			int ind;

			public Pair(double inc, int ind) {
				this.inc = inc;
				this.ind = ind;
			}
		}
		
		int n = classes.length;
		PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.inc > a.inc ? 1 : -1);

		for (int i = 0; i < n; i++) {
			int[] curr = classes[i];

			double oldAvg = (double) curr[0] / (double) curr[1];
			double newAvg = (double) (curr[0] + 1) / (double) (curr[1] + 1);

			maxHeap.add(new Pair(newAvg - oldAvg, i));
		}

		for (int i = 0; i < extraStudents; i++) {
			Pair peek = maxHeap.poll();
			classes[peek.ind][0]++;
			classes[peek.ind][1]++;

			int[] curr = classes[peek.ind];

			double oldAvg = (double) curr[0] / (double) curr[1];
			double newAvg = (double) (curr[0] + 1) / (double) (curr[1] + 1);

			maxHeap.add(new Pair(newAvg - oldAvg, peek.ind));
		}

		double total = 0;

		for (int i = 0; i < n; i++) {
			total += (double) classes[i][0] / (double) classes[i][1];
		}

		return (double) (total / n);

	}
}