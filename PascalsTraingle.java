import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class PascalsTraingle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		ArrayList<Integer> prev;
		for(int i = 0; i < numRows; i++) {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			if(i  == 0) arrayList.add(1);
			else{
				prev = (ArrayList<Integer>)list.get(i-1);
				arrayList.add(1);
				for(int j = 1; j < prev.size(); j++) {
					arrayList.add(prev.get(j) + prev.get(j-1));
				}
				arrayList.add(1);
			}
			list.add(i, arrayList);
		}
        return list;
    }
}
