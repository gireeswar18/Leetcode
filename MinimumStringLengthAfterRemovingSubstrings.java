package leetcode;

public class MinimumStringLengthAfterRemovingSubstrings {
	public static void main(String[] args) {
		String str = "ACBBD";
		
		System.out.println(minLength(str));
	}

	public static int minLength(String s) {
		char[] stack = new char[s.length()];
		
		int top = -1;
				
		for (int i = 0; i < s.length(); i++) {
			
			char c = s.charAt(i);
			
			if (top != -1 && ((c == 'B' && stack[top] == 'A' ) || (c == 'D' && stack[top] == 'C'))) {
				top--;
			}
			else {
				stack[++top] = c;
			}
			
		}
		
		
		return top + 1;
	}
}
