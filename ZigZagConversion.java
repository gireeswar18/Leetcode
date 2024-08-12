package leetcode;

public class ZigZagConversion {
	public static void main(String[] args) {
		
		String str = "PAYPALISHIRING";
		int num = 4;
		
		System.out.println(convert(str, num));
		
	}

	public static String convert(String s, int numRows) {
		
		char[][] arr = new char[numRows][s.length()];
		
		int curr = 0;
		
		int row = 0;
		int col = 0;
		
		while (curr < s.length()) {
			
			while (curr < s.length() && row < numRows) {
				
				arr[row++][col] = s.charAt(curr++);
				
			}
			
			row = Math.max(0, row - 2);
			
			while (curr < s.length() && row > 0) {
				
				arr[row--][++col] = s.charAt(curr++);
				
			}
			
			col++;
			
		}
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
				if (arr[i][j] != '\u0000')
					sb.append(arr[i][j]);
				
			}
		}
		
		return sb.toString();
		
	}
}
