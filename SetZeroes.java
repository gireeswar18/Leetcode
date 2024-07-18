package leetcode;

public class SetZeroes {

    public static void main(String[] args) {

        int[][] mat1 = {{1,1,1},{1,0,1},{1,1,1}};
        int[][] mat2 = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        SetZeroes s = new SetZeroes();
        s.setZeroes(mat2);

        for (int i = 0; i < mat2.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                System.out.print(mat2[i][j]);
            }
            System.out.println();
        }
    }

    public void setZeroes(int[][] matrix) {

        boolean[] a = new boolean[matrix.length]; // rows
        boolean[] b = new boolean[matrix[0].length]; // cols

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    a[i] = true;
                    b[j] = true;
                }
            }
        }

        for (int i = 0; i < a.length; i++)
        {
            if (a[i])
            {
                for (int j = 0; j < matrix[0].length; j++)
                {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < b.length; i++)
        {
            if (b[i])
            {
                for (int j = 0; j < matrix.length; j++)
                {
                    matrix[j][i] = 0;
                }
            }
        }

    }

}
