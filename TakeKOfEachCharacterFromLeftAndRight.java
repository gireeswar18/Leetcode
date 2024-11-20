package leetcode;

public class TakeKOfEachCharacterFromLeftAndRight {
	public static void main(String[] args) {
		String t1 = "aabaaaacaabc";
		System.out.println(takeCharacters(t1, 2));

		String t2 = "aaaaabbbb";
		System.out.println(takeCharacters(t2, 3));

		String t3 = "cacbcc";
		System.out.println(takeCharacters(t3, 1));
	}

	public static int takeCharacters(String s, int k) {

		int a = 0, b = 0, c = 0;

		int min = Integer.MAX_VALUE;

		char[] str = s.toCharArray();

		for (char x : str) {
			if (x == 'a')
				a++;
			else if (x == 'b')
				b++;
			else
				c++;
		}

		if (a < k || b < k || c < k)
			return -1;
		
		int st = 0;
		
		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'a')
				a--;
			else if (str[i] == 'b')
				b--;
			else
				c--;
			
			while (st <= i && a < k || b < k || c < k) {
				if (str[st] == 'a') {
					a++;
				}
				else if (str[st] == 'b') {
					b++;
				}
				else {
					c++;
				}
				
				st++;
			}
			
			min = Math.min(min, str.length - (i - st + 1));
		}
		
		return min;
	}
}
