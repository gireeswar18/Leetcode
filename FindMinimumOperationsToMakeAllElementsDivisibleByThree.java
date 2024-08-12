package leetcode;

public class FindMinimumOperationsToMakeAllElementsDivisibleByThree {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		
		System.out.println(minimumOperations(arr));
	}

	public static int minimumOperations(int[] nums) {
		
		int op = 0;
		
		for (int num : nums) {
						
			if (num % 3 != 0)
				op++;
						
		}
		
		return op;
		
	}
}
