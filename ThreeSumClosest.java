package leetcode;

public class ThreeSumClosest {
	public static void main(String[] args) {

		int[] nums = {-1, -4, 1, 2};
		int target = 1;
		
		System.out.println(threeSumClosest(nums, target));
		
	}

	public static int threeSumClosest(int[] nums, int target) {
		
//		Arrays.sort(nums);
		mergeSort(nums, 0, nums.length - 1);
		
//		System.out.println(Arrays.toString(nums));
		
		int res = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length - 2; i++) {
			
			int j = i + 1;
			int k = nums.length - 1;
			
			while (j < k) {
				
//				System.out.println("i: " + i);
//				System.out.println("j: " + j);
//				System.out.println("k: " + k);
				
				int sum = nums[i] + nums[j] + nums[k];
				
				if (sum > target)
					k--;
				else
					j++;
				
				if (Math.abs(target - res) > Math.abs(target - sum))
					res = sum;
				
//				System.out.println("Sum: " + sum);
//				System.out.println("Res:" + res);
				
			}
			
		}
		
		return res == Integer.MAX_VALUE ? 0 : res;
		
	}
	private static void mergeSort(int[] heights, int start, int end)
	{
		if (start == end)
		{
			return;
		}
		int mid = (start + end) / 2;
		mergeSort(heights, start, mid);
		mergeSort(heights, mid + 1, end);
		
		merge(heights, start, mid, end);
	}
	
	private static void merge(int[] arr, int start, int mid, int end)
	{
		int[] mergeTemp = new int[end - start + 1];
		
		int i = start;
		int j = mid + 1;
		int ind = 0;
		
		while (i <= mid && j <= end)
		{
			if (arr[i] < arr[j])
			{
				mergeTemp[ind] = arr[i];
				i++;
			}
			else
			{
				mergeTemp[ind] = arr[j];
				j++;
			}
			ind++;
		}
		
		while (i <= mid)
		{
			mergeTemp[ind] = arr[i];
			ind++;
			i++;
		}
		while (j <= end)
		{
			mergeTemp[ind] = arr[j];
			ind++;
			j++;
		}
		
		ind = 0;
		for (int k = start; k <= end; k++)
		{
			arr[k] = mergeTemp[ind];
			ind++;
		}
	}
}
