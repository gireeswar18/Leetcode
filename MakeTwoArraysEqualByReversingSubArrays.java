package leetcode;

import java.util.*;

public class MakeTwoArraysEqualByReversingSubArrays {
	public static void main(String[] args) {

		int[] target = { 1, 2, 3, 4 };
		int[] arr = { 2, 4, 1 };

		System.out.println(canBeEqual(target, arr));

	}

	public static boolean canBeEqual(int[] target, int[] arr) {

//		Map<Integer, Integer> freq = new HashMap<>();
//		
//		for (int i = 0; i < arr.length; i++) {
//			
//			freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
//			
//		}
//		
//		for (int i = 0; i < target.length; i++) {
//			
//			if (freq.containsKey(target[i]) && freq.get(target[i]) != 0) {
//				freq.put(target[i], freq.get(target[i]) - 1);
//			}
//			else {
//				return false;
//			}
//			
//		}
//		
//		return true;

		int[] freq = new int[1001];

		for (int i = 0; i < arr.length; i++) {

			freq[arr[i]]++;

		}

		for (int i = 0; i < target.length; i++) {

			if (freq[target[i]] == 0) {
				return false;
			}
			else {
				freq[target[i]]--;
			}

		}
		
		return true;

	}
}
