package leetcode;

import java.util.*;

public class MinimumNumberOfPushesToTypeWordII {
	public static void main(String[] args) {
		
//		String word = "aabbccddeeffgghhiiiiii";
		String word = "xyzxyzxyzxyz";
		
		System.out.println(minimumPushes(word));
		
	}

	public static int minimumPushes(String word) {
//		
//		Map<Character, Integer> map = new HashMap<Character, Integer>();
//		int pushVal = 1;
//		int pushes = 0;
//		int count = 8;
//		
//		char[] arr = word.toCharArray();
//		
//		for (char c : arr) {
//			
//			map.put(c, map.getOrDefault(c, 0) + 1);
//			
//		}
//		
//		System.out.println(map);
//		
//		PriorityQueue<Character> queue = new PriorityQueue<Character>((a, b) -> map.get(b) - map.get(a));
//		
//		for (char x : map.keySet()) {
//			
//			queue.add(x);
//			
//		}
//		
//		while (!queue.isEmpty() ) {
//			
//			char c = queue.poll();
//			
//			if (count == 0) {
//				count = 8;
//				pushVal++;
//			}
//			
//			if (count != 0) {
//				pushes += map.get(c) * pushVal;
//				count--;
//			}
//			
//			
//		}
//		
//		return pushes;
		
		
		int[] freq = new int[26];
		
		char[] arr = word.toCharArray();
		int i = 0;
		
		for (char c : arr) {
			freq[c - 'a']++;
			i++;
		}
		
		int pushVal = 1;
		int count = 8;
		int pushes = 0;
		
		Arrays.sort(freq);
		
		i = 25;
		
		while (i >= 0 && freq[i] != 0) {
			
			if (count == 0) {
				count = 8;
				pushVal++;
			}
			
			pushes += freq[i] * pushVal;
			count--;
			i--;
			
		}
		
		return pushes;
		
	}
}
