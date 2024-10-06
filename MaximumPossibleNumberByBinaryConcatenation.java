package leetcode;

import java.util.*;

public class MaximumPossibleNumberByBinaryConcatenation {
	public static void main(String[] args) {
		int[] arr = {1, 11, 5};
		System.out.println(maxGoodNumber(arr));
	}

	public static int maxGoodNumber(int[] nums) {
		
		String arr[] = new String[3];
		for (int i = 0; i < 3; i++)
			arr[i] = binary(nums[i]);
		
		
		Arrays.sort(arr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2 + s1).compareTo(s1 + s2);
			}
		});
		
		StringBuilder res = new StringBuilder();
		
		for (String x : arr)
			res.append(x);
		
		return Integer.parseInt(res.toString(), 2);
	}
	
	public static String binary(int num) {
		StringBuilder res = new StringBuilder();
		
		while (num != 0) {
			res.insert(0, num % 2);
			num /= 2;
		}
						
		return res.toString();
	}
}
