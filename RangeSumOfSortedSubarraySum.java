package leetcode;

import java.util.Arrays;

public class RangeSumOfSortedSubarraySum {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4};
		
		int n = 4;
		int left = 1;
		int right = 5;
		
		System.out.println(rangeSum(nums, n, left, right));
	}

	public static int rangeSum(int[] nums, int n, int left, int right) {
		
		int[] arr = new int[n * (n + 1) / 2];
		int ind = 0;
		
		for (int i = 0; i < n; i++) {
			
			int sum = 0;
			
			for (int j = i; j < n; j++) {
				
				sum += nums[j];
				arr[ind++] = sum;
				
			}	
		}
		
		
//		sort(arr, 0, arr.length - 1);
		
		Arrays.sort(arr);

		int res = 0;
		int mod = 1000000007;
		
		for (int i = left - 1; i < right; i++) {
			res = (res + arr[i]) % mod;
		}
		
		return res;
	}
	
	public static void sort(int arr[], int l, int r)
    {
        if (l < r) {

            int m = l + (r - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, r);

            merge(arr, l, m, r);
        }
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
