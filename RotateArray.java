package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        RotateArray r = new RotateArray();
        r.rotate(arr, 3);

        System.out.println(Arrays.toString(arr));
        
        sc.close();
    }

    public void rotate(int[] arr, int k) {
        k = k % arr.length;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    public static void reverse(int[] arr, int i, int j)
    {
        while (i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}