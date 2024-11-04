package leetcode;

public class MaximumNumberOfMovesInAGrid {
	public static void main(String[] args) {
		int[][] t1 = { { 2, 4, 3, 5 }, { 5, 4, 9, 3 }, { 3, 4, 2, 11 }, { 10, 9, 13, 15 } };

		System.out.println(maxMoves(t1));
	}

	public static int maxMoves(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		
		int[][] dp = new int[m][n];
		
		for (int col = n - 2; col >= 0; col--) {
			for (int row = 0; row < m; row++) {
				
				if (row - 1 >= 0 && col + 1 < n && grid[row][col] < grid[row - 1][col + 1]) {
					dp[row][col] = Math.max(dp[row][col], dp[row - 1][col + 1] + 1);
				}
				if (row + 1 < m && col + 1 < n && grid[row][col] < grid[row + 1][col + 1]) {
					dp[row][col] = Math.max(dp[row][col], dp[row + 1][col + 1] + 1);
				}
				if (col + 1 < n && grid[row][col] < grid[row][col + 1]) {
					dp[row][col] = Math.max(dp[row][col], dp[row][col + 1] + 1);
				}
			}
		}
		
		int res = 0;
		for (int i = 0; i < m; i++) {
			if (dp[i][0] > res) res = dp[i][0];
		}
		
		return res;
	}

}
