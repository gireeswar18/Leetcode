package leetcode;

public class MovePiecesToObtainAString {
	public static void main(String[] args) {
		System.out.println(canChange("_L__R__R_", "L______RR"));
		System.out.println(canChange("R_L_", "__LR"));
		System.out.println(canChange("_R", "R_"));
	}

	public static boolean canChange(String start, String target) {
		
		char[] s = start.toCharArray();
		char[] t = target.toCharArray();
		
		int n = s.length;
		int i = 0, j = 0;
		while (i <= n && j <= n) {

			while (i < n && t[i] == '_')
				i++;
			while (j < n && s[j] == '_')
				j++;

			if (i == n || j == n) {
				return i == n && j == n;
			}

			if (t[i] != s[j])
				return false;

			if (t[i] == 'L') {
				if (j < i)
					return false;
			} else {
				if (i < j)
					return false;
			}

			i++;
			j++;
		}
		return true;

	}
}
