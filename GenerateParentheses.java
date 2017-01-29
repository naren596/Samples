import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;


public class GenerateParentheses {
	
	public static void main(String[] args) {
		List<String> list = new GenerateParentheses().generateParenthesis(3);
		for(String str : list) {
			System.out.println(str);
		}
	}
	
	public List<String> generateParenthesis(int n) {
		List<String> list = new LinkedList<String>();
        list.addAll(generateParenthesisHelper(n));
        Collections.sort(list);
        return list;
    }
	
	public Set<String> generateParenthesisHelper(int n) {
		Set<String> set = new HashSet<String>();
		if(n == 1) {
			set.add("()");
			return set;
		}
		
		Set<String> res = generateParenthesisHelper(n-1);
		for(String str : res) {
			set.add("("+str+")");
			set.add("()"+str);
			set.add(str+"()");
		}
        return set;
    }
}
