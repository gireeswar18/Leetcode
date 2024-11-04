package leetcode;

import java.util.*;

public class RemoveSubFoldersFromTheFileSystem {
	public static void main(String[] args) {
		String[] t1 = { "/a", "/a/b", "/c/d", "/c/d/e", "/c/f" };
		String[] t2 = { "/a", "/a/b/c", "/a/b/d" };
		String[] t3 = { "/a/b/c", "/a/b/ca", "/a/b/d" };

		System.out.println(removeSubfolders2(t1));
		System.out.println(removeSubfolders2(t2));
		System.out.println(removeSubfolders2(t3));
	}

	static class Trie {

		TrieNode root;

		class TrieNode {
			Map<String, TrieNode> children;
			boolean isEndOfWord;

			public TrieNode() {
				children = new HashMap<>();
				isEndOfWord = false;
			}
		}

		public Trie() {
			root = new TrieNode();
		}

		public void insert(String str) {
			TrieNode currNode = root;
			String[] folders = str.split("/");
			
			for (int i = 1; i < folders.length; i++) {
				String folder = folders[i];
				if (!currNode.children.containsKey(folder)) {
					currNode.children.put(folder, new TrieNode());
				}
				currNode = currNode.children.get(folder);
			}
			currNode.isEndOfWord = true;
		}
		
		public void getFolders(TrieNode node, StringBuilder currStr, List<String> res) {
			if (node.isEndOfWord) {
				res.add(currStr.toString());
				return;
			}
			
			for (String key : node.children.keySet()) {
				
				currStr.append("/");
				
				currStr.append(key);
				
				getFolders(node.children.get(key), currStr, res);
				
				currStr.setLength(currStr.length() - key.length() - 1);
				
			}
		}

	}

	public static List<String> removeSubfolders(String[] folder) {
		
		Trie trie = new Trie();
		List<String> res = new ArrayList<>();
		
		for (String str : folder) {
			trie.insert(str);
		}
		
		trie.getFolders(trie.root, new StringBuilder(), res);
		
		return res;
	}
	
	public static List<String> removeSubfolders2(String[] folder) {

		Arrays.sort(folder);
		List<String> res = new ArrayList<>();

		for (String str : folder) {
			if (res.isEmpty() || !str.startsWith(res.getLast() + '/')) {
				res.add(str);
			}
		}
		
		return res;
	}
}









