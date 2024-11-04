package leetcode;

public class MaximalSquare {
	public static void main(String[] args) {
		char[][] t1 = { { '1', '0', '1' }, { '1', '1', '0' }, { '1', '1', '0' } };

		char[][] t2 = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '0', '1', '0' } };

		char[][] t3 = { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' },
				{ '1', '0', '1', '1', '1' } };

		System.out.println(maximalSquare(t1));
		System.out.println(maximalSquare(t2));
		System.out.println(maximalSquare(t3));
	}

	public static int maximalSquare(char[][] matrix) {
		int max = 0;
		int m = matrix.length;
		int n = matrix[0].length;

		int[][] dp = new int[m][n];

		for (int i = 0; i < m; i++) {
			dp[i][0] = matrix[i][0] == '1' ? 1 : 0;
			if (dp[i][0] == 1) max = 1;
		}
		for (int j = 0; j < n; j++) {
			dp[0][j] = matrix[0][j] == '1' ? 1 : 0;
			if (dp[0][j] == 1) max = 1;
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {

				if (matrix[i][j] == '1') {

					dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;

					max = Math.max(max, dp[i][j]);
				}
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(dp[i][j] + " ");
			}
			System.out.println();
		}

		return max * max;
	}
}
