
public class BalancedBinaryTree {
	
	boolean isBalanced = true;
	public static void main(String[] args) {
		Object[] vals = {1, null, 3, 4, 5};
		Tree tree = new Tree();
		TreeNode root = tree.insert(vals);
		System.out.println(new BalancedBinaryTree().isBalanced(root));
	}
	
	public boolean isBalanced(TreeNode root) {
		if(isBalancedHelper2(root) == -1) return false;
		return true;
	}
	
	public int isBalancedHelper(TreeNode root) {
		if(root == null) return 0;
		int leftHeight = isBalancedHelper(root.left);
		int rightHeight = isBalancedHelper(root.right);
		if(Math.abs(leftHeight-rightHeight) > 1){
			isBalanced = false;
		}
		return 1+Math.max(leftHeight, rightHeight);
	}
	
	
	public int isBalancedHelper2(TreeNode root) {
		if(root == null) return 0;
		
		int leftHeight = isBalancedHelper2(root.left);
		int rightHeight = isBalancedHelper2(root.right);
		if(leftHeight == -1 || rightHeight == -1) return -1;
		if(Math.abs(leftHeight - rightHeight) > 1) return -1;
		return 1+Math.max(leftHeight, rightHeight);
	}
}
