package leetcode;

public class ConvertDateToBinary {
	public static void main(String[] args) {
		
		String date = "2080-02-29";
		
		System.out.println(convertDateToBinary(date));
		
	}
	
	public static String convertDateToBinary(String date) {
        
		StringBuilder sb = new StringBuilder();
		
		int year = 0, month = 0, day = 0;
		
		int ind = 0;
		
		while (ind < 4) {
			year = year * 10 + (date.charAt(ind++) - '0');
		}
		ind++;
		
		while (ind < 7) {
			month = month * 10 + (date.charAt(ind++) - '0');
		}
		ind++;
		
		while (ind < 10) {
			day = day * 10 + (date.charAt(ind++) - '0');
		}
		
		sb.append(intToBinary(year));
		sb.append("-");
		sb.append(intToBinary(month));
		sb.append("-");
		sb.append(intToBinary(day));
		
		return sb.toString();
		
    }
	
	public static String intToBinary(int num) {
		
		StringBuilder sb = new StringBuilder();
		
		while (num != 0) {
			
			sb.insert(0, num % 2);
			num /= 2;
			
		}
		
		return sb.toString();
		
	}
}
