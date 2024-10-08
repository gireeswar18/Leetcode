package leetcode;

import java.util.Scanner;

public class RansomNote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String m = sc.next();
		String n = sc.next();
		
		System.out.println(canConstruct(m, n));
		
		sc.close();

	}

	public static boolean canConstruct(String ransomNote, String magazine) {
		
		int[] arr = new int[26];
		
		for (int i = 0; i < magazine.length(); i++)
		{
			arr[magazine.charAt(i) - 'a']++;
		}
		
		for (int i = 0; i < ransomNote.length(); i++)
		{
			if (arr[ransomNote.charAt(i) - 'a'] == 0)
			{
				return false;
			}
			else {
				arr[ransomNote.charAt(i) - 'a']--;
			}
		}
		
		return true;
		
	}
}
