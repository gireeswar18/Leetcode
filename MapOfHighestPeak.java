package leetcode;

import java.util.*;

public class MapOfHighestPeak {
	public static void main(String[] args) {
		int[][] t1 = { { 0, 1 }, { 0, 0 } };
		for (int[] x : highestPeak(t1)) {
			System.out.println(Arrays.toString(x));
		}
	}

	public static int[][] highestPeak(int[][] isWater) {
		int m = isWater.length;
		int n = isWater[0].length;

		boolean[][] vis = new boolean[m][n];

		int[][] res = new int[m][n];

		Queue<int[]> q = new LinkedList<int[]>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (isWater[i][j] == 1) {
					q.add(new int[] { i, j });
					vis[i][j] = true;
					res[i][j] = 0;
				}
			}
		}

		int[][] dirs = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };
		while (!q.isEmpty()) {
			int[] curr = q.poll();
			int h = res[curr[0]][curr[1]];
			
			for (int[] dir : dirs) {
				int nr = curr[0] + dir[0];
				int nc = curr[1] + dir[1];
				
				if (nr >= 0 && nc >= 0 && nr < m && nc < n && !vis[nr][nc]) {
					vis[nr][nc] = true;
					res[nr][nc] = h + 1;
					q.add(new int[] {nr, nc});
				}
			}
		}
		
		return res;
	}
}
