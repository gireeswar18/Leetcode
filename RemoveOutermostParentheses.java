package leetcode;

public class RemoveOutermostParentheses {
	public static void main(String[] args) {
		String str = "((()))";
		
		System.out.println(removeOuterParentheses(str));
	}

	public static String removeOuterParentheses(String s) {
				
		StringBuilder res = new StringBuilder();
		int count = 0;
        char[] arr = s.toCharArray();
        int len = arr.length;
		
		for (int i = 0; i < len; i++) {
						
			if (arr[i] == '(') {
				if (count != 0) {
					res.append(arr[i]);
				}
				count++;
			}
			else {
				if (count != 1) {
					res.append(arr[i]);
				}
				count--;
			}
		}
		
		return res.toString();
	}
}
