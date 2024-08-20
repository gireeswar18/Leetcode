package leetcode;

import java.util.HashMap;

public class SubarraySumEqualsK {
	public static void main(String[] args) {
		int[] nums = {1, 1, 1, 1};
		
		System.out.println(subarraySum(nums, 2));
	}

	public static int subarraySum(int[] nums, int k) {
		
		HashMap<Integer, Integer> prefixSumMap = new HashMap<>();
		
		int prefixSum = 0;
		int res = 0;
		
		// is sum - k becomes 0 then we have found one, so sum is 0 and add 1
		prefixSumMap.put(0, 1);
		
		for (int i = 0; i < nums.length; i++) {
			
			prefixSum += nums[i];
			
			System.out.println("Prefix sum: " + prefixSum);
			
			if (prefixSumMap.containsKey(prefixSum - k)) {
				
				System.out.println("Contains? " + (prefixSum - k));
				res += prefixSumMap.get(prefixSum - k);
				
				System.out.println("Res: " + res);
				
			}
			
			prefixSumMap.put(prefixSum, prefixSumMap.getOrDefault(prefixSum, 0) + 1);
			
			System.out.println("Map: " + prefixSumMap);
			
		}
		
		return res;
		
	}
}
