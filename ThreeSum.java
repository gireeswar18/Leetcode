package leetcode;

//import java.util.ArrayList;
//import java.util.HashSet;
import java.util.*;

public class ThreeSum {
	public static void main(String[] args) {
		
		int[] nums = {0,0,0};
		
		List<List<Integer>> res = threeSum(nums);
		
		System.out.println(res);
		
	}

	public static List<List<Integer>> threeSum(int[] nums) {
		
		HashSet<List<Integer>> res = new HashSet<>();
		
		mergeSort(nums, 0, nums.length - 1);
		
		for (int i = 0; i < nums.length - 2; i++)
		{
			int j = i + 1;
			int k = nums.length - 1;
			
			while (j < k)
			{
				if (nums[i] + nums[j] + nums[k] == 0)
				{
					res.add(new ArrayList<>(List.of(nums[i], nums[j], nums[k])));
					j++;
					k--;
				}
				else if (nums[i] + nums[j] + nums[k] > 0)
				{
					k--;
				}
				else {
					j++;
				}
			}
		}
		
		return new ArrayList<>(res);
		
	}
	
	public static void mergeSort(int[] arr, int low, int high)
    {
        if (low == high) return;

        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    public static void merge(int[] arr, int low, int mid, int high)
    {
        int i = low;
        int j = mid + 1;
        int index = 0;
        ArrayList<Integer> res = new ArrayList<>();

        while (i <= mid && j <= high)
        {
            if (arr[i] < arr[j])
            {
                res.add(arr[i]);
                i++;
            }
            else
            {
                res.add(arr[j]);
                j++;
            }
        }

        while (i <= mid)
        {
            res.add(arr[i]);
            i++;
        }
        while (j <= high)
        {
            res.add(arr[j]);
            j++;
        }

        for (int k = low; k <= high; k++)
        {
            arr[k] = res.get(index);
            index++;
        }
    }
}
