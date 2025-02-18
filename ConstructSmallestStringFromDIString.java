package leetcode;

public class ConstructSmallestStringFromDIString {
	public static void main(String[] args) {
		System.out.println(smallestNumber("IIIDIDDD"));
		System.out.println(smallestNumber("DDD"));
	}

	public static String smallestNumber(String pattern) {
		
		StringBuilder res = new StringBuilder();
		
		int[] st = new int[10];
		int top = -1;
		
		
		for (int i = 0; i <= pattern.length(); i++) {
			
			st[++top] = i + 1;
			
			
			while (top != -1 && (i == pattern.length() || pattern.charAt(i) == 'I')) {
				res.append(st[top--]);
			}
			
		}
		
		return res.toString();
	}
}
