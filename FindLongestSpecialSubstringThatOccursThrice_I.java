package leetcode;

import java.util.*;

public class FindLongestSpecialSubstringThatOccursThrice_I {
	public static void main(String[] args) {
		System.out.println(maximumLength2("aaaa"));
		System.out.println(maximumLength2("abcabca"));
		System.out.println(maximumLength2("abcdef"));
		System.out.println(maximumLength2("cccerrrecdcdccedecdcccddeeeddcdcddedccdceeedccecde"));
	}

	public static int maximumLength(String s) {
		int max = -1;
		int n = s.length();
		Map<String, Integer> map = new HashMap<>();
		char[] str = s.toCharArray();
		
		int[][] dp = new int[n][n];
		
		for (int subLen = 1; subLen <= n; subLen++) {
			for (int st = 0; st <= n - subLen; st++) {
				
				String sub = s.substring(st, st + subLen);
				
				if (subLen == 1) {
					dp[st][st] = 1;
					map.put(sub, map.getOrDefault(sub, 0) + 1);
					
					if (map.get(sub) >= 3)
						max = Math.max(max, subLen);
					
				}
				else {
					int ind = st + subLen - 1;
					if (dp[st][ind - 1] == 1 && str[ind - 1] == str[ind]) {
						dp[st][ind] = 1;
						map.put(sub, map.getOrDefault(sub, 0) + 1);
						if (map.get(sub) >= 3)
							max = Math.max(max, subLen);
					}
				}
				
				
			}
		}
		
		return max;
	}
	public static int maximumLength2(String s) {
		int max = -1;
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = i; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					String sub = s.substring(i, j + 1);
					map.put(sub, map.getOrDefault(sub, 0) + 1);
				}
				else {
					break;
				}
			}
		}
		
		for (String key : map.keySet()) {
			if (map.get(key) >= 3) {
				max = Math.max(max, key.length());
			}
		}

		return max;
	}
}
