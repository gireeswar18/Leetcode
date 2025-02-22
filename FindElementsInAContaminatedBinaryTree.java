package leetcode;

import java.util.HashSet;
import java.util.Set;

public class FindElementsInAContaminatedBinaryTree {

	class FindElements {
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

		TreeNode root;
		Set<Integer> set;
		
		public FindElements(TreeNode root) {
			set = new HashSet<Integer>();
	        makeTree(root, 0);
	        this.root = root;
		}
		
		public void makeTree(TreeNode curr, int data) {
			if (curr == null) return;
			
			curr.val = data;
			set.add(data);
			
			makeTree(curr.left, (2 * data) + 1);
			makeTree(curr.right, (2 * data) + 2);
			
		}

		public boolean find(int target) {
			return set.contains(target);
		}
	}

}
