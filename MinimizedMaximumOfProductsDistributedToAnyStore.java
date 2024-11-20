package leetcode;

public class MinimizedMaximumOfProductsDistributedToAnyStore {
	public static void main(String[] args) {
		int[] t1 = {11, 6};
		System.out.println(minimizedMaximum(6, t1));
		
		int[] t2 = {15,10,10};
		System.out.println(minimizedMaximum(7, t2));
		
		int[] t3 = {10000};
		System.out.println(minimizedMaximum(1, t3));
	}

	public static int minimizedMaximum(int n, int[] quantities) {
		int min = 1;
		int max = Integer.MIN_VALUE;
		
		for (int num : quantities) {
			if (max < num) max = num;
		}
		
		while (min <= max) {
			int distributions = 0;

			int mid = (min + max) / 2;
			
			for (int q : quantities) {
//				distributions += (q / mid) + (q % mid != 0 ? 1 : 0);
				distributions += (q + mid - 1) / mid;
			}
						
			if (distributions <= n) {
				max = mid - 1;
			}
			else {
				min = mid + 1;
			}
			
		}
		
		return min;
	}
}
