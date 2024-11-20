package leetcode;

import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = {2, 7, 11, 15};
		
		System.out.println(Arrays.toString(twoSum(arr, 9)));
	}
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
        	
        	int compl = target - nums[i];
        	
        	if (map.containsKey(compl)) {
        		return new int[] {map.get(compl), i};
        	}
        	
        	map.put(nums[i], i);
        	
        }
        
        return new int[] {};
    }
}
