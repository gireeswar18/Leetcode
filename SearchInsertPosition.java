package leetcode;

import java.util.Scanner;

public class SearchInsertPosition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt();
		
		System.out.println(searchInsert(arr, target));

		sc.close();
	}

	public static int searchInsert(int[] nums, int target) {

		int start = 0;
		int end = nums.length - 1;
		
		if (nums[end] < target)
		{
			return end + 1;
		}

		while (start <= end) {
			int mid = (start + end) / 2;

			if (nums[mid] == target) {
				return mid;
			} 
			else if (nums[mid] > target) {
				end = mid - 1;
				
			} 
			else if (nums[mid] < target) {
				start = mid + 1;
			}
		}

		return start;
	}
}
