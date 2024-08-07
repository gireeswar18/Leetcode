package leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntegerToEnglishWords {
	public static void main(String[] args) {
		
//		System.out.println(numberToWords(2147483647));
		System.out.println(numberToWords(2000010));
		System.out.println(numberToWords(217));
		System.out.println(numberToWords(647));
		
	}

	public static String numberToWords(int num) {
		
		if (num == 0) return "Zero";

		
		int temp = 0, count = 0, place = 1, f = 1;
		StringBuilder res = new StringBuilder();
		
		while (num != 0) {
			
			temp = temp + (num % 10) * f;
			num /= 10;
			count++;
			f *= 10;
			
			if (count == 3 || num == 0) {
				
				res.insert(0, makeWords(temp, place));
				place++;
				f = 1;
				temp = 0;
				count = 0;
				
			}
			
		}
		
		return res.toString().trim();
		
	}
	
	private static String makeWords(int num, int place) {
				
		StringBuilder res = new StringBuilder();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(9, "Nine");
		map.put(10, "Ten");
		map.put(11, "Eleven");
		map.put(12, "Twelve");
		map.put(13, "Thirteen");
		map.put(14, "Fourteen");
		map.put(15, "Fifteen");
		map.put(16, "Sixteen");
		map.put(17, "Seventeen");
		map.put(18, "Eighteen");
		map.put(19, "Nineteen");
		map.put(20, "Twenty");
		map.put(30, "Thirty");
		map.put(40, "Forty");
		map.put(50, "Fifty");
		map.put(60, "Sixty");
		map.put(70, "Seventy");
		map.put(80, "Eighty");
		map.put(90, "Ninety");
		map.put(100, "One Hundred");
		map.put(200, "Two Hundred");
		map.put(300, "Three Hundred");
		map.put(400, "Four Hundred");
		map.put(500, "Five Hundred");
		map.put(600, "Six Hundred");
		map.put(700, "Seven Hundred");
		map.put(800, "Eight Hundred");
		map.put(900, "Nine Hundred");
		map.put(1000, "One Thousand");
//		map.put(1000000, "Million");
//		map.put(1000000000, "Billion");
		
		
		int fact = 1;
		int teen = 0;

		
		while (num != 0) {
			
			int temp = 0;

			System.out.println("number: " + num);

			temp = (num % 10) * fact;
			
			teen = teen + (num % 10) * fact;
			System.out.println("Teen: " + teen);
			
			System.out.println("Temp: " + temp);
			
			if (temp != 0)
				res.insert(0, map.get(temp) + " ");
			num /= 10;
			fact *= 10;

			
			if (Integer.toString(teen).length() == 2 && Integer.toString(teen).charAt(0) == '1') {
				
				res = new StringBuilder();
				res.insert(0, map.get(teen) + "");
								
			}
			System.out.println(res);
		}
		
		if (place == 2 && teen != 0)
			res.append("Thousand ");
		else if (place == 3 && teen != 0)
			res.append("Million ");
		else if (place == 4 && teen != 0)
			res.append("Billion ");
		
		return res.toString();
	}
}
