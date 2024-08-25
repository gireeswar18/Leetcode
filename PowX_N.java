package leetcode;

public class PowX_N {
	public static void main(String[] args) {
		double x = 2.0;
		int n = -2147483648;
		
		System.out.println(myPow(x, n));
	}

	public static double myPow(double x, int n) {
		
		double res = 1;
		
		if (n == 0 || x == 1) return 1;
		if (x == -1) return n % 2 == 0 ? 1 : -1;
		if (x == 0) return 0;
		if (n == Integer.MIN_VALUE) return 0;
		
		boolean isNegative = false;
		
		if (n < 0) {
			n = -n;
			isNegative = true;
		}
		
		while (n-- != 0) {
			res *= x;
		}
		
		if (isNegative) {
			res = 1 / res;
		}
		
		return res;
		
	}
}
