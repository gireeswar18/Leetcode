package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static void main(String[] args) {

        SpiralMatrix sp = new SpiralMatrix();
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mat2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        for (int i : sp.spiralOrder(mat2))
        {
            System.out.print(i + " ");
        }

    }

    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> list = new ArrayList<>();

        int rowStart = 0;
        int rowEnd = matrix.length;

        int colStart = 0;
        int colEnd = matrix[0].length;

        while (rowStart < rowEnd && colStart < colEnd)
        {

            for (int i = colStart; i < colEnd; i++)
            {
                list.add(matrix[rowStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i < rowEnd; i++)
            {
                list.add(matrix[i][colEnd - 1]);
            }
            colEnd--;


            if (rowStart < rowEnd) {
                for (int i = colEnd - 1; i >= colStart; i--) {
                    list.add(matrix[rowEnd - 1][i]);
                }
                rowEnd--;
            }

            if (colStart < colEnd) {
                for (int i = rowEnd - 1; i >= rowStart; i--) {
                    list.add(matrix[i][colStart]);
                }
                colStart++;
            }

        }

        return list;
    }
}
