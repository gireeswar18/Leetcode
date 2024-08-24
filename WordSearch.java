package leetcode;

import java.util.*;

public class WordSearch {
	public static void main(String[] args) {

		char[][] arr = {
				  {'A', 'B', 'C', 'E'},
				    {'S', 'F', 'C', 'S'},
				    {'A', 'D', 'E', 'E'}
			};

		String word = "ABC";

		System.out.println(exist(arr, word));

	}

	public static boolean exist(char[][] board, String word) {
		
		
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				
				Set<String> set = new HashSet<>();


				if (board[i][j] == word.charAt(0)) {
					
					boolean res = search(board, i, j, word, 0, set);


					if (res)
						return true;
					
				}

			}
		}
		return false;

	}
	
	public static boolean search(char[][] arr, int x, int y, String word, int ind, Set<String> set) {
		
		if (ind == word.length()) return true;
		
		if (x < 0 || y < 0 || x >= arr.length || y >= arr[0].length || arr[x][y] != word.charAt(ind) ||
				!set.add(x + "" + y)) {
			return false;
		}
		
		boolean res = search(arr, x - 1, y, word, ind + 1, set) ||
				search(arr, x + 1, y, word, ind + 1, set) ||
				search(arr, x, y - 1, word, ind + 1, set) ||
				search(arr, x, y + 1, word, ind + 1, set);
		
		
		set.remove(x + "" + y);
		
		return res;
	}


}
