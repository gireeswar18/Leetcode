package leetcode;

public class CountUnguardedCellsInTheGrid {
	public static void main(String[] args) {
		int[][] g1 = { { 0, 0 }, { 1, 1 }, { 2, 3 } };
		int[][] w1 = { { 0, 1 }, { 2, 2 }, { 1, 4 } };

		System.out.println(countUnguarded(4, 6, g1, w1));
	}

	public static int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
		 	int[][] arr = new int[m][n];

			for (int[] w : walls) {
				arr[w[0]][w[1]] = -1;
			}

	        for (int[] g : guards) {
	            arr[g[0]][g[1]] = 2;
	        }

			for (int[] guard : guards) {
				int x = guard[0], y = guard[1];
				
				// west
				for (int i = y - 1; i >= 0; i--) {
					if (arr[x][i] == -1 || arr[x][i] == 2)
						break;

					arr[x][i] = 1;
				}

				// east
				for (int i = y + 1; i < n; i++) {
					if (arr[x][i] == -1 || arr[x][i] == 2)
						break;
					
					arr[x][i] = 1;
				}
				
				// north
				for (int i = x - 1; i >= 0; i--) {
					if (arr[i][y] == -1 || arr[i][y] == 2)
						break;
					
					arr[i][y] = 1;
				}
				
				// south
				for (int i = x + 1; i < m; i++) {
					if (arr[i][y] == -1 || arr[i][y] == 2)
						break;
					
					arr[i][y] = 1;
				}
			}
			
			int cnt = 0;
			
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (arr[i][j] == 0)
						cnt++;
				}
			}
			
			return cnt;

	}
}
