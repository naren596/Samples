
public class RemoveElement {
	public static void main(String[] args) {
		int[] nums = {};
		System.out.println(new RemoveElement().removeElement(nums, 0));
	}
	
	public int removeElement(int[] nums, int val) {
		if(nums.length == 0) return 0;
		int i = 0, j = nums.length-1;
		
		while(i < j) {
			while(i < j && nums[i] != val) i++;
			while(i < j && nums[j] == val) j--;
			if(i < j) {
				nums[i] = nums[j];
				nums[j] = val;
				i++; 
				j--;
			}
		}
		if(nums[i] == val) return i;
		return i+1;
	}
}
