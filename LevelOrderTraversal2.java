import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class LevelOrderTraversal2 {
	
	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		Stack<Integer> levelStack = new Stack<Integer>();
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode temp; int level = 1;
		if(root == null) return list;
		queue.add(root);
		
		return list;
	}
}
