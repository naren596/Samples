import java.util.LinkedList;
import java.util.List;


public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list = new LinkedList<String>();
		if(root == null) return list;
		List<String> leftList = binaryTreePaths(root.left);
		List<String> rightList = binaryTreePaths(root.right);
		if(leftList.size() == 0 && rightList.size() == 0) {
			list.add(""+root.val);
			return list;
		}
		
		if(leftList.size() > 0) {
			for(int i = 0; i < leftList.size(); i++) {
				list.add(root.val+"->"+leftList.get(i));
			}
		}
		
		if(rightList.size() > 0) {
			for(int i = 0; i < rightList.size(); i++) {
				list.add(root.val+"->"+rightList.get(i));
			}
		}
		
		return list;
	}
}
