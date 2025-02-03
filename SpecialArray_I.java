package leetcode;

public class SpecialArray_I {
	public static void main(String[] args) {
		int[] t1 = { 1 };
		System.out.println(isArraySpecial(t1));

		int[] t2 = { 2, 1, 4 };
		System.out.println(isArraySpecial(t2));
	}

	public static boolean isArraySpecial(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n - 1; i++) {
			if (nums[i] % 2 == nums[i + 1] % 2) {
				return false;
			}
		}

		return true;
	}
}
