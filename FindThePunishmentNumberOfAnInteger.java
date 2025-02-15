package leetcode;

public class FindThePunishmentNumberOfAnInteger {

	public static void main(String[] args) {
		System.out.println(punishmentNumber(10));
		System.out.println(punishmentNumber(37));
	}

	public static boolean canPartition(int target, String curr, int ind) {
		if (ind == curr.length() && target == 0)
			return true;
		if (target < 0)
			return false;

		int leftPart = 0;

		for (int pivot = ind; pivot < curr.length(); pivot++) {

			leftPart = leftPart * 10 + (curr.charAt(pivot) - '0');

			if (canPartition(target - leftPart, curr, pivot + 1))
				return true;

		}

		return false;
	}

	public static int punishmentNumber(int n) {
		int res = 0;

		for (int i = 1; i <= n; i++) {
			int sq = i * i;

			String str = Integer.toString(sq);

			if (canPartition(i, str, 0)) {
				res += sq;
			}

		}

		return res;
	}
}
