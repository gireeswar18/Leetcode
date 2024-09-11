package leetcode;

public class MinimumBitFlipsToConvertNumber {
	public static void main(String[] args) {
		int start = 10;
		int goal = 7;
		
		System.out.println(minBitFlips(start, goal));
	}

	public static int minBitFlips(int start, int goal) {
		
		int flips = 0;
		
		while (start > 0 || goal > 0) {
			
			flips += (start % 2) ^ (goal % 2);
			
			start /= 2;
			goal /= 2;
			
		}
		
		
		return flips;
		
	}
}
