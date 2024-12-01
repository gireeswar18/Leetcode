package leetcode;

import java.util.Arrays;

public class RotatingTheBox {
	public static void main(String[] args) {
		char[][] t1 = {
	            {'#', '#', '*', '.', '*', '.'},
	            {'#', '#', '#', '*', '.', '.'},
	            {'#', '#', '#', '.', '#', '.'}
	        };
		
		
		for (char[] arr : rotateTheBox(t1)) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println();
		
		char[][] t2 = {
	            {'#', '.', '*', '.'},
	            {'#', '#', '*', '.'}
	        };
		
		for (char[] arr : rotateTheBox(t2)) {
			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println();
		
		char[][] t3 = {{'#', '.', '#'}};
		
		for (char[] arr : rotateTheBox(t3)) {
			System.out.println(Arrays.toString(arr));
		}
	}

	public static char[][] rotateTheBox(char[][] box) {
		int row = box.length;
		int col = box[0].length;
		
		
		for (int i = 0; i < row; i++) {
			int empty = -1;
			
			for (int j = col - 1; j >= 0; j--) {
				if (box[i][j] == '*') {
					empty = -1;
				}
				else if (box[i][j] == '.' && empty == -1) {
					empty = j; 
				}
				else if (box[i][j] == '#' && empty != -1) {
					box[i][j] = '.';
					box[i][empty] = '#';
					empty--;
				}
			}
			
		}
		
		char[][] res = new char[col][row];
		int x = 0, y = 0;
		
		for (int c = 0; c < col; c++) {
			for (int r = row - 1; r >= 0; r--) {
				res[x][y] = box[r][c];
				y++;
			}
			x++;
			y = 0;
		}
		
		return res;
	}
}
