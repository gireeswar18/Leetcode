package leetcode;

public class DeleteCharactersToMakeFancyString {
	public static void main(String[] args) {
		String t1 = "leeetcode";
		String t2 = "aaabaaaa";
		String t3 = "aab";
		
		System.out.println(makeFancyString(t1));
		System.out.println(makeFancyString(t2));
		System.out.println(makeFancyString(t3));
	}

	public static String makeFancyString(String s) {

		StringBuilder res = new StringBuilder();
		
		int prevCount = 0;
		char prev = s.charAt(0);
		
		for (char c : s.toCharArray()) {
			if (prev == c) {
				prevCount++;
			}
			else {
				prevCount = 1;
				prev = c;
			}
			
			if (prevCount < 3) {
				res.append(c);
			}
		}
		
		return res.toString();
	}
}
