package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class LuckyNumbersInAMatrix {
	public static void main(String[] args) {

//		int[][] matrix = new int[][] { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };

//		int[][] matrix = new int[][] { { 1, 10, 4, 2 }, { 9, 3, 8, 7 }, { 15, 16, 17, 12 } };
		
		int[][] matrix = new int[][] { {7,8}, {1, 2} };


		List<Integer> list = new LuckyNumbersInAMatrix().luckyNumbers(matrix);

		System.out.println(list);

	}

	public List<Integer> luckyNumbers(int[][] matrix) {
		List<Integer> list = new ArrayList<Integer>();

		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				int num = matrix[i][j];

				if (row[i] == 0)
					row[i] = num;

				else if (num < row[i])
					row[i] = num;

				if (num > col[j])
					col[j] = num;
			}
		}

//		System.out.println("Row: " + Arrays.toString(row));
//		System.out.println("Column: " + Arrays.toString(col));

		HashSet<Integer> unique = new HashSet<Integer>();

		for (int num : row) {
			unique.add(num);
		}

		for (int num : col) {
			if (unique.contains(num))
				list.add(num);
		}

		return list;
	}
}
