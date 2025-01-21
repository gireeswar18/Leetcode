package leetcode;

import java.util.*;

public class TrappingRainWater_II {
	public static void main(String[] args) {

		int[][] t1 = { { 1, 4, 3, 1, 3, 2 }, { 3, 2, 1, 3, 2, 4 }, { 2, 3, 3, 2, 3, 1 } };
		System.out.println(trapRainWater(t1));
	}

	public static int trapRainWater(int[][] heightMap) {
		int rows = heightMap.length;
		int cols = heightMap[0].length;

		if (rows < 3 || cols < 3)
			return 0;

		int trappedWater = 0;

		PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>((a, b) -> a[2] - b[2]);
		boolean[][] visited = new boolean[rows][cols];

		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
					visited[i][j] = true;
					minHeap.add(new int[] {i, j, heightMap[i][j]});
				}
			}
		}

		int level = 0;
		int[][] dirs = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

		while (!minHeap.isEmpty()) {
			int[] curr = minHeap.poll();
			level = Math.max(level, curr[2]);

			for (int[] dir : dirs) {
				int nx = curr[0] + dir[0];
				int ny = curr[1] + dir[1];
				
				if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && !visited[nx][ny]) {
					visited[nx][ny] = true;
					if (heightMap[nx][ny] < level) {
						trappedWater += level - heightMap[nx][ny];
					}
					minHeap.add(new int[] {nx, ny, heightMap[nx][ny]});
				}
			}
			
		}

		return trappedWater;

	}
}
