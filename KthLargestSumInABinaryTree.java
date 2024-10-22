package leetcode;

import java.util.*;

public class KthLargestSumInABinaryTree {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public long kthLargestLevelSum(TreeNode root, int k) {
	
		Queue<TreeNode> q = new LinkedList<>();
		PriorityQueue<Long> sum = new PriorityQueue<>((a, b) -> Long.compare(b, a));
		
		q.add(root);
		
		while (!q.isEmpty()) {
			int size = q.size();
			long currSum = 0;

			while (size-- != 0) {
				TreeNode curr = q.poll();
				currSum += curr.val;
				if (curr.left != null)
					q.add(curr.left);
				if (curr.right != null)
					q.add(curr.right);
			}
			
			sum.add(currSum);
		}
		
		if (sum.size() < k) return -1;
		
		while (k-- != 1) {
			sum.poll();
		}
		
		return sum.peek();
		
	}
}
