package leetcode;

import java.util.Arrays;

public class MinimumSwapsToGroupAllOnesTogetherII {
	public static void main(String[] args) {
		int[] arr = {0,1,0,1,1,0,0};
		
//		int[] arr = {1, 1, 0, 0, 1};
		
//		int[] arr = {0, 0, 0};
		
		System.out.println(minSwaps(arr));
	}
	
	public static int minSwaps(int[] nums) {

        int numOfOnes = 0;

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 1)
                numOfOnes++;
        
        int[] arr = new int[nums.length + numOfOnes];
        
        // creating new array
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
        	arr[ind++] = nums[i];
        }
        for (int i = 0; i < numOfOnes; i++) {
        	arr[ind++] = nums[i];
        }

        System.out.println("Number of ones: " + numOfOnes);
        System.out.println("New Array: " + Arrays.toString(arr));
        
        int left = 0;
        int right = 0;
        int minSwap = Integer.MAX_VALUE;
        int windowZeroes = 0;
        @SuppressWarnings("unused")
		int windowOnes = 0;
        
        while (right < arr.length) {
        	
        	if (arr[right] == 1)
    			windowOnes++;
    		else
    			windowZeroes++;
        	
        	if (right - left + 1 == numOfOnes) {
        		minSwap = Math.min(minSwap, windowZeroes);
        		if (arr[left] == 0) {
        			windowZeroes--;
        		}
        		else if (arr[left] == 1) {
        			windowOnes--;
        		}
        		left++;
        	}
        	
        	right++;
        	
        	if (minSwap == 0) return 0;
        }
        
        return minSwap == Integer.MAX_VALUE ? 0 : minSwap;
        
    }
}
