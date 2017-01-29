import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;


public class BinaryTreeInorderTraversal {
	
	public static void main(String[] args) {
		Object[] nums = {1,4,2,3, 5,6, null, 7, null, null, null, 8};
		Tree tree = new Tree();
		TreeNode root  = tree.insert(nums);
		List<Integer> list = new BinaryTreeInorderTraversal().inorderTraversalIterative(root);
		Iterator<Integer> ite = list.iterator();
 		while(ite.hasNext()) {
 			System.out.print(ite.next()+ " ");
 		}
	}
	
	public List<Integer> inorderTraversalIterative(TreeNode root) {
		Stack<TreeNode> stack = new Stack<TreeNode>();
		List<Integer> list = new LinkedList<Integer>();
		while(root != null) {
			stack.push(root);
			root = root.left;
		}
		
		while(!stack.isEmpty()) {
			TreeNode node = stack.pop();
			list.add(node.val);
			node = node.right;
			while(node != null) {
				stack.push(node);
				node = node.left;
			}
		}
		return list;
	}
	
	public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        inorderTraversalHelper(root, list);
        return list;
    }
    
    public void inorderTraversalHelper(TreeNode root, List<Integer> list) {
        if(root == null) return;
        
        inorderTraversalHelper(root.left, list);
        list.add(root.val);
        inorderTraversalHelper(root.right, list);
    }
}
