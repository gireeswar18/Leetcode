package leetcode;

import java.util.*;

public class ConstructBinaryTreeFromPreorderAndPostorderTraversal {

	public TreeNode construct(int[] pre, int[] post, Map<Integer, Integer> map, int i1, int i2, int j1, int j2) {
		if (i1 > i2 || j1 > j2) return null;
		
		TreeNode node = new TreeNode(pre[i1]);
		
		if (i1 != i2) {
			int leftVal = pre[i1 + 1];
			int ind = map.get(leftVal);
			int leftSize = ind - j1 + 1;
			
			node.left = construct(pre, post, map, i1 + 1, i1 + leftSize, j1, ind);
			node.right = construct(pre, post, map, i1 + leftSize + 1, i2, ind + 1, j2 - 1);
		}
		
		return node;
	}

	public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
		int n = preorder.length;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			map.put(postorder[i], i);
		}

		return construct(preorder, postorder, map, 0, n - 1, 0, n - 1);
	}
}
