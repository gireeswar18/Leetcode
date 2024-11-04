package leetcode;

import java.util.*;

public class LongestSquareStreakInAnArray {
	public static void main(String[] args) {
		int[] t1 = { 4, 3, 6, 16, 8, 2 };
		int[] t2 = { 2, 3, 5, 6, 7 };
		int[] t3 = { 92682, 18532 };

		System.out.println(longestSquareStreak(t1));
		System.out.println(longestSquareStreak(t2));
		System.out.println(longestSquareStreak(t3));
	}

	public static int longestSquareStreak(int[] nums) {
		int streak = -1;
		Set<Long> set = new HashSet<>();

		for (int num : nums)
			set.add(num * 1l);

		for (int num : nums) {
			long currNum = num;
			
			double sqrt = Math.sqrt(currNum);
			if (!(sqrt == Math.floor(sqrt) && set.contains((long) sqrt))) {
				int currStreak = 1;

				while (set.contains(currNum * currNum)) {
					currStreak++;
					currNum *= currNum;
				}
				streak = Math.max(streak, currStreak);
			}
		}

		return streak == 1 ? -1 : streak;
	}
}
