package leetcode;

public class StringToInteger {
	public static void main(String[] args) {

//		String str1 = "42";
//		String str2 = "-042";
//		String str3 = "1337c0d3";
//		String str4 = "0-1";
//		String str5 = "words and 987";
		String str6 = "-2147483648";
//		String str7 = "99999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999";

		System.out.println(myAtoi(str6));

	}

	public static int myAtoi(String s) {

		long num = 0;
		int fact = 10;
		boolean isNegative = false;

		char[] arr = s.toCharArray();

		// space removal
		int k;
		for (k = 0; k < arr.length; k++) {

			if (arr[k] != ' ') {
				break;
			}
		}
		
		// check sign
		if (k < arr.length && arr[k] == '-') {
			isNegative = true;
			k++;
		}
		else if (k < arr.length && arr[k] == '+')
			k++;

		for (int i = k; i < arr.length; i++) {


			if (arr[i] >= '0' && arr[i] <= '9') {

				num = num * fact + (arr[i] - '0');

				System.out.println("Num: " + num);
				System.out.println("Fact: " + fact);
				
				if (isNegative)
					num = -num;
				
				if (num < Integer.MIN_VALUE)
					return Integer.MIN_VALUE;
				
				if (num > Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				
				if (isNegative)
					num = -num;
				

			} else
				break;

		}
		
		if (isNegative)
			num = -num;
		
//		if (num < Integer.MIN_VALUE)
//			return Integer.MIN_VALUE;
//		
//		if (num > Integer.MAX_VALUE)
//			return Integer.MAX_VALUE;

		return (int) num;

	}
}
