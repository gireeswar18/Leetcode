package leetcode;

import java.util.Arrays;

public class FindMissingObservations {
	public static void main(String[] args) {
		int[] rolls = {1, 2, 3, 4};
		
		System.out.println(Arrays.toString(missingRolls(rolls, 6, 4)));
	}

	public static int[] missingRolls(int[] rolls, int mean, int n) {
		
		int sum = 0;
		for (int x : rolls)
			sum += x;
				
		int rem = (mean * (rolls.length + n)) - sum;
		
		if (rem > 6 * n || rem < 1 * n) return new int[0];
				
		int[] res = new int[n];
		
		int roll = rem / n;
				
		rem = rem % n;
				
		for (int i = 0; i < n; i++)
			res[i] = roll;
		
		for (int i = 0; i < n && rem != 0; i++) {
			res[i]++;
			rem--;
		}
		
		return res;
	}
}
