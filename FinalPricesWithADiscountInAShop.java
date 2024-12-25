package leetcode;

import java.util.*;

public class FinalPricesWithADiscountInAShop {
	public static void main(String[] args) {
		int[] t1 = { 8, 4, 6, 2, 3 };
		System.out.println(Arrays.toString(finalPrices(t1)));

		int[] t2 = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(finalPrices(t2)));

		int[] t3 = { 10, 1, 1, 6 };
		System.out.println(Arrays.toString(finalPrices(t3)));
	}

	public static int[] finalPrices(int[] prices) {
		int n = prices.length;
		Stack<Integer> stack = new Stack<Integer>();
		
		for (int i = 0; i < n; i++) {
			while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
				prices[stack.pop()] -= prices[i];
			}
			stack.push(i);
		}
		
		return prices;
		
	}
}
