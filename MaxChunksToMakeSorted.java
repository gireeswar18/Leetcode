package leetcode;

public class MaxChunksToMakeSorted {
	public static void main(String[] args) {
		int[] t1 = { 4, 3, 2, 1, 0 };
		System.out.println(maxChunksToSorted(t1));

		int[] t2 = { 1, 0, 2, 3, 4 };
		System.out.println(maxChunksToSorted(t2));
	}

	public static int maxChunksToSorted(int[] arr) {
		int currSum = 0;
		int chunkCnt = 0;
		
		for (int i = 0; i < arr.length; i++) {
			currSum += arr[i];
			
			if (currSum == (i * (i + 1) / 2)) {
				chunkCnt++;
			}
		}
		
		return chunkCnt;
	}
}
