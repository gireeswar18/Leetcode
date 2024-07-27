package leetcode;

import java.util.Scanner;

public class ClimbingStairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int stairs = sc.nextInt();

		System.out.println(climbStairs(stairs));
		
		sc.close();
	}

	public static int climbStairs(int n) {

		int[] jumps = new int[n + 1];
		
		jumps[0] = 1;
		jumps[1] = 1;
		
		for (int i = 2; i < n + 1; i++)
		{
			jumps[i] = jumps[i - 1] + jumps[i - 2];
		}
		
		return jumps[n];
		
	}
}
