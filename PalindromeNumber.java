package leetcode;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        PalindromeNumber p = new PalindromeNumber();
        System.out.println(p.isPalindrome(n));
        sc.close();    }

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int num = x;
        int rev = 0;
        while (x != 0)
        {
            rev = rev * 10 + (x % 10);
            x /= 10;
        }

        return num == rev;
    }
}
