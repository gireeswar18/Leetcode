package leetcode;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfBadPairs {
	public static void main(String[] args) {
		System.out.println(countBadPairs(new int[] { 4, 1, 3, 3 }));
		System.out.println(countBadPairs(new int[] { 1, 2, 3, 4, 5 }));
	}

	public static long countBadPairs(int[] nums) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		long cnt = 0;
		int n = nums.length;
		
		map.put(nums[0], 1);
		
		for (int i = 1; i < n; i++) {
			int key = nums[i] - i;
			
			if (map.containsKey(key)) {
				cnt += i - map.get(key);
			}
			else {
				cnt += i;
			}
			
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		return cnt;
	}
}
