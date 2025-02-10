package leetcode;

public class ClearDigits {
	public static void main(String[] args) {
		System.out.println(clearDigits("abc"));
		System.out.println(clearDigits("cb34da5"));
	}

	public static String clearDigits(String s) {
		char[] stack = new char[s.length()];
		int top = -1;
		
		for (char c : s.toCharArray()) {
			if (c >= '0' && c <= '9') {
				top--;
			}
			else {
				stack[++top] = c;
			}
		}
		
		StringBuilder res = new StringBuilder();
		for (int i = 0; i <= top; i++) {
			res.append(stack[i]);
		}
		
		return res.toString();
	}
}
