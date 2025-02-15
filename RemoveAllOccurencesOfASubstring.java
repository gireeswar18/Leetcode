package leetcode;

public class RemoveAllOccurencesOfASubstring {
	public static void main(String[] args) {
		System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
		System.out.println(removeOccurrences("axxxxyyyyb", "xy"));
	}

	public static void calculateLPS(String part, int[] lps) {
		int n = part.length();

		int i = 0, j = 1;

		while (j < n) {
			if (part.charAt(i) == part.charAt(j)) {
				lps[j] = i + 1;
				i++;
				j++;
			} else {
				if (i != 0) {
					i = lps[i - 1];
				} else {
					j++;
				}
			}
		}

	}

	public static String removeOccurrences(String s, String part) {
		int m = s.length();
		int n = part.length();
		int strInd = 0, patInd = 0;
		int[] lps = new int[n];

		StringBuilder str = new StringBuilder(s);
		calculateLPS(part, lps);

		while (strInd < m) {
			if (str.charAt(strInd) == part.charAt(patInd)) {
				strInd++;
				patInd++;
			}

			if (patInd == n) {
				str.delete(strInd - n, strInd);
				m = str.length();
				patInd = 0;
				strInd = Math.max(0, strInd - 2 * n);
			}

			if (strInd < m && str.charAt(strInd) != part.charAt(patInd)) {
				if (patInd == 0) {
					strInd++;
				} else {
					patInd = lps[patInd - 1];
				}
			}
		}

		return str.toString();
	}
}
