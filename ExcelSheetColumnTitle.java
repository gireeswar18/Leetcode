package leetcode;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {

        ExcelSheetColumnTitle e = new ExcelSheetColumnTitle();

        System.out.println(e.convertToTitle(701));

    }

    public String convertToTitle(int columnNumber) {

        StringBuilder sb = new StringBuilder();

        while (columnNumber != 0) {

            if (columnNumber % 26 == 0) {
                sb.insert(0, 'Z');
                columnNumber = (columnNumber / 26) - 1;
            }
            else {
                char c = (char) ('A' + (columnNumber % 26) - 1);
                sb.insert(0, c);
                columnNumber /= 26;
            }
        }

        return sb.toString();

    }

}
