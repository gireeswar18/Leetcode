package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ValidSudoku {

    public static void main(String[] args) {

        ValidSudoku v = new ValidSudoku();

        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '2', '7', '9'}
        };

        System.out.println(v.isValidSudoku(board));

    }

    public boolean isValidSudoku(char[][] board) {

        Map<Integer, HashSet<Character>> rows = new HashMap<>();
        Map<Integer, HashSet<Character>> cols = new HashMap<>();
        Map<Integer, HashSet<Character>> grids = new HashMap<>();

        for (int i = 0; i < 9; i++)
        {
            rows.putIfAbsent(i, new HashSet<>());

            for (int j = 0; j < 9; j++)
            {
                cols.putIfAbsent(j, new HashSet<>());
                grids.putIfAbsent((i / 3) *  3 + (j / 3), new HashSet<>());

                char val = board[i][j];

                if (val == '.')
                    continue;

                if (!(rows.get(i).add(val) && cols.get(j).add(val) && grids.get((i / 3) * 3 + (j / 3)).add(val)))
                    return false;
            }
        }

        return true;

    }

}
