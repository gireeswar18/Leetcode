package leetcode;

public class NumberOfSubarraysWithOddSum {
	public static void main(String[] args) {
		int[] t1 = { 1, 2, 3 };
		System.out.println(numOfSubarrays(t1));

		int[] t2 = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(numOfSubarrays(t2));
	}

	public static int numOfSubarrays(int[] arr) {
		int odd = 0, even = 1;
		long res = 0;
		long sum = 0;
		
		for (int num : arr) {
			sum += num;
			if (sum % 2 == 0) {
				res += odd;
				even++;
			}
			else {
				res += even;
				odd++;
			}
		}
		
		return (int) (res % 1000000007);
	}
}
