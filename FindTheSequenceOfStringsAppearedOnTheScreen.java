package leetcode;

import java.util.*;

public class FindTheSequenceOfStringsAppearedOnTheScreen {
	public static void main(String[] args) {
		String str = "he";
		System.out.println(stringSequence(str));
	}

	public static List<String> stringSequence(String target) {
		List<String> res = new ArrayList<>();
		
		StringBuilder curr = new StringBuilder();
		
		curr.append('a');
		res.add(curr.toString());
		int ind = 0;
		
		while (ind < target.length()) {
			if (curr.charAt(ind) == target.charAt(ind)) {
				curr.append('a');
				ind++;
			}
			else {
				char c = curr.charAt(ind);
				if (c == 'z') {
					c = 'a';
				}
				else {
					c++;
				}
				curr.setCharAt(ind, c);
			}
			
			
			if (ind < target.length())
				res.add(curr.toString());
		}
		
		return res;
	}
}
