package leetcode;

import java.util.*;

public class Permutations {
	public static void main(String[] args) {
		
		int[] nums = {1, 2, 3};
		
		System.out.println(permute(nums));
		
	}

	static List<List<Integer>> res = new ArrayList<>();
	
	public static List<List<Integer>> permute(int[] nums) {
			
		
		makePermutations(nums, 0);
		
		return res;
		
	}
	
	public static void makePermutations(int[] arr, int low) {
		
		if (low == arr.length) {
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < arr.length; i++) {
				list.add(arr[i]);
			}
			res.add(list);
			return;
		}
		
		for (int i = low; i < arr.length; i++) {
									
			swap(arr, low, i);
			
			makePermutations(arr, low + 1);
			
			swap(arr, low, i);			
		}
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	
}
