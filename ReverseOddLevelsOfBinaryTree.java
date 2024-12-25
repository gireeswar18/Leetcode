package leetcode;

import java.util.*;

public class ReverseOddLevelsOfBinaryTree {
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

	public TreeNode reverseOddLevels(TreeNode root) {

		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		int level = 0;

		while (!q.isEmpty()) {

			int size = q.size();
			List<TreeNode> revList = new ArrayList<>();

			while (size-- != 0) {
				TreeNode curr = q.poll();

				if (level % 2 == 1) {
					revList.add(curr);
				}

				if (curr.left != null) {
					q.add(curr.left);
				}

				if (curr.right != null) {
					q.add(curr.right);
				}
			}

			if (level % 2 == 1) {
				reverse(revList);
			}

			level++;

		}
		return root;

	}

	public void reverse(List<TreeNode> revList) {
		int i = 0, j = revList.size() - 1;
		while (i < j) {
			int temp = revList.get(i).val;
			revList.get(i).val = revList.get(j).val;
			revList.get(j).val = temp;

			i++;
			j--;
		}

	}
	
	public void dfs(TreeNode left, TreeNode right, int level) {
		if (left == null || right == null) return;
		
		if (level % 2 == 0) {
			int temp = left.val;
			left.val = right.val;
			right.val = temp;
		}
		
		dfs(left.left, right.right, level + 1);
		dfs(left.right, right.left, level + 1);
		
	}
	
	public TreeNode reverseOddLevelsDFS(TreeNode root) {
		dfs(root.left, root.right, 0);
		return root;
	}
	
	
}
