package leetcode;


public class CountServersThatCommunicate {
	public static void main(String[] args) {
		int[][] t1 = { { 1, 0, }, { 1, 1 } };
		System.out.println(countServers(t1));

		int[][] t2 = { { 1, 0 }, { 0, 1 } };
		System.out.println(countServers(t2));

		int[][] t3 = { { 1, 1, 0, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 1 } };
		System.out.println(countServers(t3));
	}

	public static int countServers(int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		int[] rows = new int[m];
		int[] cols = new int[n];
//		List<int[]> server = new ArrayList<int[]>();

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
//					server.add(new int[] { i, j });
					rows[i]++;
					cols[j]++;
				}
			}
		}

		int cnt = 0;
//		for (int[] s : server) {
//			if (rows[s[0]] >= 2 || cols[s[1]] >= 2) {
//				cnt++;
//			}
//		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1 && (rows[i] >= 2 || cols[j] >= 2)) {
					cnt++;
				}
			}
		}

		return cnt;

	}
}
