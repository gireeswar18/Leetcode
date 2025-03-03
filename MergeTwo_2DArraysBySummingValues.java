package leetcode;

import java.util.*;

public class MergeTwo_2DArraysBySummingValues {
	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 2, 3 }, { 4, 5 } };
		int[][] b = { { 1, 4 }, { 3, 2 }, { 4, 1 } };

		for (int[] x : mergeArrays(a, b)) {
			System.out.println(Arrays.toString(x));
		}
	}

	public static int[][] mergeArrays(int[][] a, int[][] b) {
//		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
//				
//		for (int[] x : nums1) {
//			map.put(x[0], x[1]);
//		}
//		for (int[] x : nums2) {
//			map.put(x[0], map.getOrDefault(x[0], 0) + x[1]);
//		}
//		int[][] res = new int[map.size()][2]; 
//		int ind = 0;
//		
//		for (Integer id : map.keySet()) {
//			res[ind][0] = id;
//			res[ind][1] = map.get(id);
//			ind++;
//		}
//		
//		return res;

		int i = 0, j = 0;
		int m = a.length, n = b.length;

		List<int[]> list = new ArrayList<>();

		while (i < m && j < n) {

			if (a[i][0] == b[j][0]) {
				list.add(new int[] { a[i][0], a[i][1] + b[j][1] });
				i++;
				j++;
			} 
			else if (a[i][0] < b[j][0]) {
				list.add(a[i]);
				i++;
			}
			else {
				list.add(b[j]);
				j++;
			}
		}
		
		while (i < m) {
			list.add(a[i++]);
		}
		while (j < n) {
			list.add(b[j++]);
		}
		
		return list.toArray(new int[list.size()][2]);

	}
}
