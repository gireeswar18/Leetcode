package leetcode;

import java.util.*;

public class MinimumNumberOfOperationsToSortABinaryTreeByLevel {

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

		public int swapCounter(ArrayList<Integer> original) {
			int swaps = 0;
			int n = original.size();
			int[] sorted = new int[n];
			
			for (int i = 0; i < n; i++) {
				sorted[i] = original.get(i);
			}
			Arrays.sort(sorted);
			
			Map<Integer, Integer> ind_map = new HashMap<Integer, Integer>();
			for (int i = 0; i < n; i++) {
				ind_map.put(original.get(i), i);
			}
			
			for (int i = 0; i < n; i++) {
				if (original.get(i) != sorted[i]) {
					swaps++;
					int curr = original.get(i);
					int sortedPos = ind_map.get(sorted[i]);
					
					ind_map.put(curr, sortedPos);
					original.set(sortedPos, curr);
				}
			}
			return swaps;
		}

		public int minimumOperations(TreeNode root) {
			Queue<TreeNode> queue = new LinkedList<>();
			queue.add(root);
			int res = 0;

			while (!queue.isEmpty()) {
				ArrayList<Integer> list = new ArrayList<>();
				int size = queue.size();

				while (size-- != 0) {
					TreeNode curr = queue.poll();
					if (curr.left != null) {
						queue.add(curr.left);
						list.add(curr.left.val);
					}
					if (curr.right != null) {
						queue.add(curr.right);
						list.add(curr.right.val);
					}
				}

				res += swapCounter(list);

			}

			return res;
		}
	}
}
