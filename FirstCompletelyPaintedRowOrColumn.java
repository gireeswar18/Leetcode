package leetcode;

//import java.util.*;

public class FirstCompletelyPaintedRowOrColumn {
	public static void main(String[] args) {
		int[][] t1 = { { 3, 2, 5 }, { 1, 4, 6 }, { 8, 7, 9 } };
		System.out.println(firstCompleteIndex(new int[] { 2, 8, 7, 4, 1, 3, 5, 6, 9 }, t1));
	}

	public static int firstCompleteIndex(int[] arr, int[][] mat) {
		int m = mat.length;
		int n = mat[0].length;

		int[][] map = new int[(m * n) + 1][2];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				map[mat[i][j]] = new int[] { i, j };
			}
		}
		
//		Map<Integer, List<Integer>> visRows = new HashMap<>();
//		Map<Integer, List<Integer>> visCols = new HashMap<>();
		
		int[] visRows = new int[m];
		int[] visCols = new int[n];
		
		for (int i = 0; i < m * n; i++) {
			int[] pos = map[arr[i]];
			
//			visRows.putIfAbsent(pos[0], new ArrayList<>());
//			visRows.get(pos[0]).add(pos[1]);
			
			visRows[pos[0]]++;
			
//			visCols.putIfAbsent(pos[1], new ArrayList<>());
//			visCols.get(pos[1]).add(pos[0]);
			
			visCols[pos[1]]++;
			
//			if (visRows.get(pos[0]).size() == n || visCols.get(pos[1]).size() == m) {
//				return i;
//			}
			
			if (visRows[pos[0]] == n || visCols[pos[1]] == m) {
				return i;
			}
			
		}
		
		return 0;
	}
}
