package leetcode;

public class BestSightseeingPair {
	public static void main(String[] args) {
		int[] t1 = { 8, 1, 5, 2, 6 };
		System.out.println(maxScoreSightseeingPair(t1));

		int[] t2 = { 1, 2 };
		System.out.println(maxScoreSightseeingPair(t2));
	}

	public static int maxScoreSightseeingPair(int[] values) {
		
		int max = 0;
		int currMax = values[0];
		
		for (int i = 1; i < values.length; i++) {
			max = Math.max(max, values[i] - i + currMax);
			currMax = Math.max(currMax, values[i] + i);
		}
		
		return max;
		
	}
}
