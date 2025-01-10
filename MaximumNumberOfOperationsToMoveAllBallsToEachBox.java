package leetcode;

import java.util.Arrays;

public class MaximumNumberOfOperationsToMoveAllBallsToEachBox {
	public static void main(String[] args) {

		System.out.println(Arrays.toString(minOperations("110")));
		System.out.println(Arrays.toString(minOperations("001011")));
	}

	public static int[] minOperations(String boxes) {
		int n = boxes.length();
		int[] res = new int[n];

		char[] arr = boxes.toCharArray();

		int moves = 0;
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			res[i] = moves + cnt;
			moves = moves + cnt;
			cnt += arr[i] - '0';
		}

		moves = 0;
		cnt = 0;

		for (int i = n - 1; i >= 0; i--) {
			res[i] += moves + cnt;
			moves = moves + cnt;
			cnt += arr[i] - '0';
		}

		return res;
	}
}
