package leetcode;

import java.util.*;

public class FlipColumnsForMaximumNumberOfEqualRows {
	public static void main(String[] args) {
		int[][] t1 = { { 0, 1 }, { 1, 0 } };
		System.out.println(maxEqualRowsAfterFlips(t1));
	}

	public static int maxEqualRowsAfterFlips(int[][] matrix) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int[] row : matrix) {
			StringBuilder withoutFlip = new StringBuilder();
			StringBuilder withFlip = new StringBuilder();
			
			for (int val : row) {
				withoutFlip.append(val);
				withFlip.append(1 - val);
			}
			
			String s1 = withoutFlip.toString();
			String s2 = withFlip.toString();
			
			map.put(s1, map.getOrDefault(s1, 0) + 1);
			map.put(s2, map.getOrDefault(s2, 0) + 1);
		}
		
		int max = Integer.MIN_VALUE;
		
		for (int val : map.values()) {
			max = Math.max(max, val);
		}
		
		return max;
	}
}
