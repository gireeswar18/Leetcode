package leetcode;

public class MultiplyStrings {
	public static void main(String[] args) {
		
		String num1 = "9";
		String num2 = "99";
		
		System.out.println(multiply(num1, num2));
		
	}

	public static String multiply(String num1, String num2) {
		
		if (num1.equals("0") || num2.equals("0")) return "0";
		
		int len1 = num1.length();
		int len2 = num2.length();
		
		if (len2 > len1) {
			String temp = num1;
			num1 = num2;
			num2 = temp;
			int x = len1;
			len1 = len2;
			len2 = x;
		}
		
		System.out.println(num1);
		System.out.println(num2);
		
		int[] res = new int[len1 + len2];
		
		int ind = len1 + len2 - 1;
		
		int dec = 2;
		
		for (int i = len2 - 1; i >= 0; i--) {
			
			int carry = 0;
			for (int j = len1 - 1; j >= 0; j--) {
				
				 int val = carry + (num2.charAt(i) - '0') * (num1.charAt(j) - '0');
				 carry = (val + res[ind]) / 10;
				 res[ind] = (res[ind] + val) % 10;
				 ind--;
				 
			}
			if (carry != 0)
				res[ind] = carry;
			
			ind = (len1 + len2) - dec;
			dec++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < res.length; i++) {
			if (i == 0 && res[i] == 0)
				continue;
			sb.append(res[i]);
		}
		
		return sb.toString();
		
	}
}
