package leetcode;

public class CountAndSay {
	public static void main(String[] args) {

		int n = 4;

		System.out.println(countAndSay(n));

	}

	public static String countAndSay(int n) {
		if (n == 1)
			return "1";
		
		String res = "1";
		
		for (int i = 2; i <= n; i++) {
			res = say(res);
		}
		
		return res;

	}

	public static String say(String num) {

		int count = 1;

		StringBuilder sb = new StringBuilder();

		char c = num.charAt(0);

		for (int i = 1; i < num.length(); i++) {

			System.out.println("Number: " + c);
			System.out.println("Count: " + count);

			if (num.charAt(i) == c)
				count++;

			else {
				sb.append(count);
				sb.append(c);
				count = 1;
				c = num.charAt(i);
			}

		}

		sb.append(count);
		sb.append(c);

		return sb.toString();

	}
}
