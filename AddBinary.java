package leetcode;

import java.util.Scanner;

public class AddBinary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String b = sc.next();
		
		System.out.println(addBinary(a, b));
		
		sc.close();
	}
	
	public static String addBinary(String a, String b) {
        
		int[] res = new int[Math.max(a.length(), b.length())];
		
		int resInd = res.length - 1;
		
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		
		while (i >= 0 && j >= 0)
		{
			int x = a.charAt(i) - '0';
			int y = b.charAt(j) - '0';
			
			int sum = x + y + carry;
			
			res[resInd] = sum % 2;
			carry = sum / 2;
			
			resInd--;
			i--;
			j--;
		}
		
		while (i >= 0)
		{
			int x = a.charAt(i) - '0';
			int sum = x + carry;
			
			res[resInd] = sum % 2;
			carry = sum / 2;
			
			resInd--;
			i--;
		}
		
		while (j >= 0)
		{
			int x = b.charAt(j) - '0';
			int sum = x + carry;
			
			res[resInd] = sum % 2;
			carry = sum / 2;
			
			resInd--;
			j--;
		}
		
		StringBuilder sb = new StringBuilder();
		
		if (carry == 1)
		{
			sb.append(1);
		}
		
		for (int num : res)
		{
			sb.append(num);
		}
		
		return sb.toString();
		
    }
}
