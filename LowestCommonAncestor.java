
public class LowestCommonAncestor {
	public static void main(String[] args) {
		Object[] vals = {6, 2, 8, 0, 4, 7, 9, null, null, 3, 5};
		Tree tree = new Tree();
		TreeNode root = tree.insert(vals);
		TreeNode node1 = root.left;
		TreeNode node2 = root.right;
		TreeNode node3 = node1.left;
		TreeNode node4 = node1.right;
		TreeNode node5 = node2.left;
		TreeNode node6 = node2.right;
		TreeNode node7 = node4.left;
		TreeNode node8 = node4.right;
		TreeNode node = new LowestCommonAncestor().lowestCommonAncestor2(root, node1, node4);
		if(node != null) System.out.println(node.val);
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null) return null;
		TreeNode node1 = null;
		TreeNode node2 = null;
		if(root == p || root == q) {
			node1 = root;
			node2 = lowestCommonAncestor(root.left, p, q);
			if(node2 == null) {
				node2 = lowestCommonAncestor(root.right, p, q);
			}
		}else{
			node1 = lowestCommonAncestor(root.left, p, q);
			node2 = lowestCommonAncestor(root.right, p, q);
		}
		
		if(node1 != null && node2 != null) {
			if(node1 == node2) return node1;
			else return root;
		} else if(node1 == null && node2 != null) return node2;
		else if(node1 != null && node2 == null) return node1;
		return null;
    }
	
	
	public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
		if(root == null) return null;
		TreeNode node1 = null;
		TreeNode node2 = null;
		
		if(root == p) {
			node1 = root;
		} else if(p.val < root.val) {
			node1 = lowestCommonAncestor(root.left, p, q);
		} else {
			node1 = lowestCommonAncestor(root.right, p, q);
		}
		
		if(root == q) {
			node2 = root;
		} else if(q.val < root.val) {
			node2 = lowestCommonAncestor(root.left, p, q);
		} else {
			node2 = lowestCommonAncestor(root.right, p, q);
		}
		
		if(node1 != null && node2 != null) {
			if(node1 == node2) return node1;
			else return root;
		} else if(node1 == null && node2 != null) return node2;
		else if(node1 != null && node2 == null) return node1;
		else return null;
    }
}
