package leetcode;

public class LongestHappyString {
	public static void main(String[] args) {
		System.out.println(longestDiverseString(1, 1, 7));
	}

	public static String longestDiverseString(int a, int b, int c) {
		StringBuilder res = new StringBuilder();
		
		int len = a + b + c;
		int continuos_A = 0;
		int continuos_B = 0;
		int continuos_C = 0;
		
		for (int i = 0; i < len; i++) {
			if ((a >= b && a >= c && continuos_A != 2) || (continuos_B == 2 && a != 0) || (continuos_C == 2 && a != 0)) {
				res.append('a');
				a--;
				continuos_A++;
				continuos_B = 0;
				continuos_C = 0;
			}
			else if ((b >= a && b >= c && continuos_B != 2) || (continuos_A == 2 && b != 0) || (continuos_C == 2 && b != 0)) {
				res.append('b');
				b--;
				continuos_B++;
				continuos_A = 0;
				continuos_C = 0;
			}
			else if ((c >= a && c >= b && continuos_C != 2) || (continuos_A == 2 && c != 0) || (continuos_B == 2 && c != 0)) {
				res.append('c');
				c--;
				continuos_C++;
				continuos_A = 0;
				continuos_B = 0;
			}
		}
		
		return res.toString();
	}
}
