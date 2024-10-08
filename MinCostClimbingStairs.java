package leetcode;

public class MinCostClimbingStairs {
	public static void main(String[] args) {

//		int[] arr = {1,100,1,1,1,100,1,1,100,1};
		int[] arr = {10,15,20};
		
		System.out.println(minCostClimbingStairs(arr));
		
	}

	public static int minCostClimbingStairs(int[] cost) {
		
		int len = cost.length;
		
		int[] dp = new int[len + 1];
		
		dp[0] = 0;
		dp[1] = 0;
		
		for (int i = 2; i < len + 1; i++) {
			
			dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
			
		}
		
		return dp[len];
		
	}
}
