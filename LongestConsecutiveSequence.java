package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	public static void main(String[] args) {
		
		int[] arr = {0,3,7,2,5,8,4,6,0,1};
		
		System.out.println(longestConsecutive(arr));
		
	}

	public static int longestConsecutive(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		
		for (int num : nums)
			set.add(num);
		
		int longLen = 0;
		
		for (int num : nums) {
			
			int count = 0;
			if (!set.contains(num - 1)) {
				
				while (set.contains(num)) {
					count++;
					num++;
				}
				if (longLen < count)
					longLen = count;
			}
				
		}
		
		return longLen;
		
	}
}
