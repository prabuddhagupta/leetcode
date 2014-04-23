//http://oj.leetcode.com/problems/same-tree/
	
package com.prabuddha;

public class SameTree {
	public boolean isSameTree(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null)  {
			return true;
		}else if ((node1 == null && node2 != null) || node1 != null && node2 == null) {
			return false;
		} else if (node1.val != node2.val) {
			return false;
		}
		
		//if both node value is same, check the left and right tree recursively
		boolean left = isSameTree(node1.left, node2.left);
		boolean right = isSameTree(node1.right, node2.right);
		return left && right;

	}
	
	public static void main(String[] args) {
		TreeNode root = createFirstTree();
		TreeNode root2 = createSecondTree();
		System.out.println(new SameTree().isSameTree(root, root2));
	}

	private static TreeNode createSecondTree() {
		TreeNode root2 = TreeNode(1);
		TreeNode node2_1 = TreeNode(11);
		TreeNode node2_2 = TreeNode(12);

		root2.left = node2_1;
		root2.right = node2_2;

		TreeNode node2_3 = TreeNode(13);
		TreeNode node2_4 = TreeNode(14);

		node2_1.left = node2_3;
		node2_1.right = node2_4;

		TreeNode node2_5 = TreeNode(15);
		TreeNode node2_6 = TreeNode(16);

		node2_3.left = node2_5;
		node2_3.right = node2_6;
		return root2;
	}

	private static TreeNode createFirstTree() {
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
		return root;
	}

	private static TreeNode TreeNode(int i) {
		return new TreeNode(i);
	}
}
