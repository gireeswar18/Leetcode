package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,2};

        RemoveDuplicatesFromSortedArray r = new RemoveDuplicatesFromSortedArray();
        System.out.println(r.removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));
    }
    public int removeDuplicates(int[] nums) {
        int f = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[f] != nums[i])
            {
                nums[f + 1] = nums[i];
                f++;
            }
        }
        return f + 1;
    }
}
