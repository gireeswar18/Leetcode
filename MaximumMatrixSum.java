package leetcode;

public class MaximumMatrixSum {
	public static void main(String[] args) {
		int[][] t1 = { { 1, -1 }, { -1, 1 } };

		System.out.println(maxMatrixSum(t1));
	}

	public static long maxMatrixSum(int[][] matrix) {
		
		long sum = 0;
		int cnt = 0;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sum += Math.abs(matrix[i][j]);
				
				if (matrix[i][j] < 0) {
					cnt++;
				}
				
				min = Math.min(min,  Math.abs(matrix[i][j]));
			}
		}
		
		if (cnt % 2 == 0) {
			return sum;
		}
				
		return sum - 2 * min;
	}
}
