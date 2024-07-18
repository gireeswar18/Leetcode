package leetcode;

public class PyramidCompliment {

    public static void main(String[] args) {

        int size = 4;

        for (int i = 0; i < size; i++)
        {
            int n = (size * 2) - (i * 2);

            for (int j = 1; j <= size * 2; j++)
            {
                if (j <= n/2 || j > ((size * 2) - n/2))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

}
