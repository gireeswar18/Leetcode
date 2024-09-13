package leetcode;

import java.util.Arrays;

public class XORQueriesOfASubarray {
	public static void main(String[] args) {
		int[] arr = {4,8,2,10};
		int[][] q = {{2,3}, {1, 3}, {0, 0}, {0, 3}};
		
		System.out.println(Arrays.toString(xorQueries(arr, q)));
	}

	public static int[] xorQueries(int[] arr, int[][] queries) {
		
		int[] res = new int[queries.length];
		
		int[] prefix = new int[arr.length];
		
		prefix[0] = arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			prefix[i] = prefix[i - 1] ^ arr[i];
		}
		
		int ind = 0;
		
		for (int[] query : queries) {
			
			if (query[0] == 0) {
				res[ind++] = prefix[query[1]];
			}
			else { 
				res[ind++] = prefix[query[0] - 1] ^ prefix[query[1]];
			}
		}
		
		return res;
		
	}
}
