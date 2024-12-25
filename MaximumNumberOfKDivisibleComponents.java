package leetcode;

import java.util.*;

public class MaximumNumberOfKDivisibleComponents {
	public static void main(String[] args) {
		System.out.println(maxKDivisibleComponents(5, new int[][] { { 0, 2 }, { 1, 2 }, { 1, 3 }, { 2, 4 } },
				new int[] { 1, 8, 1, 4, 4 }, 6));
	}

	
	static int connectedComponents = 0;
	
	public static int dfs(List<List<Integer>> adjList, int[] values,
			int k, int curr, int parent) {
		int currSum = values[curr];
		
		for (int child : adjList.get(curr)) {
			if (child != parent) {
				currSum += dfs(adjList, values, k, child, curr);
			}
		}
		
		currSum %= k;
		if (currSum == 0) {
			connectedComponents++;
		}
		
		return currSum;
	}

	public static int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
		connectedComponents = 0;

		List<List<Integer>> adjList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());
		}

		for (int[] edge : edges) {
			adjList.get(edge[0]).add(edge[1]);
			adjList.get(edge[1]).add(edge[0]);
		}

		dfs(adjList, values, k, 0, -1);

		return connectedComponents;
	}
}
