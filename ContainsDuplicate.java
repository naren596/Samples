import java.util.HashMap;
import java.util.HashSet;


public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		if(nums.length == 0) return false;
		HashMap<Integer, Boolean> map = new HashMap<Integer, Boolean>();
		for(int num:nums) {
			if(map.containsKey(num)) return true;
			else map.put(num, true);
		}
        return false;
    }
	
	public boolean containsDuplicate2(int[] nums) {
		if(nums.length == 0) return false;
		HashSet<Integer> hSet = new HashSet<Integer>();
		for(int num:nums) {
			if(!hSet.add(num)) return true;
		}
		return false;
    }
}
