package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        String s = "0P";
        System.out.println(v.isPalindrome(s));
    }
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;

        while (i < j)
        {
            if ((s.charAt(i) < 'a' || s.charAt(i) > 'z') && !(s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                i++;
            }
            else if ((s.charAt(j) < 'a' || s.charAt(j) > 'z') && !(s.charAt(j) >= '0' && s.charAt(j) <= '9'))
            {
                j--;
            }
            else if (s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
}
