package leetcode;

import java.util.*;

public class CombinationSumII {
	public static void main(String[] args) {
		int[] c = {2, 5, 2, 1, 2};
		int t = 5;
		
		System.out.println(combinationSum2(c, t));
	}

	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		
		List<List<Integer>> res = new ArrayList<>();
		
		findCombination(candidates, 0, target, res, new ArrayList<>());
		
		return res;
	}
	
	public static void findCombination(int[] arr, int ind, int target, List<List<Integer>> res, List<Integer> ds) {
		
		if (target == 0) {
			res.add(new ArrayList<>(ds));
			return;
		}
		
		for (int i = ind; i < arr.length; i++) {
			if (i != ind && arr[i] == arr[i - 1])
				continue;
			if (arr[i] > target)
				break;
			
			ds.add(arr[i]);
			findCombination(arr, i + 1, target - arr[i], res, ds);
			ds.remove(ds.size() - 1);
		}
		
	}
}
