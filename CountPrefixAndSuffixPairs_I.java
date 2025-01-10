package leetcode;

public class CountPrefixAndSuffixPairs_I {
	public static void main(String[] args) {
		String[] t1 = { "a", "aba", "ababa", "aa" };
		System.out.println(countPrefixSuffixPairs(t1));

		String[] t2 = { "pa", "papa", "ma", "mama" };
		System.out.println(countPrefixSuffixPairs(t2));

		String[] t3 = { "abab", "ab" };
		System.out.println(countPrefixSuffixPairs(t3));
	}

	public static int countPrefixSuffixPairs(String[] words) {
		int cnt = 0;
		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
					cnt++;
				}
			}
		}
		return cnt;
	}
}
