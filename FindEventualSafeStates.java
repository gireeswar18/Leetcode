package leetcode;

import java.util.*;

public class FindEventualSafeStates {
	public static void main(String[] args) {
		int[][] t1 = { { 1, 2 }, { 2, 3 }, { 5 }, { 0 }, { 5 }, {}, {} };
		System.out.println(eventualSafeNodes(t1));

		int[][] t2 = { { 1, 2, 3, 4 }, { 1, 2 }, { 3, 4 }, { 0, 4 }, {} };
		System.out.println(eventualSafeNodes(t2));
	}

	public static List<Integer> eventualSafeNodes(int[][] graph) {

		int n = graph.length;
		int[] currState = new int[n];
		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (dfs(i, currState, graph)) {
				res.add(i);
			}
		}

		return res;
	}

	public static boolean dfs(int curr, int[] currState, int[][] graph) {
		if (currState[curr] != 0) {
			return currState[curr] == 2;
		}

		currState[curr] = 1;
		for (int edge : graph[curr]) {
			if (!dfs(edge, currState, graph)) {
				return false;
			}
		}
		
		currState[curr] = 2;

		return true;
	}
}
