package leetcode;

public class SumOfDigitsOfStringAfterConvert {
	public static void main(String[] args) {
		String s = "leetcode";
		int k = 2;
		
		System.out.println(getLucky(s, k));
	}

	public static int getLucky(String s, int k) {
		
		 int num = 0;
			int len = s.length();
			for (int i = 0; i < len; i++) {
				int digit = s.charAt(i) - 'a' + 1;
				
				while (digit != 0) {
					num += digit % 10;
					digit /= 10;
				}
			}
			
			k--;
			
			while (k-- != 0) {
				int temp = 0;
				
				while (num != 0) {
					temp += num % 10;
					num /= 10;
				}
				
				num = temp;
			}
			
			return num;
		
	}
}
