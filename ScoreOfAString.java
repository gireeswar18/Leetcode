package leetcode;

public class ScoreOfAString {
	public static void main(String[] args) {

		String str = "zaz";

		System.out.println(scoreOfString(str));

	}

	public static int scoreOfString(String s) {
		
		int score = 0;
		
		for (int i = 0; i < s.length() - 1; i++) {
			
			score += Math.abs(s.charAt(i) - s.charAt(i + 1));
			
		}
		
		return score;
		
	}
}
