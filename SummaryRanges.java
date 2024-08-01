package leetcode;

import java.util.*;

public class SummaryRanges {
	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 4, 5, 7 };
//		int[] arr = {0,2,3,4,6,8,9};

		System.out.println(summaryRanges(arr));
	}

	public static List<String> summaryRanges(int[] nums) {

		if (nums.length == 0)
			return new ArrayList<String>();

		List<String> list = new ArrayList<>();
		int start = nums[0];
		int end = nums[0];
		int ind = 0;

		while (ind < nums.length) {

			if (nums[ind] == end) {
				end++;
			} 
			else {

				if (start == end - 1) {
					list.add(Integer.toString(start));
					start = nums[ind];
					end = nums[ind];
					end++;
				}
				else {
					StringBuilder sb = new StringBuilder();
					sb.append(start);
					sb.append("->");
					sb.append(end - 1);
					
					System.out.println("Before change:");
					System.out.println(start);
					System.out.println(end);

					list.add(sb.toString());
					start = nums[ind];
					end = nums[ind];
					
					System.out.println("After change:");
					System.out.println(start);
					System.out.println(end);
					end++;
				}
			}
			ind++;

		}
		
		if (start == end - 1) {
			list.add(Integer.toString(start));
			
		}
		else {
			StringBuilder sb = new StringBuilder();
			sb.append(start);
			sb.append("->");
			sb.append(end - 1);

			list.add(sb.toString());

		}

		return list;

	}
}
