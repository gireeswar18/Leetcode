package leetcode;

public class BitwiseXOROfAllPairings {
	public static void main(String[] args) {
		System.out.println(xorAllNums(new int[] { 2, 1, 3 }, new int[] { 10, 2, 5, 0 }));
	}

	public static int xorAllNums(int[] nums1, int[] nums2) {
		int res = 0;
		
		if (nums1.length % 2 == 0 && nums2.length % 2 == 0) {
			return res;
		}

		if (nums1.length % 2 == 0) {
			for (int num : nums1) {
				res ^= num;
			}
		}
		if (nums2.length % 2 == 0) {
			for (int num : nums2) {
				res ^= num;
			}
		}

		return res;
	}
}
