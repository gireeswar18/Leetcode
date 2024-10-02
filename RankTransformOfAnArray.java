package leetcode;

import java.util.*;

public class RankTransformOfAnArray {
	public static void main(String[] args) {
		int[] arr = {40, 10, 20, 30};
		
		System.out.println(Arrays.toString(arrayRankTransform(arr)));
	}

	public static int[] arrayRankTransform(int[] arr) {
		if (arr.length == 0)
			return arr;
		
		int[] temp = arr.clone();
		Arrays.sort(temp);
		
		Map<Integer, Integer> map = new HashMap<>(arr.length);
		
		int rank = 1;
		int prev = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (temp[i] == prev)
				continue;
			
			map.put(temp[i], rank++);
            prev = temp[i];
		}
		
		
		for (int i = 0; i < arr.length; i++)
			arr[i] = map.get(arr[i]);
		
		return arr;
	}
}
