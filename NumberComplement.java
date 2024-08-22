package leetcode;

public class NumberComplement {
	public static void main(String[] args) {
		
		int num = 1;
		
		System.out.println(findComplement(num));
		
	}

	public static int findComplement(int num) {

		int power = 1;
		int res = 0;
		
		while (num != 0) {
			
			if (num % 2 == 0) {
				
				res += power;
				
			}
			
			num /= 2;
			power *= 2;
			
		}
		
		return res;
		
	}
}
/*
		power = 2  res = 0 + 2 + 0 -> 2
		
  		5 % 2 -> 1  -> 0
  		5 / 2 -> 2
  		
  		2 % 2 -> 0  -> 1
  		2 / 2 -> 1
  		
  		1 % 2 -> 1  -> 0
  		1 / 2 -> 0
  		
  		8 % 2 -> 0
  		4 % 2 -> 0
  		2 % 2 -> 0
  		1 % 2 -> 1
  		
*/