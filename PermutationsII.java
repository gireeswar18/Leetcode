package leetcode;

import java.util.*;

public class PermutationsII {
	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		
		System.out.println(permuteUnique(nums));
	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
		
		List<List<Integer>> res = new ArrayList<>();
		Arrays.sort(nums);
		makePermutation(nums, res, new ArrayList<>(), new boolean[nums.length]);
		return res;
	}
	
	public static void makePermutation(int[] arr, List<List<Integer>> res, ArrayList<Integer> ds, boolean[] visited) {
		
		if (ds.size() == arr.length) {
			res.add(new ArrayList<>(ds));
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (visited[i] || i != 0 && arr[i] == arr[i - 1] && !visited[i - 1]) continue;
			
			ds.add(arr[i]);
			visited[i] = true;
			makePermutation(arr, res, ds, visited);
			
			visited[i] = false;
			ds.remove(ds.size() - 1);
		}

	}
	
}
