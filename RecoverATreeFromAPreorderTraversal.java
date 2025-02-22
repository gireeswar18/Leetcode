package leetcode;

import java.util.*;

public class RecoverATreeFromAPreorderTraversal {

	class Pair {
		int level;
		TreeNode node;

		public Pair(int level, TreeNode node) {
			this.level = level;
			this.node = node;
		}
	}

	public List<int[]> parseInput(char[] str) {
		List<int[]> nodes = new ArrayList<>();

		int cnt = 0;
		for (int i = 0; i < str.length;) {
			if (str[i] == '-') {
				cnt++;
				i++;
			} else {
				int val = 0;

				while (i < str.length && str[i] != '-') {
					val = val * 10 + (str[i] - '0');
					i++;
				}

				nodes.add(new int[] { cnt, val });
				cnt = 0;
			}
		}

		return nodes;
	}

	public TreeNode recoverFromPreorder(String traversal) {
		Stack<Pair> st = new Stack<>();
		List<int[]> nodes = parseInput(traversal.toCharArray());

		TreeNode root = new TreeNode(nodes.get(0)[1]);
		st.push(new Pair(0, root));

		for (int i = 1; i < nodes.size(); i++) {

			int currLevel = nodes.get(i)[0];
			int nodeVal = nodes.get(i)[1];

			TreeNode node = new TreeNode(nodeVal);

			while (!st.isEmpty() && st.peek().level >= currLevel) {
				st.pop();
			}

			if (!st.isEmpty()) {
				TreeNode currRoot = st.peek().node;

				if (currRoot.left == null) {
					currRoot.left = node;
				} else {
					currRoot.right = node;
				}
			}

			st.push(new Pair(currLevel, node));

		}

		return root;

	}
}
