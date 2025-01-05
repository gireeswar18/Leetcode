package leetcode;

public class ShiftingLetters_II {
	public static void main(String[] args) {
		int[][] t1 = { { 0, 1, 0 }, { 1, 2, 1 }, { 0, 2, 1 } };
		System.out.println(shiftingLetters("abc", t1));

		int[][] t2 = { { 0, 0, 0 }, { 1, 1, 1 } };
		System.out.println(shiftingLetters("dztz", t2));
	}

	public static String shiftingLetters(String s, int[][] shifts) {
		char[] arr = s.toCharArray();
		int n = arr.length;
		int[] prefix = new int[n + 1];
		
		for (int[] shift : shifts) {
			prefix[shift[0]] += shift[2] == 0 ? 1 : -1;
			prefix[shift[1] + 1] += shift[2] == 0 ? -1 : 1;
		}
		
		int move = prefix[n];
		for (int i = n - 1; i >= 0; i--) {
			int newChar = ((arr[i] - 'a') + move) % 26;
			if (newChar < 0) newChar += 26;
			
			arr[i] = (char) (newChar + 'a');
			move += prefix[i];
		}
				
		return String.valueOf(arr);
	}
}
