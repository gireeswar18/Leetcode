package leetcode;

public class Search2DMatrix {
	public static void main(String[] args) {
		int[][] mat = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
		
		System.out.println(searchMatrix(mat, 16));
	}
	
	public static boolean searchMatrix(int[][] matrix, int target) {

		int[] arr = new int[0];

		for (int[] x : matrix) {
            if (x[0] <= target && x[x.length - 1] >= target) {
                arr = x;
                break;
            }
        }

        int start = 0;
		int end = arr.length - 1;
		int mid;

		while (start <= end) {

			mid = (start + end) / 2;
			if (arr[mid] == target)
				return true;

			if (arr[mid] > target)
				end = mid - 1;

			else
				start = mid + 1;
		}

		return false;
    }
}
