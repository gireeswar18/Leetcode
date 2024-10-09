package leetcode;

public class MinimumAddToMakeParenthesesValid {
	public static void main(String[] args) {
		String s = "((())";

		System.out.println(minAddToMakeValid(s));
	}

	public static int minAddToMakeValid(String s) {
		int oCount = 0, cCount = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				oCount++;
            }
			else if (oCount != 0) {
				oCount--;
			}
			else {
				cCount++;
			}
		}

		return oCount + cCount;
	}
}
