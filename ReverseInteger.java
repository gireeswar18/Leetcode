package leetcode;

public class ReverseInteger {
	public static void main(String[] args) {

		System.out.println(reverse(-2147483648));

	}

	public static int reverse(int x) {
		
		if (x > Integer.MAX_VALUE || x <= Integer.MIN_VALUE)
			return 0;

		long rev = 0;
		boolean isNegative = false;

		if (x < 0) {
			isNegative = true;
			x = -x;
		}

		while (x != 0) {

			rev = rev * 10 + (x % 10);

			x /= 10;

			if (rev > Integer.MAX_VALUE)
				return 0;

		}

		if (isNegative)
			return (int) -rev;

		return (int) rev;

	}
}

