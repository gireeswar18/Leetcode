package leetcode;

public class CountOfSubstringsContainingEvertVowelAndKConsonants_II {
	public static void main(String[] args) {
		System.out.println(countOfSubstrings("aeioqq", 1));
		System.out.println(countOfSubstrings("aeiou", 0));
		System.out.println(countOfSubstrings("ieaouqqieaouqq", 1));
		System.out.println(countOfSubstrings("iqeaouqi", 2));
	}

	public static boolean isValid(int[] vow) {
		return vow[0] >= 1 && vow[4] >= 1 && vow[8] >= 1 && vow[14] >= 1 && vow[20] >= 1;
	}

	public static long atleast(char[] str, int k) {
		int[] vow = new int[26];
		int cons = 0;
		long cnt = 0;
		int l = 0;
		int n = str.length;
		
		
		for (int r = 0; r < n; r++) {
			if (str[r] == 'a' || str[r] == 'e' || str[r] == 'i' || str[r] == 'o' || str[r] == 'u') {
				vow[str[r] - 'a']++;
			}
			else {
				cons++;
			}
			
			while (isValid(vow) && cons >= k) {
				cnt += (n - r);
				
				if (str[l] == 'a' || str[l] == 'e' || str[l] == 'i' || str[l] == 'o' || str[l] == 'u') {
					vow[str[l] - 'a']--;
				}
				else {
					cons--;
				}
				
				l++;
			}
		}
		return cnt;
		
	}

	public static long countOfSubstrings(String word, int k) {
		char[] arr = word.toCharArray();
		return atleast(arr, k) - atleast(arr, k + 1);
	}
}
