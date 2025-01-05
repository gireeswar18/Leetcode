package leetcode;

import java.util.*;

public class UniqueLength3_PalindromicSubsequences {
	public static void main(String[] args) {
		System.out.println(countPalindromicSubsequence("aabca"));
		System.out.println(countPalindromicSubsequence("adc"));
		System.out.println(countPalindromicSubsequence("bbcbaba"));
		System.out.println(countPalindromicSubsequence("aaaaaaaaaaa"));
	}

	public static int countPalindromicSubsequence(String s) {
		int cnt = 0;
		int[][] map = new int[26][2];
		char[] arr = s.toCharArray();

		for (int i = 0; i < 26; i++) {
			map[i][0] = Integer.MAX_VALUE;
		}

		for (int i = 0; i < arr.length; i++) {
			int curr = arr[i] - 'a';
			map[curr][0] = Math.min(map[curr][0], i);
			map[curr][1] = i;
		}

		for (int i = 0; i < 26; i++) {
			if (map[i][0] < map[i][1]) {
				Set<Character> set = new HashSet<>();
				for (int j = map[i][0] + 1; j < map[i][1]; j++) {
					set.add(arr[j]);
				}
				cnt += set.size();
			}
		}

		return cnt;
	}
}
