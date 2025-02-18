package leetcode;

public class LetterTilePossibilities {
	public static void main(String[] args) {
		System.out.println(numTilePossibilities("ABA"));
	}

	public static int numTilePossibilities(String tiles) {
		
		int[] freq = new int[26];
		
		for (char c : tiles.toCharArray()) {
			freq[c - 'A']++;
		}
		
		return dfs(freq);
		
	}
	
	public static int dfs(int[] freq) {
		int sum = 0;
		
		for (int i = 0; i < 26; i++) {
			if (freq[i] == 0) continue;
			
			sum++;
			freq[i]--;
			
			sum += dfs(freq);
			freq[i]++;
		}
		
		return sum;
		
	}
}
