import java.util.List;


public class KthSmallestInBST {
	
	int result;
	int count;
	public static void main(String[] args) {
		
	}
	
	public int kthSmallest(TreeNode root, int k) {
		kthSmallestHelper(root, k);
		return result;
    }
	
	public void kthSmallestHelper(TreeNode root, int k) {
        if(root == null) return;
		kthSmallestHelper(root.left, k);
		count++;
		if(count == k) {
			result = root.val;
			return;
		}
		kthSmallestHelper(root.right, k);
    }
	
    
    public void inorderTraversalHelper(TreeNode root, List<Integer> list) {
        if(root == null) return;
        
        inorderTraversalHelper(root.left, list);
        list.add(root.val);
        inorderTraversalHelper(root.right, list);
    }
}
