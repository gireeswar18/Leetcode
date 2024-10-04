package leetcode;

import java.util.*;

public class Subsets {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		System.out.println(subsets(arr));
	}

	public static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		
		makeSubset(nums, 0, res, new ArrayList<>());
		
		return res;
	}
	
	public static void makeSubset(int[] arr, int ind, List<List<Integer>> res, List<Integer> ds) {
		if (ind == arr.length) {
			res.add(new ArrayList<>(ds));
			return;
		}
		
		ds.add(arr[ind]);
		makeSubset(arr, ind + 1, res, ds);
		ds.removeLast();
		makeSubset(arr, ind + 1, res, ds);
	}
}
