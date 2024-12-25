package leetcode;

import java.util.*;

public class FindLargestValueInEachRow {

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

	public List<Integer> largestValues(TreeNode root) {
		List<Integer> res = new ArrayList<>();

		if (root == null)
			return res;

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		res.add(root.val);

		while (!q.isEmpty()) {
			int size = q.size();
			int max = Integer.MIN_VALUE;

			while (size-- != 0) {
				TreeNode curr = q.poll();

				if (curr.left != null) {
					max = Math.max(max, curr.left.val);
					q.add(curr.left);
				}

				if (curr.right != null) {
					max = Math.max(max, curr.right.val);
					q.add(curr.right);
				}

			}

			if (!q.isEmpty())
				res.add(max);

		}
		return res;
	}

	List<Integer> res;

	public List<Integer> largestValues2(TreeNode root) {
		res = new ArrayList<Integer>();
		dfs(root, 0);
		return res;
	}

	public void dfs(TreeNode curr, int level) {
		if (curr == null) return;
		
		if (level == res.size()) {
			res.add(curr.val);
		}
		else {
			res.set(level, Math.max(res.get(level), curr.val));
		}
		
		dfs(curr.left, level + 1);
		dfs(curr.right, level + 1);
	}
}
