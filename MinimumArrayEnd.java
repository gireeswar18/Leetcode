package leetcode;

public class MinimumArrayEnd {
	public static void main(String[] args) {
		System.out.println(minEnd(3, 4));
		System.out.println(minEnd(2, 7));
		System.out.println(minEnd(6715154, 7193485));
	}

	public static long minEnd(int n, int x) {
		int[] arr = new int[64];

		makeBinary(arr, x);

		int[] lastNum = new int[32];

		makeBinary(lastNum, n - 1);

		int ind1 = 63;
		int ind2 = 31;

		while (ind1 >= 0 && ind2 >= 0) {
			while (ind1 >= 0 && arr[ind1] == 1) {
				ind1--;
			}
			arr[ind1--] = lastNum[ind2--];
		}

		long res = 0;
		int moveCnt = 0;
		for (int i = 63; i >= 0; i--) {
			res += (arr[i] * (1L << moveCnt++));
		}

		return res;
	}

	public static void makeBinary(int[] arr, int num) {
		int ind = arr.length - 1;

		while (num != 0) {
			arr[ind--] = num % 2;
			num /= 2;
		}
	}
}
