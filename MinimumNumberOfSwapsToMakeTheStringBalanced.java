package leetcode;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
	public static void main(String[] args) {
		String s = "]]][[[";

		System.out.println(minSwaps(s));
	}

	public static int minSwaps(String s) {
		int n = s.length();
		int count = 0;
		char[] arr = s.toCharArray();
		int swaps = 0;
		
		for (int i = 0; i < n; i++) {
			
			if (arr[i] == '[')
				count++;
			else {
				if (count == 0)
					swaps++;
				else 
					count--;
			}
			
		}
		
		return (swaps + 1) / 2;
	}
}
