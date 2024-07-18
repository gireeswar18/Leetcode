package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingandRepeatedValues {

    public static void main(String[] args) {

        FindMissingandRepeatedValues f = new FindMissingandRepeatedValues();
        int[][] mat = new int[][]{{1,3},{2,2}};
        System.out.println(Arrays.toString(f.findMissingAndRepeatedValues(mat)));
    }

    public int[] findMissingAndRepeatedValues(int[][] grid) {

//        Set<Integer> hs = new HashSet<>();
//        int dup = -1;
//
//        int n = grid.length * grid.length;
//
//        int totalSum = n * (n + 1) / 2;
//
//        for (int i = 0; i < grid.length; i++)
//        {
//            for (int j = 0; j < grid.length; j++)
//            {
//                if (hs.add(grid[i][j]))
//                {
//                    totalSum -= grid[i][j];
//                }
//                else
//                {
//                    dup = grid[i][j];
//                }
//            }
//        }
//
//        return new int[]{dup, totalSum};

        int dup = -1;
        int n = grid.length;
        boolean[] arr = new boolean[n * n + 1];

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (arr[grid[i][j]])
                {
                    dup = grid[i][j];
                }
                else
                {
                    arr[grid[i][j]] = true;
                }
            }
        }

        for (int i = 1; i < arr.length; i++)
        {
            if (!arr[i])
            {
                return new int[]{dup, i};
            }
        }
        return new int[]{};

    }

}
