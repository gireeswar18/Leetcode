package leetcode;

import java.util.Arrays;

public class UglyNumberII {
	public static void main(String[] args) {
			
		int n = 10;
		
		System.out.println(nthUglyNumber(n));
		
	}

	public static int nthUglyNumber(int n) {
		
		int[] uglyArr = new int[n];
		
		uglyArr[0] = 1;
		
		int nextUglyNo = 1;
		
		int next2 = 2;
		int next3 = 3;
		int next5 = 5;
		
		int i2 = 0;
		int i3 = 0;
		int i5 = 0;
		
		for (int i = 1; i < n; i++) {
			
			nextUglyNo = Math.min(next2, Math.min(next3, next5));
			
			uglyArr[i] = nextUglyNo;
			
			if (nextUglyNo == next2) {
				i2++;
				next2 = uglyArr[i2] * 2;
			}
			if (nextUglyNo == next3) {
				i3++;
				next3 = uglyArr[i3] * 3;
			}
			if (nextUglyNo == next5) {
				i5++;
				next5 = uglyArr[i5] * 5;
			}
			
		}
		
		System.out.println(Arrays.toString(uglyArr));
		
		return nextUglyNo;
		
	}
}
