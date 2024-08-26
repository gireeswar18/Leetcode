package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
	public static void main(String[] args) {

		int[][] intervals = { { 1, 3 }, { 8, 10 }, { 2, 6 }, { 15, 18 } };

		int[][] res = merge(intervals);

		for (int[] arr : res) {
			System.out.println(Arrays.toString(arr));
		}

	}

	public static int[][] merge(int[][] intervals) {
				
		Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
		
		List<int[]> list = new ArrayList<>();
		
		int[] prev = intervals[0];
		
		for (int i = 1; i < intervals.length; i++) {
			
			int[] arr = intervals[i];
			if (arr[0] <= prev[1]) {
				prev[1] = Math.max(prev[1], arr[1]);
			}
			else {
				list.add(prev);
				prev = arr;
			}
			
		}
		
		list.add(prev);
		
		return list.toArray(new int[list.size()][2]);
		
	}
	
}
