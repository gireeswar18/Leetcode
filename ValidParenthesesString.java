package leetcode;

public class ValidParenthesesString {
	public static void main(String[] args) {
		System.out.println(checkValidString("()"));
		System.out.println(checkValidString("(*)"));
		System.out.println(checkValidString("(*))"));
	}

	public static boolean checkValidString(String s) {
		char[] arr = s.toCharArray();
		int min = 0;
		int max = 0;

		for (char c : arr) {
			if (c == '(') {
				min++;
				max++;
			} else if (c == ')') {
				min--;
				max--;
			} else {
				min--;
				max++;
			}
			
			if (min < 0) {
				min = 0;
			}
			if (max < 0) {
				return false;
			}
		}
		return min == 0;
	}
}
