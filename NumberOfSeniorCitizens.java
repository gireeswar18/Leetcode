package leetcode;

public class NumberOfSeniorCitizens {
	public static void main(String[] args) {
		String[] details = {"1313579440F2036","2921522980M5644"};
		System.out.println(countSeniors(details));
	}

	public static int countSeniors(String[] details) {

		int count = 0;
		
		for (String str : details) {
			
			int age = (str.charAt(11) - '0') * 10 + (str.charAt(12) - '0');
			
			if (age > 60)
				count++;
			
		}
		
		return count;

	}
}
