package leetcode;

public class MinimumRecolorsToGetKConsecutiveBlackBlocks {
	public static void main(String[] args) {
		System.out.println(minimumRecolors("WBBWWBBWBW", 7));
	}

	public static int minimumRecolors(String blocks, int k) {

		int l = 0, r = 0, n = blocks.length();
		int min = Integer.MAX_VALUE;
		int currWhite = 0;

		while (r < n) {
			if (blocks.charAt(r) == 'W') {
				currWhite++;
			}
			
			if (r - l + 1 == k) {
				min = Math.min(min, currWhite);
				if (blocks.charAt(l) == 'W') {
					currWhite--;
				}
				l++;
			}
			r++;
		}

		return min == Integer.MAX_VALUE ? 0 : min;
	}
}
