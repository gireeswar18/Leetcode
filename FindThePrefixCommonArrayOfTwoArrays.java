package leetcode;

import java.util.Arrays;

public class FindThePrefixCommonArrayOfTwoArrays {
	public static void main(String[] args) {
		int[] a = { 1, 3, 2, 4 };
		int[] b = { 3, 1, 2, 4 };
		System.out.println(Arrays.toString(findThePrefixCommonArray(a, b)));
	}

	public static int[] findThePrefixCommonArray(int[] A, int[] B) {
		int n = A.length;
		int[] res = new int[n];
		int[] freq = new int[n + 1];
		int same = 0;

		for (int i = 0; i < n; i++) {
			if (++freq[A[i]] == 2) same++;
			if (++freq[B[i]] == 2) same++;
			
			res[i] = same;
		}

		return res;
	}
}
