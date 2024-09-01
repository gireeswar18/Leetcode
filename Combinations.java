package leetcode;

import java.util.*;

public class Combinations {
	public static void main(String[] args) {
		int n = 4;
		int k = 1;
		
		System.out.println(combine(n, k));
	}

	
	public static List<List<Integer>> combine(int n, int k) {
		
		List<List<Integer>> res = new ArrayList<>();
		
		createCombination(n, k, 1, new ArrayList<Integer>(), res);
		
		return res;
	}
	
	public static void createCombination(int n, int k, int curr, List<Integer> list, List<List<Integer>> res) {
		
		if (list.size() == k) {

			res.add(new ArrayList<Integer>(list));
			return;
		}
		
		for (int i = curr; i <= n; i++) {

			list.add(i);
			
			createCombination(n, k, i + 1, list, res);
			
			list.remove(list.size() - 1);
		}
		
	}
}
