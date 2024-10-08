package leetcode;

public class SearchInRotatedSortedArray {
	public static void main(String[] args) {

		int[] num = {4, 5, 6, 7, 0, 1, 2, 3};
		int target = 0;
		
		System.out.println(search(num, target));
		
	}

	public static int search(int[] nums, int target) {
		
		int start = 0;
		int end = nums.length - 1;
		int mid;
		
		while (start <= end) {
			
			mid = (start + end) / 2;
			
			if (nums[mid] == target) return mid;
			
			else if (nums[start] <= nums[mid]) {
				
				if (nums[start] <= target && nums[mid] > target)
					end = mid - 1;
				else
					start = mid + 1;
			}
			
			else if (nums[mid] <= nums[end]) {
				
				if (nums[mid] < target && nums[end] >= target)
					start = mid + 1;
				else
					end = mid - 1;
				
			}
			
		}
		
		return -1;
	}
}
