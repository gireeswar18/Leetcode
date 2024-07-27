package leetcode;

public class SqrtOfx {
	public static void main(String[] args) {
		
		System.out.println(mySqrt(2147395599));
		System.out.println(mySqrt(17));
		
	}
	
	public static int mySqrt(int x) {
        
		if (x == 1)
		{
			return 1;
		}
		
		long left = 1;
		long right = x / 2;
		long mid;
		
		while (left <= right)
		{

			mid = left + (right - left) / 2;
			long square = mid * mid;
			
			if (square == x)
			{
				return (int) mid;
			}
			else if (square < x)
			{
				left = mid + 1;
			}
			else 
			{
				right = mid - 1;
			}
		}
		
		return (int) right;
    }
}
