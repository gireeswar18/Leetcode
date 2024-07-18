package leetcode;

import java.util.Arrays;

public class FindTheDuplicateNumber {

    public static void main(String[] args) {

        FindTheDuplicateNumber f = new FindTheDuplicateNumber();

        int[] arr = new int[]{1, 2, 3, 4, 2};

        System.out.println(f.findDuplicate(arr));
        System.out.println(Arrays.toString(arr));

    }

    public int findDuplicate(int[] nums) {

//        for (int i = 0; i < nums.length; i++)
//        {
//            int index = Math.abs(nums[i]) % nums.length;
//
//            if (nums[index] < 0)
//                return index;
//
//            nums[index] *= -1;
//
//        }
//
//        return -1;

        int slow = nums[0];
        int fast = nums[0];

        while (true)
        {
            slow = nums[slow];
            fast = nums[nums[fast]];
            if (slow == fast) {
                fast = nums[0];
                break;
            }
        }

        while (slow != fast)
        {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;

    }

}
