package leetcode;

public class UniquePathsII {
	public static void main(String[] args) {
		int[][] arr = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
		
		System.out.println(uniquePathsWithObstacles(arr));
	}

	public static int uniquePathsWithObstacles(int[][] grid) {
		
		if (grid[0][0] == 1) return 0;
				
		int m = grid.length;
		int n = grid[0].length;
		
		int[][] dp = new int[m][n];
		
		dp[0][0] = 1;
		
		for (int i = 0; i < m; i++) {
			
			if (grid[i][0] != 1 && i != 0)
				dp[i][0] = dp[i - 1][0];
			
		}
		
		for (int j = 0; j < n; j++) {
			
			if (grid[0][j] != 1 && j != 0)
				dp[0][j] = dp[0][j - 1];
			
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				
				if (grid[i][j] != 1) {
					dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
				}
			}
		}
		
		return dp[m - 1][n - 1];
		
		
	}
}
