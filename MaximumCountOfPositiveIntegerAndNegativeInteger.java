package leetcode;

public class MaximumCountOfPositiveIntegerAndNegativeInteger {
	public static void main(String[] args) {
		int[] t1 = { -3, -2, -1, 0, 0, 1, 2 };
		System.out.println(maximumCount(t1));
	}

	public static int maximumCount(int[] nums) {
		int n = nums.length;
		int l = 0, r = n - 1;

		int nCnt = 0, pCnt = 0;

		while (l <= r) {
			int m = (l + r) / 2;
			if (nums[m] >= 0) {
				r = m - 1;
			} else {
				l = m + 1;
			}
		}
		nCnt = r + 1;

		l = 0;
		r = n - 1;
		while (l <= r) {
			int m = (l + r) / 2;
			
			if (nums[m] <= 0) {
				l = m + 1;
			}
			else {
				r = m - 1;
			}
		}
		
		pCnt = n - l;
		
		return Math.max(pCnt, nCnt);
	}
}
