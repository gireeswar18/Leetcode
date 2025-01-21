package leetcode;

public class NeighbouringBitwiseXOR {
	public static void main(String[] args) {
		System.out.println(doesValidArrayExist(new int[] { 1, 1, 0 }));
		System.out.println(doesValidArrayExist(new int[] { 1, 1 }));
		System.out.println(doesValidArrayExist(new int[] { 1, 0 }));
	}

	public static boolean doesValidArrayExist(int[] derived) {
		int val = 0;
		for (int num : derived) {
			val ^= num;
		}
		
		return val == 0;
	}
}
