package leetcode;

import java.util.Arrays;

public class CountTheNumberOfFairPairs {
	public static void main(String[] args) {
		int[] t1 = { 0, 1, 7, 4, 4, 5 };
		System.out.println(countFairPairs(t1, 3, 6));

		int[] t2 = { 1, 7, 9, 2, 5 };
		System.out.println(countFairPairs(t2, 11, 11));
	}

	public static long countFairPairs(int[] nums, int lower, int upper) {
		Arrays.sort(nums);
		
		return countLessThanThis(nums, upper + 1) - countLessThanThis(nums, lower);

	}
	
	public static long countLessThanThis(int[] arr, int bound) {
		int i = 0, j = arr.length - 1;
		long res = 0;
		
		while (i < j) {
			if (arr[i] + arr[j] >= bound) {
				j--;
			}
			else {
				res += j - i;
				i++;
			}
		}
		
		return res;
	}
}
