package leetcode;


import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] a = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;

        RemoveElement r = new RemoveElement();
        System.out.println(r.removeElement(a, val));
        System.out.println(Arrays.toString(a));
    }
    public int removeElement(int[] nums, int val) {

        int r = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] != val)
            {
                nums[r] = nums[i];
                r++;
            }
        }

        return r;
    }

}
