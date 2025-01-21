package leetcode;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MinimumCostToMakeAtleastOneValidPathInAGrid {
	public static void main(String[] args) {
		int[][] t1 = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 1, 1, 1, 1 }, { 2, 2, 2, 2 } };
		System.out.println(minCost(t1));

		int[][] t2 = { { 1, 2 }, { 4, 3 } };
		System.out.println(minCost(t2));
	}

	public static int minCost(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> a[2] - b[2]);
		int[][] minCost = new int[rows][cols];

		for (int i = 0; i < rows; i++) {
			Arrays.fill(minCost[i], Integer.MAX_VALUE);
		}
		minCost[0][0] = 0;

		int[][] dirs = { { 0, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		
		pq.add(new int[] {0, 0, 0});
		
		while (!pq.isEmpty()) {
			int[] curr = pq.poll();
			if (curr[0] == rows - 1 && curr[1] == cols - 1) {
				break;
			}
			
			for (int i = 1; i < 5; i++) {
				int dx = dirs[i][0];
				int dy = dirs[i][1];
				
				int nr = curr[0] + dx;
				int nc = curr[1] + dy;
				
				int newCost = (i == grid[curr[0]][curr[1]] ? curr[2] : curr[2] + 1);
				
				if (nr >= 0 && nc >= 0 && nr < rows && nc < cols && newCost < minCost[nr][nc]) {
					minCost[nr][nc] = newCost;
					pq.add(new int[] {nr, nc, newCost});
				}
				
			}
		}
		

		return minCost[rows - 1][cols - 1];

	}
}
