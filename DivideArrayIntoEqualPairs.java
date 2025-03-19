package leetcode;

public class DivideArrayIntoEqualPairs {
	public static void main(String[] args) {
		System.out.println(divideArray(new int[] { 3, 2, 3, 2, 2, 2 }));
		System.out.println(divideArray(new int[] { 1, 2, 3, 4 }));
	}

	public static boolean divideArray(int[] nums) {
		int[] map = new int[501];
		
		for (int num : nums) {
			map[num]++;
		}
		
		for (int num : nums) {
			if (map[num] % 2 == 1) {
				return false;
			}
		}
		
		return true;
	}
}
