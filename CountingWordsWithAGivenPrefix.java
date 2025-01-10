package leetcode;

public class CountingWordsWithAGivenPrefix {
	public static void main(String[] args) {
		String[] t1 = {"pay","attention","practice","attend"};
		System.out.println(prefixCount(t1, "at"));
		
		String[] t2 = {"leetcode","win","loops","success"};
		System.out.println(prefixCount(t2, "code"));
	}

	public static int prefixCount(String[] words, String pref) {
		int cnt = 0;
		for (String str : words) {

			if (str.startsWith(pref)) {
				cnt++;
			}

		}
		return cnt;
	}
}
