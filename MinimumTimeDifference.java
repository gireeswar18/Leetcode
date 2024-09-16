package leetcode;

import java.util.*;

public class MinimumTimeDifference {
	public static void main(String[] args) {

		String[] arr = { "23:59", "00:00" };

		List<String> list = Arrays.asList(arr);

		System.out.println(findMinDifference(list));

	}

	public static int findMinDifference(List<String> timePoints) {
        int len = timePoints.size();
		
		int[] timeInMins = new int[len];
		int ind = 0;
		
		int min = Integer.MAX_VALUE;
		
		for (String time : timePoints) {
			
			// int h = Integer.parseInt(time.substring(0, 2));
			// int m = Integer.parseInt(time.substring(3, 5));

            // int h = (time.charAt(0) - '0') * 10 + time.charAt(1) - '0';
            // int m = (time.charAt(3) - '0') * 10 + time.charAt(4) - '0';
			
			timeInMins[ind++] = convert(time);
		}
		
		Arrays.sort(timeInMins);
				
		for (int i = 1; i < len; i++) {
			min = Math.min(min, timeInMins[i] - timeInMins[i - 1]);
		}
		
		int firstAndLast = timeInMins[0] + (1440 - timeInMins[len - 1]);
				
		return Math.min(min, firstAndLast);
    }

    public static int convert(String time) {
        int h = (time.charAt(0) - '0') * 10 + time.charAt(1) - '0';
        int m = (time.charAt(3) - '0') * 10 + time.charAt(4) - '0';

        return (h * 60) + m;
    }
}
