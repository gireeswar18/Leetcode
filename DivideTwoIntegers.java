package leetcode;

public class DivideTwoIntegers {
	public static void main(String[] args) {

		int res = divide(15, 3);
		
		System.out.println(res);
		
	}

	public static int divide(int dividend, int divisor) {
		
		int sign = (dividend < 0) ^ (divisor < 0) ?	-1 : 1;
		
		int res = 0;
		
		if (dividend == Integer.MIN_VALUE) {
			if (divisor == Integer.MIN_VALUE) return 1;
			if (divisor == -1) return Integer.MAX_VALUE;
			
			dividend += Math.abs(divisor);
            res++;
		}
		
        if(divisor == Integer.MIN_VALUE) return 0;
		
		dividend = Math.abs(dividend);
		divisor = Math.abs(divisor);
		
		while (dividend >= divisor) {
			
			int count = 1;
			int temp = divisor;
			
			System.out.println("Count: " + count);
			System.out.println("Temp: "  + temp);
			
			while (dividend - temp >= temp) {
				temp = temp << 1;
				count = count << 1;
				
				System.out.println("Count: " + count);
				System.out.println("Temp: "  + temp);
			}
			
			dividend -= temp;
			res += count;
			
		}
		
		return sign * res;
		
	}
}
