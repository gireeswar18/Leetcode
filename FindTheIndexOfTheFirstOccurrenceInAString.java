package leetcode;

import java.util.Scanner;

public class FindTheIndexOfTheFirstOccurrenceInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String haystack = sc.next();
		String needle = sc.next();

		System.out.println("Index : " + new FindTheIndexOfTheFirstOccurrenceInAString().strStr(haystack, needle));
		sc.close();
	}

	public int strStr(String haystack, String needle) {

		if (haystack.length() < needle.length())
			return -1;

		int i = 0;
		int j = 0;
		int temp = i;

		while (i < haystack.length() && j < needle.length()) {

			if (haystack.charAt(i) == needle.charAt(j)) {
				j++;
				i++;
			}
			else {
				i = temp + 1;
				temp++;
				j = 0;
			}
		}
		
		if (j == needle.length())
			return i - needle.length();

		return -1;
	}
}
