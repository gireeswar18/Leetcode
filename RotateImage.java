package leetcode;

import java.util.Arrays;

public class RotateImage {

    public static void main(String[] args) {

        int[][] mat1 = new int[][]{{1, 2, 3},
                                    {4, 5, 6},
                                    {7, 8, 9}};
//        int[][] mat2 = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};

        RotateImage r = new RotateImage();
        r.rotate(mat1);

        for (int[] a : mat1)
            System.out.print(Arrays.toString(a) + "\n");
    }

    public void rotate(int[][] matrix) {

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++)
        {
            int l = 0;
            int r = matrix[0].length - 1;

            while (l < r)
            {
                int temp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = temp;
                l++;
                r--;
            }
        }

    }

}
