package leetcode;

import java.util.*;

public class InsertInterval {
	public static void main(String[] args) {

//		int[][] arr = { { 1, 3 }, { 6, 9 } };
//		int[] n = { 2, 5 };
		
		int[][] arr = {{1,2},{3,5},{6,7},{8,10},{12,16}}; 
		int[] n = {4, 8};

		for (int[] x : insert(arr, n)) {
			System.out.println(Arrays.toString(x));
		}

	}

	public static int[][] insert(int[][] intervals, int[] newInterval) {

		List<int[]> list = new ArrayList<>();
		boolean added = false;

		for (int[] x : intervals) {

			if (!added && x[0] >= newInterval[0]) {
				list.add(newInterval);
				added = true;
			}

			list.add(x);
		}

		if (!added)
			list.add(newInterval);

		List<int[]> res = new ArrayList<>();
		res.add(list.get(0));
		
		int[] prev = res.get(0);
		int ind = 0;
		
		for (int i = 1; i < list.size(); i++) {
			int[] curr = list.get(i);
			
			if (prev[1] >= curr[0]) {
				prev[1] = Math.max(prev[1], curr[1]);
				res.set(ind, prev); 
			}
			else {
				res.add(curr);
				prev = curr;
				ind++;
			}
			
		}
		
		return res.toArray(new int[res.size()][2]);

	}
}