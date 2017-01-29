import java.util.HashMap;


public class ContainsDuplicate2 {
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		//Optimize using set
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			Integer temp = map.put(nums[i], i);
			if(temp != null && i - temp <= k) return true;
		}
        return false;
    }
}
