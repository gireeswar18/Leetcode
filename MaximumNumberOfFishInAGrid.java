package leetcode;

public class MaximumNumberOfFishInAGrid {

	public int dfs(int[][] grid, int[][] maxFish, boolean[][] vis, int i, int j) {

		int m = grid.length;
		int n = grid[0].length;

		if (i < 0 || i == m || j < 0 || j == n || grid[i][j] == 0 || vis[i][j]) {
			return 0;
		}

		vis[i][j] = true;
		
		int top = dfs(grid, maxFish, vis, i - 1, j);
		int btm = dfs(grid, maxFish, vis, i + 1, j);
		int left = dfs(grid, maxFish, vis, i, j - 1);
		int right = dfs(grid, maxFish, vis, i, j + 1);
		
		return grid[i][j] + (top + btm + left + right);

	}

	public int findMaxFish(int[][] grid) {

		int m = grid.length;
		int n = grid[0].length;

		int[][] maxFish = new int[m][n];
		boolean[][] vis = new boolean[m][n];

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] != 0 && !vis[i][j]) {
					maxFish[i][j] = dfs(grid, maxFish, vis, i, j);
				}
			}
		}
		
		int max = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				max = Math.max(max, maxFish[i][j]);
			}
		}
		
		return max;

	}
}
