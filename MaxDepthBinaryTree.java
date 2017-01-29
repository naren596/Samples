
public class MaxDepthBinaryTree {
	
	public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return leftDepth > rightDepth ? 1+leftDepth: 1+rightDepth;
    }
}
