package leetcode;

public class FindTheStudentThatWillReplaceTheChalk {
	public static void main(String[] args) {
		int[] chalk = {5, 1, 5};
		int k = 22;
		
		System.out.println(chalkReplacer(chalk, k));
	}

	public static int chalkReplacer(int[] chalk, int k) {
		long sum = 0;
		int ind = 0;
        long chalks = k;
		
		for (int x : chalk)
			sum += x;
		
		chalks = chalks % sum;
		
		while (chalks >= chalk[ind]) {
			chalks -= chalk[ind++];
		}
		
		return ind;
	}
}
