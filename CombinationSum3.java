import java.util.LinkedList;
import java.util.List;


public class CombinationSum3 {
	List<Integer> path;
	
	public static void main(String[] args) {
		List<List<Integer>> list = new CombinationSum3().combinationSum3(3, 9);
		for(List<Integer> path : list) {
			for(int ele : path) {
				System.out.print(ele+" ");
			}
			System.out.println();
		}
	}
	
	public List<List<Integer>> combinationSum3(int k, int n) {
		path = new LinkedList<Integer>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        combinationSum3Helper(k, n, 1, list);
        return list;
    }
	
	public void combinationSum3Helper(int k, int n, int begin, List<List<Integer>> list) {
		if(k < 0 || n < 0) return;
		if(k == 0 && n == 0) {
			list.add(new LinkedList<>(path));
			return;
		}
		
		for(int i = begin; i <= 9; i++) {
			path.add(i);
			combinationSum3Helper(k-1, n-i, i+1, list);
			path.remove(path.size()-1);
		}
    }
}
