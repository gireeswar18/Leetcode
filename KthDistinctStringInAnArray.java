package leetcode;

import java.util.HashMap;
import java.util.Map;

public class KthDistinctStringInAnArray {
	public static void main(String[] args) {
		String[] arr = {"d","b","c","b","c","a"};
		int k = 2;
		
		System.out.println(kthDistinct(arr, k));
	}

	public static String kthDistinct(String[] arr, int k) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		String res = "";
		
		for (String str : arr) {
			
			map.put(str, map.getOrDefault(str, 0) + 1);
			
		}
		
		for (String str : arr) {
			
			if (map.get(str) == 1) {
				k--;

				if (k == 0) {
					res = str;
					break;
				}
			}	
			
		}
//		
//		System.out.println(map);
//		System.out.println(k);
		
		return res;
		
	}
}
