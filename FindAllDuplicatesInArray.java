import java.util.LinkedList;
import java.util.List;


public class FindAllDuplicatesInArray {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> list = new FindAllDuplicatesInArray().findDuplicates(nums);
		for(Integer i : list) System.out.println(i+" ");
	}
	
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new LinkedList<Integer>();
        for(int num : nums) {
        	int ind = Math.abs(num) - 1;
        	if(nums[ind] < 0) res.add(ind+1);
        	else nums[ind] = -nums[ind];
        }
        return res;
    }
}
