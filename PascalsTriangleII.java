package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
	public static void main(String[] args) {

		System.out.println(getRow(30));

	}

	public static List<Integer> getRow(int rowIndex) {

		List<Integer> res = new ArrayList<Integer>();

		int i = rowIndex;

		long n = 1L;

		for (int j = 0; j <= i; j++) {

			res.add((int) n);

			n = n * (i - j) / (j + 1);
							
		}

		return res;

	}
}
