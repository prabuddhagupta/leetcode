//http://oj.leetcode.com/problems/maximum-depth-of-binary-tree/

package com.prabuddha;

import java.util.LinkedList;

public class BinaryTreeMaxDepth {

	public static int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		
		LinkedList<TreeNode> nodes = new LinkedList<TreeNode>();
		int count = 1;
		nodes.add(root);
	
		while (!nodes.isEmpty()) {
			TreeNode curr = nodes.remove();
			if (curr.left != null  || curr.right != null) {
				++count;
				if (curr.left != null) {
					nodes.add(curr.left);
				}
				if (curr.right != null) {
					nodes.add(curr.right);
				}
			}
		}

		return count;
	}
	public static void main(String[] args) {
		TreeNode root = TreeNode(1);
		TreeNode node1 = TreeNode(11);
		TreeNode node2 = TreeNode(12);
		
		root.left = node1;
		root.right = node2;
		
		TreeNode node3 = TreeNode(13);
		TreeNode node4 = TreeNode(14);
		
		node1.left = node3;
		node1.right = node4;
		
		TreeNode node5 = TreeNode(15);
		TreeNode node6 = TreeNode(16);
		
		node3.left = node5;
		node3.right = node6;
		
		System.out.println(BinaryTreeMaxDepth.minDepth(root));
	}
	private static TreeNode TreeNode(int i) {
		return new TreeNode(i);
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
