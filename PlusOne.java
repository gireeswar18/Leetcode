package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class PlusOne {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(plusOne(arr)));
		
		sc.close();
	}
	
	public static int[] plusOne(int[] arr) {
        
		int len = arr.length;
		
		if (arr[len - 1] < 9)
		{
			arr[len - 1]++;
		}
		
		else
		{
			int carry = 1;
			int ind = len - 1;
			
			while (carry == 1 && ind >= 0)
			{
				int sum = arr[ind] + carry;
				arr[ind] = sum % 10;
				carry = sum / 10;
				ind--;
			}
			
			if (carry == 1)
			{
				int[] res = new int[len + 1];
				
				res[0] = 1;
				
				for (int i = 1; i < len + 1; i++)
				{
					res[i] = arr[i - 1];
 				}
				return res;
			}
			
		}
		return arr;
		
    }
}
