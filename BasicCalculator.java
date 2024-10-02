package leetcode;

import java.util.Arrays;
import java.util.Stack;

public class BasicCalculator {
	public static void main(String[] args) {
		String s = "- (3 + (4 + 5))";
		
		System.out.println(calculate(s));
	}

	public static int calculate(String s) {
		int res = 0;
		int len = s.length();
		int sign = 1;
		int num = 0;
		Stack<Integer> stack = new Stack<>();
		
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			
			if (c == ' ') {
				continue;
			}
			
			if (c == '+') {
				res += (sign * num);
				num = 0;
				sign = 1;
			}
			else if (c == '-') {
				res += (sign * num);
				num = 0;
				sign = -1;
			}
			else if (c == '(') {
				stack.push(res);
				stack.push(sign);
				res = 0;
				sign = 1;
			}
			else if (c == ')') {
				res += (sign * num);
				num = 0;
				
				res *= stack.pop();
				res += stack.pop();
			}
			else {
				num = num * 10 + (c - '0');
			}
			
			System.out.println("Res: " + res);
			System.out.println("Num: " + num);
			System.out.println(stack);
		}
		if (num != 0) {
			res += (sign * num);
		}
		return res;
	}
	public static int calculate2(String s) {
		int res = 0;
		int len = s.length();
		int sign = 1;
		int num = 0;
		int[] arr = new int[len];
		int top = -1;
		
		for (int i = 0; i < len; i++) {
			char c = s.charAt(i);
			
			if (c == ' ') {
				continue;
			}
			
			if (c == '+') {
				res += (sign * num);
				num = 0;
				sign = 1;
			}
			else if (c == '-') {
				res += (sign * num);
				num = 0;
				sign = -1;
			}
			else if (c == '(') {
//				stack.push(res);
				arr[++top] = res;
//				stack.push(sign);
				arr[++top] = sign;
				res = 0;
				sign = 1;
			}
			else if (c == ')') {
				res += (sign * num);
				num = 0;
				
//				res *= stack.pop();
				res *= arr[top--];
				
//				res += stack.pop();
				res += arr[top--];
			}
			else {
				num = num * 10 + (c - '0');
			}
			
			System.out.println("Res: " + res);
			System.out.println("Num: " + num);
			System.out.println(Arrays.toString(arr));
		}
		if (num != 0) {
			res += (sign * num);
		}
		return res;
	}
}
