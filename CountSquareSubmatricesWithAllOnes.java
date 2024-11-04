package leetcode;

public class CountSquareSubmatricesWithAllOnes {
	public static void main(String[] args) {
		int[][] t1 = { { 0, 1, 1, 1 }, { 1, 1, 1, 1 }, { 0, 1, 1, 1 } };
		int[][] t2 = { { 1, 0, 1 }, { 1, 1, 0 }, { 1, 1, 0 } };

		System.out.println(countSquares(t1));
		System.out.println(countSquares(t2));
	}

	public static int countSquares(int[][] matrix) {
		int m = matrix.length;
		int n = matrix[0].length;
		int cnt = 0;
		
		for (int i = 0; i < m; i++) {
			cnt += matrix[i][0];
		}
		for (int j = 1; j < n; j++) {
			cnt += matrix[0][j];
		}
		
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (matrix[i][j] == 1) {
					matrix[i][j] = Math.min(Math.min(matrix[i - 1][j], matrix[i][j - 1]), matrix[i - 1][j - 1]) + 1;
					cnt += matrix[i][j];
				}
			}
		}
		
		return cnt;
	}

}
