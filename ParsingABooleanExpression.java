package leetcode;

public class ParsingABooleanExpression {
	public static void main(String[] args) {
		String exp = "!(&(!(&(f)),&(t),|(f,f,t)))";
		System.out.println(parseBoolExpr(exp));
	}

	public static boolean parseBoolExpr(String expression) {
		char[] arr = expression.toCharArray();
		char[] stack = new char[arr.length];
		int top = -1;

		for (char c : arr) {
			if (c == ')') {
				int temp = top;
				while (stack[top] != '(') {
					top--;
				}
				char op = stack[top - 1];
				System.out.println("Curr Op: " + op);
				char res;
				if (op == '&') {
					res = parseAnd(stack, top, temp);
				} else if (op == '|') {
					res = parseOr(stack, top, temp);
				} else {
					res = parseNot(stack, top, temp);
				}

				stack[--top] = res;
			} else if (c != ',') {
				stack[++top] = c;
			}
			for (int i = 0; i <= top; i++) {
				System.out.print(stack[i] + ", ");
			}
			System.out.println();
			System.out.println("Top: " + stack[top] + ", Ind: " + top);
			System.out.println();
		}

		return stack[0] == 't' ? true : false;
	}

	public static char parseAnd(char[] stack, int start, int end) {
		boolean res = stack[start + 1] == 't' ? true : false;

		for (int i = start + 1; i <= end; i++) {
			if (stack[i] == 't' || stack[i] == 'f')
				res &= (stack[i] == 't' ? true : false);
		}

		return res == true ? 't' : 'f';
	}

	public static char parseOr(char[] stack, int start, int end) {
		boolean res = stack[start + 1] == 't' ? true : false;

		for (int i = start + 1; i <= end; i++) {
			if (stack[i] == 't' || stack[i] == 'f')
				res |= (stack[i] == 't' ? true : false);
		}

		return res == true ? 't' : 'f';
	}

	public static char parseNot(char[] stack, int start, int end) {
		return stack[end] == 'f' ? 't' : 'f';
	}
}
