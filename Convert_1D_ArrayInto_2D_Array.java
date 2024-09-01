package leetcode;

import java.util.Arrays;

public class Convert_1D_ArrayInto_2D_Array {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		
		int m = 2;
		int n = 3;
		
		for (int[] x : construct2DArray(arr, m, n))
			System.out.println(Arrays.toString(x));
	}

	public static int[][] construct2DArray(int[] original, int m, int n) {
				
		if (m * n != original.length) return new int[0][0];
		
		int[][] arr = new int[m][n];

		int ind = 0;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = original[ind++];
			}
		}
		
		return arr;
		
	}
}
