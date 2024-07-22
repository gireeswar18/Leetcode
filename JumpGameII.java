package leetcode;

public class JumpGameII {
	public static void main(String[] args) {

//		int[] arr = { 2, 3, 1, 1, 4 };
		
//		int[] arr = {2,3,0,1,4};
		
//		int[] arr = {1, 1, 1, 1, 1};
		
//		int[] arr = {1,2,1,1,1};

		int[] arr = {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3};
		
		JumpGameII j = new JumpGameII();
		
		System.out.println(j.jump(arr));

	}

	public int jump(int[] nums) {
		
		int max = Integer.MIN_VALUE;
		int currMax = 0;
		int steps = 0;
		
		for (int i = 0; i < nums.length - 1; i++)
		{
			max = Math.max(max, i + nums[i]);
			if (i == currMax)
			{
				steps++;
				currMax = max;
			}
		}
		
		return steps;
		
	}
}
