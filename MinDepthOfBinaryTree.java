
public class MinDepthOfBinaryTree {
	public int minDepth(TreeNode root) {
		if(root == null) return 0;
		int leftDepth = minDepth(root.left);
		int rightDepth = minDepth(root.right);
		if(leftDepth == 0) return rightDepth;
		if(rightDepth == 0) return leftDepth;
        return 1 + Math.min(leftDepth, rightDepth);
    }
}	
