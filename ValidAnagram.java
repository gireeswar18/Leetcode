package leetcode;

public class ValidAnagram {
	public static void main(String[] args) {
		String s = "rat";
		String t = "car";
		
		System.out.println(isAnagram(s, t));
	}

	public static boolean isAnagram(String s, String t) {
		
		if (s.length() != t.length()) return false;
		
		int[] freq = new int[26];
		
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();
		
		for (int i = 0; i < s.length(); i++) {
			
			freq[sChar[i] - 'a']++;
			freq[tChar[i] - 'a']--;
			
		}
		
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] != 0)
				return false;
		}
		
		return true;
		
	}
}
