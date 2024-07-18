package leetcode;

import java.util.Scanner;

public class Jump {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int size = scanner.nextInt();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++)
		{
			arr[i] = scanner.nextInt();
		}
		scanner.close();
		System.out.println(new Jump().canJump(arr));
	}
	
	public boolean canJump(int[] arr) {
		
		if (arr.length == 1)
			return true;
		
		if (arr[0] == 0) return false;
		// 2 3 1 1 4
		/*
		 	1 -> 2 > i - j (1)
		 	3 > 2
		 */
		
		/*
		  3,2,1,0,4
		  2-> 3 > 1
		  1-> 2 > 1
		  0-> 1 > 1, 2 > 2, 3 > 3, 
		 */
		for (int i = 0; i < arr.length - 1; i++)
		{
			if (arr[i] == 0)
			{
				boolean jump = false;
	
				for (int j = i - 1; j >= 0; j--)
				{
					if (arr[j] > i - j)
					{
						jump = true;
						break;
					}
				}
				if (!jump) return false;
			}
		}
        return true;
    }
}
