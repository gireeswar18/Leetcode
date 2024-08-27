package leetcode;

import java.util.*;

public class NumberOfGoodPairs {
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3 };

		System.out.println(numIdenticalPairs(arr));

	}

	public static int numIdenticalPairs(int[] nums) {

		Map<Integer, Integer> freq = new HashMap<>();

		int pairs = 0;

		for (int num : nums) {

			if (freq.containsKey(num)) {
				pairs += freq.get(num);
				freq.put(num, freq.get(num) + 1);
			} 
			else {
				freq.put(num, 1);
			}

		}

		return pairs;

	}
}
