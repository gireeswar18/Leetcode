package leetcode;

public class CheckIfOneStringSwapCanMakeStringsEqual {
	public static void main(String[] args) {
		System.out.println(areAlmostEqual("bank", "kanb"));
		System.out.println(areAlmostEqual("attack", "defend"));
		System.out.println(areAlmostEqual("kelb", "kelb"));
	}

	public static boolean areAlmostEqual(String s1, String s2) {
		int n = s1.length();		
		int[] arr = new int[2];
		int cnt = 0, ind = 0;
		
		for (int i = 0; i < n; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				if (++cnt > 2) return false;
				arr[ind++] = i;
			}
		}

		
		if (cnt == 1 || s1.charAt(arr[0]) != s2.charAt(arr[1]) 
				|| s1.charAt(arr[1]) != s2.charAt(arr[0])) return false;
		
		return true;
	}
}
