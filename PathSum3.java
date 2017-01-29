import java.util.LinkedList;

public class PathSum3 {
	
	LinkedList<Integer> path = new LinkedList<>();
	public static void main(String[] args) {
		Object[] vals = {10,5,-3,3,2,null,11,3,-2,null,1};
		TreeNode root = new Tree().insert(vals);
		System.out.println(new PathSum3().pathSum(root, 8));
	}
	
	public int pathSum(TreeNode root, int sum) {		
		if(root == null) return 0;
		return pathSumHelper(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
	}
	
	public int pathSumHelper(TreeNode root, int sum) {
		if(root == null) return 0;
		
		if(root.left == null && root.right == null) {
			return (sum-root.val == 0) ? 1:0;
		}
		
		int leftSum = pathSumHelper(root.left, sum-root.val);
		int rightSum = pathSumHelper(root.right, sum-root.val);
		
        return ((sum - root.val == 0)?1:0) + leftSum + rightSum;
    }
	
	
}
