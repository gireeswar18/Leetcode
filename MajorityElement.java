package leetcode;

public class MajorityElement {

    public static void main(String[] args) {

        MajorityElement m = new MajorityElement();

        int[] arr = new int[]{2,2,1,1,1,2,2};
        System.out.println(m.majorityElement(arr));

    }

    public int majorityElement(int[] nums) {

        int count = 0;
        int majority = -1;

        for (int i = 0; i < nums.length; i++)
        {
            if (count == 0 || majority == nums[i])
            {
                count++;
                majority = nums[i];
            }
            else
            {
                count--;
            }
        }
        return majority;
    }

}
