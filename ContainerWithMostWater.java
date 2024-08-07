package leetcode;

public class ContainerWithMostWater {
	public static void main(String[] args) {
		
//		int[] height = {1, 2, 3, 4};
		int[] height = {1,8,6,2,5,4,8,3,7};
//		int[] height = {1, 1};
		
		System.out.println(maxArea(height));
		
	}
	
	public static int maxArea(int[] height) {
        
		int i = 0;
		int j = height.length - 1;
		int maxArea = 0;
		
		while (i < j) {
			
			maxArea = Math.max(maxArea, (j - i) * Math.min(height[i], height[j]));
			
			if (height[i] < height[j])
				i++;
			else 
				j--;
			
		}

        return maxArea;
    }
}
