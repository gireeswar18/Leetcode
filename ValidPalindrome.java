package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome v = new ValidPalindrome();
        String s = "0P";
        System.out.println(v.isPalindrome(s));
    }
    public boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length() - 1;

        while (i < j)
        {
            if (((s.charAt(i) < 'a' || s.charAt(i) > 'z') && (s.charAt(i) < 'A' || s.charAt(i) > 'Z'))
            		&& !(s.charAt(i) >= '0' && s.charAt(i) <= '9'))
            {
                i++;
            }
            else if (((s.charAt(j) < 'a' || s.charAt(j) > 'z') && (s.charAt(j) < 'A' || s.charAt(j) > 'Z'))
            		&& !(s.charAt(j) >= '0' && s.charAt(j) <= '9'))
            {
                j--;
            }
            else if (s.charAt(i) != s.charAt(j))
            {
            	char a = s.charAt(i);
            	char b = s.charAt(j);
            	
            	
            	if (a >= '0' && a <= '9' || b >= '0' && b <= '9')
            	{
            		if (a == b)
            		{
            			i++;
            			j--;
            		}
            		else {
						return false;
					}
            	}
            	
                if (a > b) // a is small
                {
                	a = (char) (a - 32);
                }
                else 
                {
					b = (char) (b - 32);
				}
                if (a != b)
                	return false;
                else
                {
                	i++;
                	j--;
                }
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
