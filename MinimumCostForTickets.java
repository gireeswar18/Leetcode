package leetcode;

public class MinimumCostForTickets {
	public static void main(String[] args) {
		int[] d1 = { 1, 4, 6, 7, 8, 20 };
		int[] c1 = { 2, 7, 15 };
		System.out.println(mincostTickets(d1, c1));

		int[] d2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 30, 31 };
		int[] c2 = { 2, 7, 15 };
		System.out.println(mincostTickets(d2, c2));
	}

	public static int mincostTickets(int[] days, int[] costs) {
		int n = days.length;

		int[] dp = new int[n + 1];

//		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
//		map.put(1, costs[0]);
//		map.put(7, costs[1]);
//		map.put(30, costs[2]);
		
		int[] map = new int[31];
		map[1] = costs[0];
		map[7] = costs[1];
		map[30] = costs[2];

		for (int i = n - 1; i >= 0; i--) {
			dp[i] = Integer.MAX_VALUE;
			for (int time : new int[] {1, 7, 30}) {
				int j = i;

				while (j < n && days[j] < days[i] + time) {
					j++;
				}
				dp[i] = Math.min(dp[i], dp[j] + map[time]);
			}
		}

		return dp[0];
	}
}
