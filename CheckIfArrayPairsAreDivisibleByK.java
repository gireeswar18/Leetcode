package leetcode;

public class CheckIfArrayPairsAreDivisibleByK {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 14};
		int k = 7;
		
		System.out.println(canArrange(arr, k));
	}

	public static boolean canArrange(int[] arr, int k) {
		
		int[] freq = new int[k];
		
		for (int n : arr) {
			
//			int rem = n % k;
//			
//			if (rem < 0) rem += k;
//			
//			freq[rem]++;
			
			freq[((n % k) + k) % k]++;
			
		}
				
		if (freq[0] % 2 == 1) return false;
		
		for (int i = 1; i <= k / 2; i++) {
			if (freq[i] != freq[k - i])
				return false;
		}
		
		return true;
		
	}
}
