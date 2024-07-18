package leetcode;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {

        ExcelSheetColumnNumber e = new ExcelSheetColumnNumber();

        System.out.println(e.titleToNumber("AAA"));

    }

    public int titleToNumber(String columnTitle) {

        int res = 0;

        for (int i = 0; i < columnTitle.length(); i++)
        {
            res = res * 26;
            res = res + (columnTitle.charAt(i) % 'A') + 1;
        }

        return res;

    }

}
