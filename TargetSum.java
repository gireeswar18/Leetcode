package leetcode;

public class TargetSum {
	public static void main(String[] args) {
		int[] t1 = { 1, 1, 1, 1, 1 };
		System.out.println(findTargetSumWays(t1, 3));

		int[] t2 = { 1 };
		System.out.println(findTargetSumWays(t2, 1));

	}

	// recursive
	static int cnt;

	public static void rec(int[] arr, int currSum, int ind, int target) {

		if (ind == arr.length) {
			if (currSum == target)
				cnt++;
			return;
		}

		rec(arr, currSum + arr[ind], ind + 1, target);
		rec(arr, currSum - arr[ind], ind + 1, target);

	}

	public static int findTargetSumWays(int[] nums, int target) {
		cnt = 0;
		rec(nums, 0, 0, target);
		return cnt;
	}


}
