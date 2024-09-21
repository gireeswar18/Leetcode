package leetcode;

import java.util.*;

public class LexicographicalNumbers {
	public static void main(String[] args) {
		
		int n = 13;
		
		System.out.println(lexicalOrder(n));
	}

	public static List<Integer> lexicalOrder(int n) {
		
		List<Integer> res = new ArrayList<>();
		
		for (int i = 1; i < 10; i++) {
			
			dfs(res, i, n);
			
		}
		
		return res;
	}
	
	public static void dfs(List<Integer> res, int digit, int n) {
		
		if (digit > n) return;
		
		res.add(digit);
		for (int i = 0; i < 10; i++) {
			
			if (digit * 10 + i > n)
				return;
			
			dfs(res, digit * 10 + i, n);
			
		}
		
	}
}
