import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class BinaryTreePreOrderTraversal {
	public static void main(String[] args) {
		Object[] nums = {1,4,2,3, 5,6, null, 7, null, 10, null, 8};
		Tree tree = new Tree();
		TreeNode root  = tree.insert(nums);
		List<Integer> list = new BinaryTreePreOrderTraversal().preorderTraversalIterative(root);
		Iterator<Integer> ite = list.iterator();
 		while(ite.hasNext()) {
 			System.out.print(ite.next()+ " ");
 		}
	}
	
	public List<Integer> preorderTraversalIterative(TreeNode root) {
		Stack<TreeNode> stack1 = new Stack<TreeNode>();
		Stack<TreeNode> stack2 = new Stack<TreeNode>();
		List<Integer> list = new LinkedList<Integer>();
		while(root != null) {
			stack1.push(root);
			root = root.left;
		}
		
		while(!stack1.isEmpty()) {
			TreeNode node = stack1.pop();
			stack2.push(node);
			node = node.right;
			while(node != null) {
				stack1.push(node);
				node = node.left;
			}
		}
		return list;
	}
	
	public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        preorderTraversalHelper(root, list);
        return list;
    }
    
    public void preorderTraversalHelper(TreeNode root, List<Integer> list) {
        if(root == null) return;
        
        list.add(root.val);
        preorderTraversalHelper(root.left, list);
        preorderTraversalHelper(root.right, list);
    }
}
