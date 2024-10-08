package leetcode;

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {
    public static void main(String[] args) {
        int[] arr = {1,2,4};
        System.out.println(maxFrequency(arr, 5));
    }

    public static int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        int left = 0, right = 0;
        long res = 0, total = 0;

        while (right < nums.length)
        {
            total += nums[right];

            while (nums[right] * (right - left + 1L) > total + k)
            {
                total = total - nums[left];
                left++;
            }

            res = Math.max(res, right - left + 1L);
            right++;
        }
        return (int) res;
    }
}
