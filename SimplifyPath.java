package leetcode;

import java.util.Stack;

public class SimplifyPath {
	public static void main(String[] args) {

		String path = "/home/doc//images/../gr/./hi";
		
//		String path = "/..";
		
		System.out.println(simplifyPath(path));
		
		// a -> b
		// [a, ., c]
		
	}

	public static String simplifyPath(String path) {
		
		Stack<String> stack = new Stack<>();
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < path.length(); i++) {
			
			if (path.charAt(i) == '/') {
				
				if (sb.toString().equals("..")) {
					
					if (!stack.isEmpty()) {
						stack.pop();
					}
					sb = new StringBuilder();
				}
				else if (sb.toString().equals(".")) {
					sb = new StringBuilder();
				}
				else {
					
					if (sb.length() != 0) {
						stack.push(sb.toString());
						sb = new StringBuilder();
					}
				}
			}
			else {
				sb.append(path.charAt(i));
			}
		}
		
		
		if (sb.toString().equals("..")) {
			
			if (!stack.isEmpty()) {
				stack.pop();
			}
		}
		else if (sb.length() != 0 && !sb.toString().equals(".")) {
			stack.push(sb.toString());
			sb = new StringBuilder();
		}
		
		System.out.println(stack.toString());
		
		sb = new StringBuilder();
		
		while (!stack.isEmpty()) {
			
			sb.insert(0, "/" + stack.pop());
			
		}
		if (sb.length() == 0)
			sb.append("/");
		
		return sb.toString();
		
	}
}
