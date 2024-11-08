package leetcode;

public class MinimumNumberOfChangesToMakeBinaryStringBeautiful {
	public static void main(String[] args) {
		String t1 = "1001";
		String t2 = "10";
		String t3 = "0000";
		String t4 = "0011";

		System.out.println(minChanges(t1));
		System.out.println(minChanges(t2));
		System.out.println(minChanges(t3));
		System.out.println(minChanges(t4));
	}

	public static int minChanges(String s) {
		int cnt = 0;
		char[] str = s.toCharArray();
		
		for (int i = 0; i < str.length; i += 2) {
			if (str[i] != str[i + 1])
				cnt++;
		}
		
		return cnt;
	}
}
