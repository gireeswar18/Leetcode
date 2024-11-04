package leetcode;

public class RotateString {

	public static void main(String[] args) {
		String t1 = "abcde", g1 = "cdeab";
		String t2 = "abcde", g2 = "abced";
		
		System.out.println(rotateString(t1, g1));
		System.out.println(rotateString(t2, g2));
	}

	public static boolean rotateString(String s, String goal) {
		
		if (s.length() != goal.length()) return false;
		
		char st = s.charAt(0);
		
		for (int i = 0; i < s.length(); i++) {
			if (goal.charAt(i) == st) {
				if ((goal.substring(i) + goal.substring(0, i)).equals(s))
					return true;
			}
		}
		return false;
		
	}
}
