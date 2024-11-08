package leetcode;

public class FindIfArrayCanBeSorted {
	public static void main(String[] args) {
		int[] t1 = {8, 4, 2, 30, 15};
		int[] t2 = {1, 2, 3, 4, 5};
		int[] t3 = {3, 16, 8, 4 , 2};
		
		System.out.println(canSortArray(t1));
		System.out.println(canSortArray(t2));
		System.out.println(canSortArray(t3));
	}

	public static boolean canSortArray(int[] nums) {
		int n = nums.length;
		int[] bitCount = new int[n];
		
		for (int i = 0; i < n; i++) {
			bitCount[i] = Integer.bitCount(nums[i]);
		}
		int ind = 0;
		int currBit = bitCount[0];
		int prevMax = -1;
		int max = -1;
		
		while (ind < n) {
			if (bitCount[ind] == currBit) {
				max = Math.max(nums[ind], max);
			}
			else {
				break;
			}
			ind++;
		}
		
		while (ind < n) {
			currBit = bitCount[ind];
			prevMax = max;
			int min = Integer.MAX_VALUE;
			
			while (ind < n && bitCount[ind] == currBit) {
				min = Math.min(min, nums[ind]);
				max = Math.max(max, nums[ind]);
				ind++;
			}
			if (min < prevMax) return false;
		}
		
		return true;
	}
}
