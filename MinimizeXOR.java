package leetcode;

public class MinimizeXOR {
	public static void main(String[] args) {
		System.out.println(minimizeXor(1, 15));
		System.out.println(minimizeXor(1, 1));
		System.out.println(minimizeXor(25, 72));
		System.out.println(minimizeXor(100, 100));
		System.out.println(minimizeXor(1000000000, 255));
		System.out.println(minimizeXor(65, 84));
	}

	public static int minimizeXor(int num1, int num2) {
		String a = Integer.toBinaryString(num1);
		StringBuilder res = new StringBuilder();

		int cnt = Integer.bitCount(num2);


		while (cnt > a.length()) {
			res.append('1');
			cnt--;
		}

		for (char c : a.toCharArray()) {
			if (c == '1' && cnt != 0) {
				res.append('1');
				cnt--;
			} else {
				res.append('0');
			}
		}

		if (cnt != 0) {
			for (int i = res.length() - 1; i >= 0 && cnt != 0; i--) {
				if (res.charAt(i) == '0') {
					res.setCharAt(i, '1');
					cnt--;
				}
			}
		}

		return Integer.parseInt(res.toString(), 2);
	}
}
