package leetcode;

import java.util.*;

public class FractionAdditionAndSubtraction {
	public static void main(String[] args) {

		String e = "-1/2+1/2";
		System.out.println(fractionAddition(e));

	}

	public static String fractionAddition(String expression) {

		List<Integer> num = new ArrayList<>();
		List<Integer> den = new ArrayList<>();

		boolean isNegative = false;
		boolean getNum = true;

		for (int i = 0; i < expression.length(); i++) {

			char c = expression.charAt(i);

			if (c == '+')
				continue;

			if (c == '-')
				isNegative = true;

			else if (c >= '0' && c <= '9' && getNum) {
				int res = c - '0';

				if (i + 1 < expression.length()) {
					char x = expression.charAt(i + 1);
					if (x == '0') {
						res = 10;
						i++;
					}
				}
				if (isNegative) {
					res = -res;
				}

				num.add(res);
				isNegative = false;
			} else if (c == '/')
				getNum = false;

			else {
				int res = c - '0';

				if (i + 1 < expression.length()) {
					char x = expression.charAt(i + 1);
					if (x == '0') {
						res = 10;
						i++;
					}
				}

				if (isNegative) {
					res = -res;
				}
				den.add(res);
				isNegative = false;
				getNum = true;
			}

		}

		System.out.println(num);
		System.out.println(den);

		int lcm = den.get(0);

		for (int i = 1; i < den.size(); i++) {

			lcm = lcm(lcm, den.get(i));

		}

		int ans = 0;

		for (int i = 0; i < num.size(); i++) {

			ans += num.get(i) * (lcm / den.get(i));

		}
		
		if (ans != 0) {
			if (ans < lcm) {
				if (lcm % ans == 0) {
					lcm = lcm / ans;
					ans = 1;
				}
			} else {
				if (ans % lcm == 0) {
					ans = ans / lcm;
					lcm = 1;
				}
			}
		}

		int gcd = gcd(Math.abs(ans), lcm);
		ans /= gcd;
		lcm /= gcd;

		if (lcm < 0) {
			lcm = -lcm;
			ans = -ans;
		}


		return ans + "/" + lcm;
	}

	public static int lcm(int a, int b) {

		return (a * b) / gcd(a, b);
		
	}

	public static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
