
public class MoveZeroes {
	public static void main(String args[]) {
		int nums[] = {0, 1, 0, 3, 12};
		new MoveZeroes().moveZeroes(nums);
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]+" ");
		}
	}
	
	public void moveZeroes(int[] nums) {
		int index = -1;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) nums[++index] = nums[i];
		}
		
		for(int i = index+1; i < nums.length; i++) {
			nums[i] = 0;
		}
    }
}
