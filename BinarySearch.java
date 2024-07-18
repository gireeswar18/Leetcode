package leetcode;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        int[] arr = new int[]{1, 2, 2, 5};
        int res = b.search(arr, 5);
        System.out.println(res);
    }
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (nums[mid] > target)
            {
                end = mid - 1;
            }
            else if (nums[mid] < target)
            {
                start = mid + 1;
            }
            else
            {
                return mid;
            }
        }
        return -1;

    }
}
