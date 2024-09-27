package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public static void main(String[] args) {

		String[] res = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };

		System.out.println(evalRPN(res));

	}

	public static int evalRPN(String[] tokens) {

		int[] stack = new int[tokens.length];
		int ind = -1;

		for (String str : tokens) {
			switch (str) {
			case "+": {
				stack[ind - 1] += stack[ind];
				ind--;
				break;
			}
			case "-": {
				stack[ind - 1] -= stack[ind];
				ind--;
				break;
			}
			case "*": {
				stack[ind - 1] *= stack[ind];
				ind--;
				break;
			}
			case "/": {
				stack[ind - 1] /= stack[ind];
				ind--;
				break;
			}
			default: {

				stack[++ind] = Integer.parseInt(str);

			}
			}

		}

		return stack[0];

	}
}
