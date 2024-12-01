package leetcode;

public class MeetingRooms_II {
	public static void main(String[] args) {
		int[][] t1 = { { 0, 30 }, { 5, 10 }, { 15, 20 } };
		System.out.println(minMeetingRooms(t1));

		int[][] t2 = { { 7, 10 }, { 2, 4 } };
		System.out.println(minMeetingRooms(t2));
	}

	public static int minMeetingRooms(int[][] intervals) {
		int[] dp = new int[1000010];
		
		for (int[] i : intervals) {
			dp[i[0]]++;
			dp[i[1]]--;
		}
		
		int cnt = dp[0];
		
		for (int i = 1; i < dp.length; i++) {
			dp[i] += dp[i - 1];
			cnt = Math.max(cnt, dp[i]);
		}
		
		return cnt;
	}
}
