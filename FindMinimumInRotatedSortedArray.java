package leetcode;

public class FindMinimumInRotatedSortedArray {
	public static void main(String[] args) {

		int[] nums = { 3, 4, 1, 2 };
//		int[] nums = {1, 2, 3, 4};
//		int[] nums = {1, 2};
//		int[] nums = {4,5,6,7,0,1,2};
		System.out.println(findMin(nums));
	}

	public static int findMin(int[] nums) {
		
		if (nums.length == 1) return nums[0];
				
		int start = 0;
		int end = nums.length - 1;
		int mid;
		
		while (start <= end) {
			
			mid = (start + end) / 2;
			
			if (mid - 1 >= 0 && nums[mid - 1] > nums[mid])
				return nums[mid];
			
			else if (mid + 1 < nums.length && nums[mid + 1] < nums[mid])
				return nums[mid + 1];
			
			if (nums[mid] < nums[end])
				end = mid - 1;
			else
				start = mid + 1;
			
		}
		
		return nums[0];
	}
}
