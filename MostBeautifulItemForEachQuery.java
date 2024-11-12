package leetcode;

import java.util.*;

public class MostBeautifulItemForEachQuery {
	public static void main(String[] args) {
		int[][] items = { { 1, 2 }, { 3, 2 }, { 2, 4 }, { 5, 6 }, { 3, 5 } };

		int[] queries = { 1, 2, 3, 4, 5, 6 };

		System.out.println(Arrays.toString(maximumBeauty(items, queries)));
	}

	public static int[] maximumBeauty(int[][] items, int[] queries) {
		Arrays.sort(items, (a,b) -> a[0] - b[0]);
		
		int[] res = new int[queries.length];
		
		int[] maxBeauty = new int[items.length];
		maxBeauty[0] = items[0][1];
		
		// Calculating maximum beauty until the current index
		for (int i = 1; i < maxBeauty.length; i++) {
			maxBeauty[i] = Math.max(maxBeauty[i - 1], items[i][1]);;
		}
		
		// Searching for maximum beauty
		for (int i = 0; i < queries.length; i++) {
			res[i] = binarySearch(items, queries[i], maxBeauty);
		}
		
		return res;
	}
	
	public static int binarySearch(int[][] arr, int q, int[] maxBeauty) {
		int left = 0, right = arr.length - 1;
		
		int max = 0;
		
		while (left <= right) {
			int mid = (left + right) / 2;
			
			if (arr[mid][0] <= q) {
				max = maxBeauty[mid]; // copying the maximum beauty of the items[mid][0] element
				left = mid + 1;
			}
			else {
				right = mid - 1;
			}
		}
		
		return max;
	}
}
