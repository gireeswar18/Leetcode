package leetcode;

import java.util.Arrays;

public class DefuseTheBomb {
	public static void main(String[] args) {
		int[] t1 = { 5, 7, 1, 4 };
		System.out.println(Arrays.toString(decrypt(t1, 3)));

		int[] t2 = { 1, 2, 3, 4 };
		System.out.println(Arrays.toString(decrypt(t2, 0)));

		int[] t3 = { 2, 4, 9, 3 };
		System.out.println(Arrays.toString(decrypt(t3, -2)));
	}

	public static int[] decrypt(int[] code, int k) {
		int n = code.length;
		int[] sums = new int[n * 2];
		int st = 0, sum = 0;
		
		if (k > 0) {
			
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < n; j++) {
					sum += code[j];
					sums[st++] = sum;
				}
			}
		}
		else if (k < 0) {
			st = sums.length - 1;
			
			for (int i = 0; i < 2; i++) {
				for (int j = n - 1; j >= 0; j--) {
					sum += code[j];
					sums[st--] = sum;
				}
			}
			
			st = n;
		}
		
		
		if (k > 0) {
			
			for (int i = 0; i < n; i++) {
				code[i] = sums[i + k] - sums[i];
			}
		}
		else if (k < 0) {
			for (int i = n; i < sums.length; i++) {
				code[i - n] = sums[i + k] - sums[i];
			}
		}
		else {
			for (int i = 0; i < n; i++) {
				code[i] = 0;
			}
		}
		
		return code;
	}
}
