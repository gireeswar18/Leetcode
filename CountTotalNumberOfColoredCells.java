package leetcode;

public class CountTotalNumberOfColoredCells {
	public static void main(String[] args) {
		System.out.println(coloredCells(1));
		System.out.println(coloredCells(2));
		System.out.println(coloredCells(3));
		System.out.println(coloredCells(8));
		System.out.println(coloredCells(69675));
	}

	public static long coloredCells(int n) {
		long val = (long) n;

		return (val * val) + ((val - 1) * (val - 1));
	}
}
