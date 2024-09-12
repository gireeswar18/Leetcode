package leetcode;

public class CountTheNumberOfConsistentStrings {

	public static void main(String[] args) {
		String allowed = "cad";
		String[] arr = {"cc","acd","b","ba","bac","bad","ac","d"};
		
		System.out.println(countConsistentStrings(allowed, arr));
	}

	public static int countConsistentStrings(String allowed, String[] words) {
		
		boolean[] arr = new boolean[26];
		
		for (char c : allowed.toCharArray())
			arr[c - 'a'] = true;
		
		int count = 0;
		
		for (String word : words) {
			boolean found = true;
			
			for (int i = 0; i < word.length(); i++) {
				if (!arr[word.charAt(i) - 'a']) {
					found = false;
					break;
				}
			}
			
			if (found) count++;
		}
		
		return count;
		
	}
}
