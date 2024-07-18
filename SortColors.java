package leetcode;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {

        int[] arr = new int[]{2,2,1,1,0};
        
        SortColors s = new SortColors();
        s.sortColors(arr);

        System.out.println(Arrays.toString(arr));

    }

    public void sortColors(int[] nums) {

        int i = 0, j = 0, k = nums.length - 1;

        while (j <= k)
        {
            if (nums[j] == 1)
            {
                j++;
            }
            else if (nums[j] == 0)
            {
                swap(nums, i, j);
                i++;
                j++;
            }
            else if (nums[j] == 2)
            {
                swap(nums, k, j);
                k--;
            }
        }

    }

    public static void swap (int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
