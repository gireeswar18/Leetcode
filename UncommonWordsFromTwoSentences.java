package leetcode;

import java.util.*;

public class UncommonWordsFromTwoSentences {

	public static void main(String[] args) {
		String s1 = "this apple is sweet";
		String s2 = "this apple is sour";

		System.out.println(Arrays.toString(uncommonFromSentences(s1, s2)));
	}

	public static String[] uncommonFromSentences(String s1, String s2) {

		HashMap<String, Integer> map = new HashMap<>();

//		helper(map, s1);
//		helper(map, s2);
		
		String[] arr1 = s1.split(" ");
		String[] arr2 = s2.split(" ");
		
		for (String str : arr1)
			map.put(str, map.getOrDefault(str, 0) + 1);
		
		for (String str : arr2)
			map.put(str, map.getOrDefault(str, 0) + 1);

		
		
		List<String> res = new ArrayList<>();
		
		for (String str : map.keySet())
			if (map.get(str) == 1)
				res.add(str);

		return res.toArray(new String[0]);
	}
	
	public static void helper(HashMap<String, Integer> map, String str) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < str.length(); i++) {
			
			if (str.charAt(i) == ' ') {
				
				map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
				sb = new StringBuilder();
			}
			
			else {
				sb.append(str.charAt(i));
			}
			
		}
		
		map.put(sb.toString(), map.getOrDefault(sb.toString(), 0) + 1);
		
	}

}
