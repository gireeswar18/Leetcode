package leetcode;

import java.util.Arrays;

public class MoveZeroes {
	public static void main(String[] args) {
		int[] b = {0,1, 2,0, 2, 0};
		moveZeroes(b);
		
		System.out.println(Arrays.toString(b));
	}

	public static void moveZeroes(int[] arr) {
		int z = 0;
		int i = 0;
		
		while (i < arr.length) {
			
			if (arr[i] != 0 && arr[z] == 0) {
				swap(arr, i , z);
				z++;
			}
			if (arr[z] != 0)
				z++;
			i++;
		}
	}
	
	public static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
}
