package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestFibonacciSubsequence {
	public static void main(String[] args) {
		System.out.println(lenLongestFibSubseq(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 }));
	}

	public static int lenLongestFibSubseq(int[] arr) {
		int max = 0;
		int n = arr.length;

		Set<Integer> set = new HashSet<Integer>();

		for (int num : arr)
			set.add(num);

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int a = arr[i], b = arr[j], l = 2;
				while (set.contains(a + b)) {
					b = a + b;
					a = b - a;
					l++;
				}
				if (l == 2)
					continue;

				max = Math.max(max, l);
			}
		}

		return max;
	}
}
