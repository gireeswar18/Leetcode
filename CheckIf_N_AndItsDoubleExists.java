package leetcode;

import java.util.*;

public class CheckIf_N_AndItsDoubleExists {
	public static void main(String[] args) {
		int[] t1 = { 10, 2, 5, 3 };
		System.out.println(checkIfExist(t1));

		int[] t2 = { 3, 1, 7, 11, 22 };
		System.out.println(checkIfExist(t2));

	}

	public static boolean checkIfExist(int[] arr) {
		Set<Integer> set = new HashSet<>();
		
		for (int num : arr) {
			if (set.contains(num * 2))
				return true;
			if (num % 2 == 0 && set.contains(num / 2))
				return true;
			
			set.add(num);
		}
		
		return false;
	}
}
