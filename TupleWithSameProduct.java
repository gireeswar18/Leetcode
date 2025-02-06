package leetcode;

import java.util.*;

public class TupleWithSameProduct {

	public static void main(String[] args) {
		System.out.println(tupleSameProduct(new int[] { 2, 3, 4, 6 }));
		System.out.println(tupleSameProduct(new int[] { 1, 2, 4, 5, 10 }));
		System.out.println(tupleSameProduct(new int[] { 2, 3, 4, 6, 8, 12 }));
	}

	public static int tupleSameProduct(int[] nums) {
		Map<Integer, Integer> map = new HashMap<>();
		
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				int p = nums[i] * nums[j];
				map.put(p, map.getOrDefault(p, 0) + 1);
			}
		}

		int cnt = 0;

		for (int num : map.values()) {
			if (num / 2 >= 2) {
				int x = num / 2;
				cnt += x * (x - 1) / 2;
			}
		}

		return cnt * 8;
	}
}
