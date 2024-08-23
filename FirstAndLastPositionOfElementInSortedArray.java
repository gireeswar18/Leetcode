package leetcode;

import java.util.Arrays;

public class FirstAndLastPositionOfElementInSortedArray {
	public static void main(String[] args) {

		int[] arr = { 5, 7, 7, 8, 10 };
		int target = 8;
		
		System.out.println(Arrays.toString(searchRange(arr, target)));

	}

	public static int[] searchRange(int[] arr, int target) {

        if (arr.length == 0) return new int[]{-1, -1};

		int s = 0;
		int e = arr.length - 1;
		
		int firstPos = -1;
		int lastPos = -1;
		
		while (s < e) {
			
			int mid = (s + e) / 2;
			
			if (arr[mid] == target)
				e = mid;
			else if (arr[mid] < target)
				s = mid + 1;
			else
				e = mid - 1;
			
		}
				
		if (arr[s] != target) {
			return new int[] {-1, -1};
		}
		
		firstPos = s;
		
		s = 0;
		e = arr.length - 1;
		
		while (s < e) {
			
			int mid = ((s + e) / 2) + 1;
			
			if (arr[mid] == target)
				s = mid;
			else if (arr[mid] < target)
				s = mid + 1;
			else
				e = mid - 1;
			
		}
		
		lastPos = s;
		
		return new int[] {firstPos, lastPos};
		
	}
}
