package leetcode;

public class CheckBalancedString {
	public static void main(String[] args) {
		String t1 = "1234";
		String t2 = "24123";

		System.out.println(isBalanced(t1));
		System.out.println(isBalanced(t2));
	}

	public static boolean isBalanced(String num) {
		int even = 0;
		int odd = 0;
		
		for (int i = 0; i < num.length(); i++) {
			if (i % 2 == 0) {
				even += (num.charAt(i) - '0');
			}
			else {
				odd += (num.charAt(i) - '0');
			}
		}
		
		return even == odd;
	}
}
