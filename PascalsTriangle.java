package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        int rows = 5;

        PascalsTriangle p = new PascalsTriangle();
        List<List<Integer>> res = p.generate(rows);

        System.out.println(res);

    }

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < numRows; i++)
        {
            int n = 1;
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++)
            {
                row.add(n);
                n = n * (i - j) / (j + 1);
            }

            list.add(row);
        }

        return list;

    }

}
