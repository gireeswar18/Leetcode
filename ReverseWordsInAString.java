package leetcode;

import java.util.Scanner;

public class ReverseWordsInAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		System.out.println(new ReverseWordsInAString().reverseWords(str));
		
		sc.close();
	}

	public String reverseWords(String str) {
		int i = 0;
		int j = str.length() - 1;
		StringBuilder res = new StringBuilder();
		
		while (str.charAt(j) == ' ')
		{
			j--;
		}
		
		while (j >= 0)
		{
			if (str.charAt(j) != ' ')
			{
				res.insert(i, str.charAt(j));
				j--;
			}
			else 
			{
				while (j >= 0 && str.charAt(j) == ' ')
				{
					j--;
				}
				if (j >= 0)
				{
					res.append(" ");
					i = res.length();
				}
			}
		}
		
		return res.toString();
	}
}
