package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		for (int i = 0; i < size; i++)
		{
			arr[i] = sc.next();
		}
		
		sc.close();
		
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(arr));
	}

	public String longestCommonPrefix(String[] strs) {
		
		Arrays.sort(strs);
//		System.out.println(Arrays.toString(strs));
		
		String first = strs[0];
//		System.out.println(first);
		
		String last = strs[strs.length - 1];
//		System.out.println(last);
		
		int i = 0;
		
		StringBuilder sb = new StringBuilder();
	
		
		while (i < first.length() && i < last.length())
		{
			if (first.charAt(i) != last.charAt(i))
				return sb.toString();
			
			sb.append(first.charAt(i));
			i++;
		}
		
		return sb.toString();
		
	}

}
