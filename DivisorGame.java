package leetcode;

public class DivisorGame {
	public static void main(String[] args) {
		System.out.println(divisorGame(8));
		System.out.println(divisorGame(55));
	}

	public static boolean divisorGame(int n) {

		if (n % 2 == 0)
			return true;

		return false;

	}
}
