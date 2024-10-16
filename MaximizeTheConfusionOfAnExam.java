package leetcode;

public class MaximizeTheConfusionOfAnExam {

    public static void main(String[] args) {

//        String one = "TTFTTFTT"; // 5
//        String two = "TFFT"; // 3
        String three = "TTFF"; // 4, k -> 2

        MaximizeTheConfusionOfAnExam m = new MaximizeTheConfusionOfAnExam();
        int res = m.maxConsecutiveAnswers(three, 2);

        System.out.println(res);
    }

    public int maxConsecutiveAnswers(String answerKey, int k) {

        int t = max('T', answerKey, k);
        int f = max('F', answerKey, k);

        return Math.max(t, f);

    }

    public static int max (char t, String str, int k)
    {
        int left = 0;
        int right = 0;

        int op = 0;
        int res = 0;

        while (right < str.length())
        {
            if (str.charAt(right) != t)
            {
                op++;
                while (op > k)
                {
                    if (str.charAt(left) != t)
                    {
                        op--;
                    }
                    left++;
                }
            }
            res = Math.max(res, right - left + 1);
            right++;
        }

        return res;
    }

}
