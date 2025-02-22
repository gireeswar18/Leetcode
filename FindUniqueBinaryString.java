package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueBinaryString {
	public static void main(String[] args) {
		String[] t1 = { "01", "10" };
		System.out.println(findDifferentBinaryString(t1));

		String[] t2 = {"111", "011", "000" };
		System.out.println(findDifferentBinaryString(t2));
	}

	public static String findDifferentBinaryString(String[] nums) {
		int n = nums.length;
		
		int max = (int) Math.pow(2, n);
		
		Set<String> set = new HashSet<String>();
		
		for (String num : nums) set.add(num); 
		
		for (int i = 0; i < max; i++) {
			String binary = Integer.toBinaryString(i);
			
			while (binary.length() != n) {
				binary = '0' + binary;
			}
			
			if (set.add(binary)) {
				return binary;
			}
			
		}
		
		return "";
		
	}
}
