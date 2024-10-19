package leetcode;

public class CountNumberOfMaximumBitwiseORSubsets {
	public static void main(String[] args) {
		int[] arr = {2, 2, 2};
		
		System.out.println(countMaxOrSubsets(arr));
	}
	static int res;
	public static int countMaxOrSubsets(int[] nums) {
		res = 0;
		int max = nums[0];
		for (int i = 1; i < nums.length; i++)
			max |= nums[i];
		makeSubsets(nums, 0, max, 0);
		
		return res;
	}
	
	public static void makeSubsets(int[] arr, int ind, int max, int curr) {
		if (ind == arr.length) {
			if (curr == max)
				res++;
			return;
		}
		
		makeSubsets(arr, ind + 1, max, curr | arr[ind]);
		makeSubsets(arr, ind + 1, max, curr);
	}
}
