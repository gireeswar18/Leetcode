package leetcode;

public class CheckIfArrayIsSortedAndRotated {

	public static void main(String[] args) {

		System.out.println(check(new int[] { 3, 2, 1 })); // Output: true
		System.out.println(check(new int[] { 2, 3, 1 })); // Output: true
		System.out.println(check(new int[] { 1, 2, 3 })); // Output: true
		System.out.println(check(new int[] { 1, 3, 2 })); // Output: false
	}

	public static boolean check(int[] nums) {

		int count = 0;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] > nums[i]) {
				count++;
			}
		}

		if (nums[nums.length - 1] > nums[0]) {
			count++;
		}

		return count <= 1;

	}

}
