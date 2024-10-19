package leetcode;

public class FindKthBitInNthBinaryString {
	public static void main(String[] args) {
		int n = 4;
		int k = 11;

		System.out.println(findKthBit(n, k));
	}

	public static char findKthBit(int n, int k) {
		StringBuilder sb = new StringBuilder(1 << n);
		sb.append('0');

		for (int i = 2; i <= n; i++) {
			String rev_inv = rev_inv(sb.toString());
			
			sb.append('1').append(rev_inv);

			if (sb.length() >= k) {
				return sb.charAt(k - 1);
			}
		}

		return sb.charAt(k - 1);
	}


	public static String rev_inv(String str) {
		int n = str.length();
		char[] arr = new char[n];
		
		for (int i = 0; i < n; i++) {
			arr[n - i - 1] = str.charAt(i) == '0' ? '1' : '0';
		}
		
		return new String(arr);
	}
}
