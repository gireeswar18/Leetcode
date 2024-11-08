package leetcode;

public class LargestCombinationWithBitwiseAndGreaterThanZero {
	public static void main(String[] args) {
		int[] t1 = { 16, 17, 71, 62, 12, 24, 14 };
		int[] t2 = { 8, 8 };

		System.out.println(largestCombination(t1));
		System.out.println(largestCombination(t2));
	}

	public static int largestCombination(int[] candidates) {
		int[] oneCnt = new int[24];
		int max = 0;
		
		for (int num : candidates) {
			binary(num, oneCnt);
		}
		
		for (int num : oneCnt) {
			max = Math.max(max, num);
		}
		
		return max;
	}
	
	public static void binary(int num, int[] oneCnt) {
		
		int ind = 23;
		
		while (num != 0) {
			oneCnt[ind--] += (num & 1);
			num = num >> 1;
		}
	}
}
