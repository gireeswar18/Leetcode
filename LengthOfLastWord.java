package leetcode;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(new LengthOfLastWord().lengthOfLastWord(str));
        
        sc.close();
    }

    public int lengthOfLastWord(String s) {
        /*
            "word "
         */

        int i = s.length() - 1;
        int count = 0;

        while (i >= 0 && s.charAt(i) == ' ')
        {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ')
        {
            count++;
            i--;
        }

        return count;
    }
}
