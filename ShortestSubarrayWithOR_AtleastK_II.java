package leetcode;

public class ShortestSubarrayWithOR_AtleastK_II {
	public static void main(String[] args) {
		int[] t1 = { 1, 2, 3 };
		int[] t2 = { 2, 1, 8 };
		int[] t3 = { 1, 2, 32, 21 };

		System.out.println(minimumSubarrayLength(t1, 2));
		System.out.println(minimumSubarrayLength(t2, 10));
		System.out.println(minimumSubarrayLength(t3, 55));
	}

	public static int minimumSubarrayLength(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int min = Integer.MAX_VALUE;
		int[] bits = new int[32];

		while (right < nums.length) {
			add(bits, nums[right]);

			while (left <= right && bitsToNum(bits) >= k) {
				min = Math.min(min, right - left + 1);
				remove(bits, nums[left++]);
			}

			right++;
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}

	public static void add(int[] bits, int num) {
		int i = 0;
		while (i < 32) {
			bits[i] += (num & 1);
			num >>= 1;
			i++;
		}
	}

	public static void remove(int[] bits, int num) {
		int i = 0;
		while (i < 32) {
			bits[i] -= (num & 1);
			num >>= 1;
			i++;
		}
	}

	public static int bitsToNum(int[] bits) {
		int res = 0;
		
		for (int i = 0; i < 32; i++) {
			if (bits[i] != 0) {
				res += (1 << i);
			}
		}
		
		return res;
	}
}
