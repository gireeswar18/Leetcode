package leetcode;

public class StringCompressionIII {
	public static void main(String[] args) {
		String t1 = "abcde";
		String t2 = "aaaaaaaaaaaaaabb";
		
		System.out.println(compressedString(t1));
		System.out.println(compressedString(t2));
	}

	public static String compressedString(String word) {
		StringBuilder res = new StringBuilder();
		
		char[] str = word.toCharArray();
		int ind = 0;
		int n = str.length;
		
		while (ind < n) {
			char c = str[ind];
			int len = 0;

			while (ind < n && str[ind] == c && len < 9) {
				len++;
				ind++;
			}
			
			res.append(len).append(c);
		}
		
		return res.toString();
		
	}
}
