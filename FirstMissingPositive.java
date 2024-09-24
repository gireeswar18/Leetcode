package leetcode;

public class FirstMissingPositive {
	public static void main(String[] args) {

		int[] nums = {3, 4, -1, 1};
		
		System.out.println(firstMissingPositive(nums));
		
	}

	public static int firstMissingPositive(int[] nums) {
		
		int ind = 0;
		
		while (ind < nums.length) {
			
			int num = nums[ind];
			
			if (num > 0 && num <= nums.length && nums[num - 1] != num) {
				swap(nums, ind, num - 1);
			}
			else
				ind++;
			
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1)
				return i + 1;
		}
		
		return nums.length + 1;
		
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
