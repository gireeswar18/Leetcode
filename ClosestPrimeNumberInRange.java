package leetcode;

import java.util.*;

public class ClosestPrimeNumberInRange {
	public static void main(String[] args) {
		System.out.println(Arrays.toString(closestPrimes(10, 19)));
	}

	public static int[] closestPrimes(int left, int right) {
		boolean[] prime = new boolean[right + 1];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;

		for (int i = 2; i * i <= right; i++) {
			if (prime[i]) {
				for (int j = i * i; j <= right; j += i) {
					prime[j] = false;
				}
			}
		}

		List<Integer> list = new ArrayList<>();
		for (int i = left; i <= right; i++) {
			if (prime[i]) {
				list.add(i);
			}
		}

		int min = Integer.MAX_VALUE;
		int[] res = { -1, -1 };

		if (list.size() < 2)
			return res;

		for (int i = 1; i < list.size(); i++) {
			if (list.get(i) - list.get(i - 1) < min) {
				min = list.get(i) - list.get(i - 1);
				res[0] = list.get(i - 1);
				res[1] = list.get(i);
			}
		}
		return res;
	}

}
