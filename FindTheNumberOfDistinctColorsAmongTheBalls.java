package leetcode;

import java.util.*;

public class FindTheNumberOfDistinctColorsAmongTheBalls {
	public static void main(String[] args) {
		int[][] t1 = { { 1, 4 }, { 2, 5 }, { 1, 3 }, { 3, 4 } };
		System.out.println(Arrays.toString(queryResults2(4, t1)));
	}

	public static int[] queryResults(int n, int[][] queries) {

		int[] res = new int[queries.length];
		int ind = 0;
		int dis = 0;
		int[] colors = new int[n + 2];
		int[] ballColor = new int[n + 1];

		for (int[] q : queries) {
			int ball = q[0];
			int color = q[1];

			if (ballColor[ball] == 0) {
				ballColor[ball] = color;

				if (colors[color] == 0) {
					dis++;
				}
				colors[color]++;
			} else {
				int oldColor = ballColor[ball];
				colors[oldColor]--;
				if (colors[oldColor] == 0)
					dis--;

				if (colors[color] == 0)
					dis++;
				colors[color]++;

				ballColor[ball] = color;
			}

			res[ind++] = dis;
		}

		return res;
	}

	public static int[] queryResults2(int n, int[][] queries) {

		int[] res = new int[queries.length];
		int ind = 0;

		Map<Integer, Integer> colors = new HashMap<>();

		Map<Integer, Integer> ballColor = new HashMap<>();

		for (int[] q : queries) {
			int ball = q[0];
			int color = q[1];

			if (ballColor.containsKey(ball)) {
				int oldColor = ballColor.get(ball);

				colors.put(oldColor, colors.get(oldColor) - 1);

				if (colors.get(oldColor) == 0) colors.remove(oldColor);
			}
			colors.putIfAbsent(color, 0);
			ballColor.put(ball, color);

			colors.put(color, colors.get(color) + 1);
			res[ind++] = colors.size();
		}

		return res;
	}
}
