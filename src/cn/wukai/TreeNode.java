package cn.wukai;

/**
 * 
 * @author wukai
 * ��leetcode�㷨�еĳ��������
 */

public class TreeNode {

	TreeNode left;
	TreeNode right;
	int val;
	
	public TreeNode() {
		
	}
	
	public TreeNode(int val) {
		this.val = val;
	}
	
	public TreeNode(int val,TreeNode left,TreeNode right) {
		this.val = val;
		this.right = right;
		this.left = left;
	}
	
}
