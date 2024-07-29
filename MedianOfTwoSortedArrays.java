package leetcode;

public class MedianOfTwoSortedArrays {
	public static void main(String[] args) {
		int[] nums1 = {1, 2};
		int[] nums2 = {3, 4};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		int[] res = new int[nums1.length + nums2.length];
		
		int ind = 0;
		int i = 0;
		int j = 0;
		
		while (i < nums1.length && j < nums2.length)
		{
			if (nums1[i] < nums2[j])
			{
				res[ind] = nums1[i];
				i++;
			}
			else {
				res[ind] = nums2[j];
				j++;
			}
			ind++;
		}
		
		while (i < nums1.length)
		{
			res[ind] = nums1[i];
			i++;
			ind++;
		}
		
		while (j < nums2.length)
		{
			res[ind] = nums2[j];
			j++;
			ind++;
		}
		
		if (res.length % 2 == 1)
		{
			return (double) res[res.length / 2];
		}
		
		return (double) (res[res.length / 2] + res[(res.length / 2) - 1]) / 2;
		
	}
}
