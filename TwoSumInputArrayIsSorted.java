package leetcode;

import java.util.Arrays;

public class TwoSumInputArrayIsSorted {

    public static void main(String[] args) {

        TwoSumInputArrayIsSorted t = new TwoSumInputArrayIsSorted();
        int[] arr1 = new int[]{2,7,11,15};

        System.out.println(Arrays.toString(t.twoSum(arr1, 9)));

    }

    public int[] twoSum(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        while (left < right)
        {
            if (numbers[left] + numbers[right] == target)
                return new int[]{left + 1, right + 1};

            else if (numbers[left] + numbers[right] > target)
                right--;

            else left++;
        }

        return new int[]{};

    }

}
