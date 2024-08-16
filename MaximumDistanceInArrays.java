package leetcode;

import java.util.*;

public class MaximumDistanceInArrays {
	public static void main(String[] args) {

		List<List<Integer>> arrays = new ArrayList<>();

//		arrays.add(Arrays.asList(1, 2, 3));
//		arrays.add(Arrays.asList(4, 5));
//		arrays.add(Arrays.asList(1, 2, 3));
//		
//		arrays.add(Arrays.asList(1, 4));
//		arrays.add(Arrays.asList(0, 5));
		
		arrays.add(Arrays.asList(1, 2, 8));
		arrays.add(Arrays.asList(4, 5));
		arrays.add(Arrays.asList(0));


		System.out.println(maxDistance(arrays));
	}

	public static int maxDistance(List<List<Integer>> arrays) {
		
		int len = arrays.size();
		
		int res = Integer.MIN_VALUE;
		
		int min = arrays.get(0).getFirst();
		int max = arrays.get(0).getLast();
				
		for (int i = 1; i < len; i++) {
			
			res = Math.max(res, Math.abs(arrays.get(i).get(0) - max));
			res = Math.max(res, Math.abs(arrays.get(i).getLast() - min));
			
			min = Math.min(min, arrays.get(i).get(0));
			max = Math.max(max, arrays.get(i).getLast());
			
		}
		return res;
	}
}
