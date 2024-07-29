package leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class IsomorphicStrings {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();

		sc.close();

		System.out.println(isIsomorphic(s, t));
	}

	public static boolean isIsomorphic(String s, String t) {
		
		// egg -> add
		
		HashMap<Character, Character> map = new HashMap<Character, Character>();
				
		for (int i = 0; i < s.length(); i++)
		{
			if (!map.containsKey(s.charAt(i)))
			{
				if (!map.containsValue(t.charAt(i)))
				{
					map.put(s.charAt(i), t.charAt(i));
				}
				else {
					return false;
				}
			}
			else if (map.get(s.charAt(i)) != t.charAt(i))
			{
				return false;
			}
		}
		
		System.out.println(map);
		
		return true;
		
	}
}
