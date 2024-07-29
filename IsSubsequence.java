package leetcode;

import java.util.Scanner;

public class IsSubsequence {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		
		System.out.println(isSubsequence(s, t));
		
		sc.close();
		
	}

	public static boolean isSubsequence(String s, String t) {
		if (s.length() > t.length()) {
			return false;
		}
		int i = 0;
		int j = 0;
		
		while (j < t.length() && i < s.length()) {
			if (t.charAt(j) == s.charAt(i))
			{
				i++;
			}
			j++;
		}
		
		return i == s.length() ? true : false;
	}
}
