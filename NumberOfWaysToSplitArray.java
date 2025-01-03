package leetcode;

public class NumberOfWaysToSplitArray {
	public static void main(String[] args) {
		int[] t1 = {10,4,-8,7};
		System.out.println(waysToSplitArray(t1));
		
		int[] t2 = {2,3,1,0};
		System.out.println(waysToSplitArray(t2));
			
	}

	public static int waysToSplitArray(int[] nums) {
		long remSum = 0;
		for (int num : nums) {
			remSum += num;
		}
		
		long currSum = 0;
		int cnt = 0;
		
		for (int i = 0; i < nums.length - 1; i++) {
			currSum += nums[i];
			remSum -= nums[i];
			if (currSum >= remSum) {
				cnt++;
			}
		}
		
		return cnt;
	}
}
