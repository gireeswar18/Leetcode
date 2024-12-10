package leetcode;

public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {
	public static void main(String[] args) {
		String t1 = "i love eating burger";
		System.out.println(isPrefixOfWord(t1, "burg"));

		String t2 = "i am tired";
		System.out.println(isPrefixOfWord(t2, "you"));

		String t3 = "this problem is an easy problem";
		System.out.println(isPrefixOfWord(t3, "pro"));
	}

	public static int isPrefixOfWord(String sentence, String searchWord) {
		String[] words = sentence.split(" ");
		int n = searchWord.length();
		
		for (int i = 0; i < words.length; i++) {
			int ind = 0;
			
			while (ind < words[i].length() && words[i].charAt(ind) == searchWord.charAt(ind)) {
				ind++;
				
				if (ind == n)
					return i + 1;
			}
		}
		
		return -1;
	}
}
