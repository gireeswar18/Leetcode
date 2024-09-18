package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {
	public static void main(String[] args) {

		int[] nums = {3,30,34,5,9};
		
		System.out.println(largestNumber(nums));
		
	}

	public static String largestNumber(int[] nums) {

		int len = nums.length;
		
		String[] arr = new String[len];
		
		for (int i = 0; i < len; i++) {
			arr[i] = String.valueOf(nums[i]);
		}
		
		Arrays.sort(arr, new Comparator<String>() {
			
			@Override
			public int compare(String a, String b) {
//				System.out.println("a: " + a + " b: " + b);
//				System.out.println(b + a);
//				System.out.println(a + b);
//
//				System.out.println((b + a).compareTo(a + b));
//				System.out.println("---------------");
				return (b + a).compareTo(a + b);
			}
			
		});
				
		if (arr[0].charAt(0) == '0') return "0";
		
		StringBuilder sb = new StringBuilder();
		
		for (String str : arr)
			sb.append(str);
		
		return sb.toString();
	}
}
