package leetcode;

import java.util.*;

public class CourseSchedule_IV {

	public static void main(String[] args) {

		CourseSchedule_IV ob = new CourseSchedule_IV();
		int[][] pre = { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 4 } };
		int[][] q = { { 0, 4 }, { 4, 0 }, { 1, 3 }, { 3, 0 } };

		System.out.println(ob.checkIfPrerequisite(5, pre, q));

	}

	public HashSet<Integer> dfs(Map<Integer, HashSet<Integer>> preMap, List<List<Integer>> adjList, int curr) {

		if (!preMap.containsKey(curr)) {

			preMap.put(curr, new HashSet<Integer>());
			for (int req : adjList.get(curr)) {
				HashSet<Integer> ret = dfs(preMap, adjList, req);

				for (int v : ret) {
					preMap.get(curr).add(v);
				}
				preMap.get(curr).add(req);
			}
		}
		return preMap.get(curr);

	}

	public List<Boolean> checkIfPrerequisite(int n, int[][] pre, int[][] queries) {

		List<Boolean> res = new ArrayList<>();
		List<List<Integer>> adjList = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<Integer>());
		}

		for (int[] p : pre) {
			adjList.get(p[1]).add(p[0]);
		}

		Map<Integer, HashSet<Integer>> preMap = new HashMap<>();

		for (int i = 0; i < n; i++) {
			dfs(preMap, adjList, i);
		}

		for (int[] q : queries) {
			res.add(preMap.get(q[1]).contains(q[0]));
		}
		return res;

	}
}
