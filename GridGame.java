package leetcode;

public class GridGame {
	public static void main(String[] args) {
		int[][] t1 = { { 2, 5, 4 }, { 1, 5, 1 } };
		System.out.println(gridGame(t1));

		int[][] t2 = { { 3, 3, 1 }, { 8, 5, 2 } };
		System.out.println(gridGame(t2));

		int[][] t3 = { { 1, 3, 1, 15 }, { 1, 3, 3, 1 } };
		System.out.println(gridGame(t3));
	}

	public static long gridGame(int[][] grid) {
		long topSum = 0;
		long minSum = Long.MAX_VALUE;
		long btmSum = 0;
		int cols = grid[0].length;
		
		for (int i = 0; i < cols; i++) {
			topSum += grid[0][i];
		}
		
		for (int i = 0; i < cols; i++) {
			topSum -= grid[0][i];
			minSum = Math.min(minSum, Math.max(topSum, btmSum));
			btmSum += grid[1][i];
		}
		
		return minSum;
		
	}
}
