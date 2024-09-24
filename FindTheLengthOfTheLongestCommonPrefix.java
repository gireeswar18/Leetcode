package leetcode;

import java.util.HashSet;

public class FindTheLengthOfTheLongestCommonPrefix {
	public static void main(String[] args) {

		int[] arr1 = {1,10,100};
		int[] arr2 = {1000};
		
		System.out.println(longestCommonPrefix(arr1, arr2));
		
	}

	public static int longestCommonPrefix(int[] arr1, int[] arr2) {
		
		HashSet<Integer> set = new HashSet<>();
		
		int res = 0;
		
		
		for (int num : arr1) {
			
			while (num != 0) {
				if (!set.add(num))
					break;
				num /= 10;
			}	
		}
		
		System.out.println(set);
		
		for (int num : arr2) {
			
			while (num != 0) {
				if (set.contains(num)) {
					res = Math.max(res, Integer.toString(num).length());
					break;
				}
				
				num /= 10;
			}
			
		}
		
		
		return res;
		
	}
}
