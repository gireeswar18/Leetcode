package leetcode;

public class AddingSpacesToAString {
	public static void main(String[] args) {
		String t1 = "LeetcodeHelpsMeLearn";
		System.out.println(addSpaces(t1, new int[] { 8, 13, 15 }));

		String t2 = "icodeinpython";
		System.out.println(addSpaces(t2, new int[] { 1, 5, 7, 9 }));

		String t3 = "spacing";
		System.out.println(addSpaces(t3, new int[] { 0, 1, 2, 3, 4, 5, 6 }));
	}

	public static String addSpaces(String s, int[] spaces) {
		StringBuilder res = new StringBuilder();
		
		char[] str = s.toCharArray();
		int spaceInd = 0;
		int currInd = 0;
		
		while (currInd < str.length) {
			if (spaceInd < spaces.length && currInd == spaces[spaceInd]) {
				res.append(' ');
				spaceInd++;
			}
			else {
				res.append(str[currInd++]);
			}
		}
		
		return res.toString();
		
	}
}
