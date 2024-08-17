package leetcode;

public class FinalValueOfVariableAfterPerformingOperations {
	public static void main(String[] args) {
		
		String[] arr = {"X++","++X","--X","X--"};
		
		System.out.println(finalValueAfterOperations(arr));
		
	}

	public static int finalValueAfterOperations(String[] operations) {

		int res = 0;
		
		for (String str : operations) {
			
			if (str.charAt(0) == '+' || str.charAt(2) == '+')
				res++;
			else
				res--;
			
		}
		
		return res;
		
	}
}
