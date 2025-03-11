package leetcode;

public class AlternatingGroups_II {
	public static void main(String[] args) {
		int[] t1 = { 0, 1, 0, 1, 0 };
		System.out.println(numberOfAlternatingGroups(t1, 3));
		int[] t2 = { 0, 1, 0, 0, 1, 0, 1 };
		System.out.println(numberOfAlternatingGroups(t2, 6));
		int[] t3 = { 1, 1, 0, 1 };
		System.out.println(numberOfAlternatingGroups(t3, 4));
	}

	public static int numberOfAlternatingGroups(int[] colors, int k) {
		int l = 0;
		
		int n = colors.length;
		int cnt = 0;
		
		for (int r = 1; r < n + k - 1; r++) {
			if (colors[r % n] == colors[(r - 1) % n]) {
				l = r;
			}
			if (r - l + 1 == k) {
				l++;
				cnt++;
			}
		}
		return cnt;
	}
}
