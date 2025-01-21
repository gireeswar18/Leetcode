package leetcode;

public class MinimumLengthOfStringAfterOperations {
	public static void main(String[] args) {
		System.out.println(minimumLength("abaacbcbb"));
		System.out.println(minimumLength("aa"));
	}

	public static int minimumLength(String s) {
		int[] arr = new int[26];
		
		int res = 0;
		
		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (arr[i] == 0) continue;
			if (arr[i] % 2 == 0) {
				res += 2;
			}
			else {
				res += 1;
			}
		}
		
		return res;
		
	}
}
