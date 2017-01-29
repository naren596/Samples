
public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		System.out.println(new RemoveDuplicates().removeDuplicates(nums));
	}
	
	public int removeDuplicates(int[] nums) {
		if(nums.length == 0) return 0;
		int i = 0, j = 1, leftMax = nums[0];
		while(i < nums.length) {
			while(i < nums.length && nums[i] <= leftMax) i++;
			if(i <nums.length) {
				nums[j] = nums[i];
				leftMax = nums[i];
				j++;
				i++;
			}
		}
		return j;
	}
}
