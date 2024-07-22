package leetcode;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		
		ProductOfArrayExceptSelf p = new ProductOfArrayExceptSelf();
		int[] res = p.productExceptSelf(arr);
		
		System.out.println(Arrays.toString(res));
	}

	public int[] productExceptSelf(int[] nums) {
		
		int leftProduct = 1;
		int[] res = new int[nums.length];
		
		for (int i = 0; i < nums.length; i++)
		{
			res[i] = leftProduct;
			leftProduct *= nums[i];
		}
		
		int rightProduct = 1;
		for (int i = nums.length - 1; i >= 0; i--)
		{
			res[i] *= rightProduct;
			rightProduct *= nums[i];
		}
		
		return res;

	}
}
