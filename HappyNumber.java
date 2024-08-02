package leetcode;

import java.util.HashSet;

public class HappyNumber {
	public static void main(String[] args) {
		
		System.out.println(isHappy(2));
		
		System.out.println(makeNumber(19));
		
	}
	
	public static boolean isHappy(int n) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(n);
		int newNum = n;
		
		while (true) {
			newNum = makeNumber(newNum);
			
			if (newNum == 1)
				return true;
			else if (!set.add(newNum)) {
				break;
			}
		}
		
		System.out.println(set);
		return false;
		
	}
	
	public static int makeNumber(int n) {
		int num = 0;
		
		while (n != 0) {
			int digit = n % 10;
			num += (digit * digit);
			n /= 10;
		}

		return num;
	}
}
