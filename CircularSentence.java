package leetcode;

public class CircularSentence {
	public static void main(String[] args) {
		String t1 = "leetcode exercises sound delightful";
		String t2 = "eetcode";
		String t3 = "Leetcode is cool";
		
		System.out.println(isCircularSentence(t1));
		System.out.println(isCircularSentence(t2));
		System.out.println(isCircularSentence(t3));
	}

	public static boolean isCircularSentence(String sentence) {
		int n = sentence.length();
		char[] arr = sentence.toCharArray();
		
		for (int i = 0; i < n; i++) {
			if (arr[i] == ' ' && arr[i - 1] != arr[i + 1])
				return false;
		}
		
		return arr[0] == arr[n - 1];
	}
}
