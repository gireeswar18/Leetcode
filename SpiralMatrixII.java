package leetcode;

import java.util.Arrays;

public class SpiralMatrixII {
	public static void main(String[] args) {

		int n = 5;

		int[][] res = generateMatrix(n);

		for (int[] x : res) {
			System.out.println(Arrays.toString(x));
		}

	}

	public static int[][] generateMatrix(int n) {

		int[][] arr = new int[n][n];

		int num = 1;

		int rowStart = 0;
		int colStart = 0;

		int rowEnd = n - 1;
		int colEnd = n - 1;

		while (rowStart <= rowEnd && colStart <= colEnd) {
			for (int i = colStart; i <= colEnd; i++) {
				arr[rowStart][i] = num++;
			}
			rowStart++;
			
			System.out.println("Row start : " + rowStart);

			for (int i = rowStart; i <= rowEnd; i++) {
				arr[i][colEnd] = num++;
			}
			colEnd--;
			
			System.out.println("Col end : " + colEnd);

			if (colStart <= colEnd) {
				for (int i = colEnd; i >= colStart; i--) {
					arr[rowEnd][i] = num++;
				}
				rowEnd--;
			}
			System.out.println("Row end : " + rowEnd);

			if (rowStart <= rowEnd) {
				for (int i = rowEnd; i >= rowStart; i--) {
					arr[i][colStart] = num++;
				}
				colStart++;
			}
			System.out.println("Col start : " + colStart);
		}

		return arr;
	}
}
