package leetcode;

public class CheckIfAParenthesesStringCanBeValid {
	public static void main(String[] args) {
		System.out.println(canBeValid("))()))", "010100"));
		System.out.println(canBeValid("()()", "0000"));
		System.out.println(canBeValid(")", "0"));
	}

	public static boolean canBeValid(String s, String locked) {
		int n = s.length();
        if (n % 2 == 1) return false;
        
		int min = 0;
		int max = 0;
		
		for (int i = 0; i < n; i++) {
			if (locked.charAt(i) - '0' == 1) {
				if (s.charAt(i) == '(') {
					min++;
					max++;
				}
				else {
					min--;
					max--;
				}
			}
			else {
				min--;
				max++;
			}
			
			if (min < 0) {
				min = 0;
			}
			
			if (max < 0) {
				return false;
			}
//			System.out.println("MIN: " + min);
//			System.out.println("MAX: " + max);

		}
		
		return (min == 0);
			
	}
}
