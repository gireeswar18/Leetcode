package leetcode;

import java.util.Stack;

public class ReverseSubstringsBetweenEachPairOfParentheses {
    public static void main(String[] args) {
        String s1 = "(abcd)";
        String s2 = "(u(love)i)";
        String s3 = "(ed(et(oc))el)";
        String s4 = "a(bcdefghijkl(mno)p)q";
        String s5 = "(ab)(cd)";

        System.out.println(reverseParentheses(s5));
    }
    public static String reverseParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < s.length(); i++)
        {
            if (stack.isEmpty() && s.charAt(i) != '(')
            {
                res.append(s.charAt(i));
                continue;
            }
            if (s.charAt(i) == ')')
            {
                StringBuilder sb = new StringBuilder();
                // pop out and form a string until a ( is seen
                while (stack.peek() != '(')
                {
                    sb.append(stack.pop());
                }
                stack.pop();
                // again push the word into the stack
                if (stack.isEmpty())
                {
                    res.append(sb);
                }
                else
                {
                    for (int j = 0; j < sb.length(); j++)
                    {
                        stack.push(sb.charAt(j));
                    }
                }
            }
            else if (s.charAt(i) == '(')
            {
                stack.push(s.charAt(i));
            }
            else
            {
                stack.push(s.charAt(i));
            }
        }
        return res.toString();
    }
}
