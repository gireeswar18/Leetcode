package leetcode;

public class MaximumSubArray {

    public static void main(String[] args) {

        int[] nums = {-2,-1};

        MaximumSubArray m = new MaximumSubArray();
        int res = m.maxSubArray(nums);

        System.out.println(res);

    }

    public int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums)
        {
            sum = sum + num;

            if (sum > maxSum)
            {
                maxSum = sum;
            }
            if (sum < 0)
            {
                sum = 0;
            }
        }

        return maxSum;

    }

}
