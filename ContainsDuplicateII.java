package leetcode;

import java.util.HashMap;

public class ContainsDuplicateII {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1,2,3};
		int k = 2;
		
		System.out.println(containsNearbyDuplicate(nums, k));
	}

	public static boolean containsNearbyDuplicate(int[] arr, int k) {
		
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (map.containsKey(arr[i])) {
				if (Math.abs(map.get(arr[i]) - i) <= k)
					return true;
				else {
					map.put(arr[i], i);
				}
			}
			else {
				map.put(arr[i], i);
			}
			
		}
		
		return false;
		
	}
}
