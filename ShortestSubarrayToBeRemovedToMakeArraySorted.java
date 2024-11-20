package leetcode;

public class ShortestSubarrayToBeRemovedToMakeArraySorted {
	public static void main(String[] args) {
		int[] t1 = { 1, 2, 3, 10, 4, 2, 3, 5 };
		System.out.println(findLengthOfShortestSubarray(t1));

		int[] t2 = { 5, 4, 3, 2, 1 };
		System.out.println(findLengthOfShortestSubarray(t2));

		int[] t3 = { 1, 2, 3, 10, 0, 7, 8, 9 };
		System.out.println(findLengthOfShortestSubarray(t3));
	}

	public static int findLengthOfShortestSubarray(int[] arr) {
		int left = 0;
		int n = arr.length;
		int right = arr.length - 1;

		while (left < n - 1 && arr[left] <= arr[left + 1]) {
			left++;
		}
		
		if (left == n - 1)
			return 0;

		while (right >= 1 && arr[right] >= arr[right - 1]) {
			right--;
		}

		int min = Math.min(n - left - 1, right);
		int i = 0, j = right;

		while (i <= left && j < n) {
			if (arr[i] <= arr[j]) {
				min = Math.min(min, j - i - 1);
				i++;
			} 
			else {
				j++;
			}
		}

		return min;
	}
}
