package leetcode;

import java.util.*;

public class CombinationSum {
	public static void main(String[] args) {
		int[] arr = {2, 3, 6, 7};
		int t = 7;
		
		System.out.println(combinationSum(arr, t));
	}

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		
		List<List<Integer>> res = new ArrayList<>();
		findCombination(candidates, target, 0, res, new ArrayList<>());
		
		return res;
	}
	
	public static void findCombination(int[] arr, int target, int ind, List<List<Integer>> res, List<Integer> ds) {
		
		if (target == 0) {
			res.add(new ArrayList<>(ds));
			return;
		}
		
		if (ind == arr.length) {
			if (target == 0) {
				res.add(new ArrayList<>(ds));
			}
			return;
		}
		
		if (target - arr[ind] >= 0) {
			ds.add(arr[ind]);
			findCombination(arr, target - arr[ind], ind, res, ds);
			ds.removeLast();
		}
		findCombination(arr, target, ind + 1, res, ds);
	}
}
