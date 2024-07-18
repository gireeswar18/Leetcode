package leetcode;

public class NextPermutation {

    public static void main(String[] args) {

        NextPermutation n = new NextPermutation();

        int[] arr = {1,1,5};
        n.nextPermutation(arr);

        for (int num : arr)
        {
            System.out.print(num + " ");
        }

    }

    public void nextPermutation(int[] nums) {

        int ind1 = -1;
        int ind2 = -1;

        for (int i = nums.length - 2; i >= 0; i--)
        {
            if (nums[i] < nums[i + 1])
            {
                ind1 = i;
                break;
            }
        }

        if (ind1 == -1)
        {
            int left = 0;
            int right = nums.length - 1;

            while (left < right)
            {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }

        for (int i = nums.length - 1; i >= 0; i--)
        {
            if (nums[i] > nums[ind1])
            {
                ind2 = i;
                break;
            }
        }

        int temp = nums[ind1];
        nums[ind1] = nums[ind2];
        nums[ind2] = temp;

        int left = ind1 + 1;
        int right = nums.length - 1;

        while (left < right)
        {
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

    }

}
