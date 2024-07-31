package leetcode;
import java.util.*;

public class GroupAnagrams {
	public static void main(String[] args) {
		String[] arr = { "eat", "tea", "tan", "ate", "nat", "bat" };
		
		System.out.println(groupAnagrams(arr));
	}

	public static List<List<String>> groupAnagrams(String[] strs) {
				
		HashMap<String, List<String>> map = new HashMap<>();
		
		for (String str : strs) {
			
			System.out.println("String: " + str);
			
			char[] arr = str.toCharArray();
			Arrays.sort(arr);
			
			System.out.println("Sorted String: " + String.valueOf(arr));
			
			String sortedStr = String.valueOf(arr);
			
			if (map.containsKey(sortedStr))
				map.get(sortedStr).add(str);
			
			else {
				map.put(sortedStr, new ArrayList<String>(List.of(str)));
			}
			
		}
		
		return new ArrayList<>(map.values());
		
	}
}
