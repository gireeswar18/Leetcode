package leetcode;

import java.util.HashMap;

public class WordPattern {
	public static void main(String[] args) {

		String pattern = "aaa";
		String s = "aaa";
		
		System.out.println(wordPattern(pattern, s));
			
	}

	public static boolean wordPattern(String pattern, String s) {
		
		char[] patternArr = pattern.toCharArray();
		int patternInd = 0;
		int i;
		
		HashMap<Character, String> map = new HashMap<>();
		
		for (i = 0; i < s.length() && patternInd < pattern.length(); i++) {
			
			StringBuilder sb = new StringBuilder();
			
			while (i < s.length() && s.charAt(i) != ' ') {
				sb.append(s.charAt(i));
				i++;
			}
			
			// word formed
//			System.out.println(patternArr[patternInd]);
//			System.out.println(sb.toString());
			
			if (!map.containsKey(patternArr[patternInd])) {
				
				if (!map.containsValue(sb.toString())) {
					
					map.put(patternArr[patternInd++], sb.toString());
//					System.out.println(map);
					
				}
				else {
					return false;
				}
				
			}
			else if (!map.get(patternArr[patternInd]).equals(sb.toString()))
				return false;
			
			else {
				patternInd++;
			}
			
		}
		
		if (i >= s.length() && patternInd == pattern.length()) return true;
		
		return false;
		
	}
}
