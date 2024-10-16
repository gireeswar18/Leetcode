package leetcode;

public class SeparateBlackAndWhiteBalls {
	public static void main(String[] args) {
		String s = "111111111111111111111111111111111111111110011";
		System.out.println(minimumSteps(s));
	}

	public static long minimumSteps(String s) {
		char[] arr = s.toCharArray();
		long steps = 0;
		int n = arr.length;
		int zero = n - 1;
		
		while (zero >= 0 && arr[zero] == '1') {
			zero--;
		}
		
		for (int i = zero - 1; i >= 0; i--) {
			if (arr[i] == '1') {
				steps += zero - i;
				arr[i] = '0';
				zero--;
			}
		}
		
		return steps;
	}
}
