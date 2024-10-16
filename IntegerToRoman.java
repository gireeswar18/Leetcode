package leetcode;

import java.util.*;

public class IntegerToRoman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(new IntegerToRoman().intToRoman(num));
        
        sc.close();

    }

    public String intToRoman(int num) {

        int[] arr = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder res = new StringBuilder();
        int i = 0;

        while (num != 0)
        {
            if (num >= arr[i])
            {
                num -= arr[i];
                res.append(getChar(arr[i]));
            }
            else
            {
                i++;
            }
        }

        return res.toString();

        // 58 -> LVIII
        /*
            compare num and 50
            58 >= 50 ? , 8 >= 50? no -> 8 >= 10, 8 >= 5, 3 >= 5, 3 >= 1, 2, 1, 0 >= 1 X
                num -= 50, num -= 5, num -= 1
                ans -> LVIII
         */

        /*
            num = 3749, 2749, 1749, 749, 249, 149, 49, 9
            num >= 1000?, num >= 500, num >= 100, num >= 50, num >= XL, num >= 9
                if failed num >= 40, num >= 9
                num -= 1000, num -= 500, num -= 100
                ans -> MMMDCCXLIX
         */
    }

    public static String getChar(int num) {
        switch (num) {
            case 1000:
                return "M";
            case 900:
                return "CM";
            case 500:
                return "D";
            case 400:
                return "CD";
            case 100:
                return "C";
            case 90:
                return "XC";
            case 50:
                return "L";
            case 40:
                return "XL";
            case 10:
                return "X";
            case 9:
                return "IX";
            case 5:
                return "V";
            case 4:
                return "IV";
            case 1:
                return "I";
        }
        return null;
    }
}
