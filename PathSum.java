
public class PathSum {
	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) return sum == 0;
		if(root.left == null && root.right == null) return sum-root.val == 0;
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum-root.val);
    }
}
