
public class MissingNumber {
	public static void main(String[] args) {
		int[] nums = {1,0,3};
		System.out.println(new MissingNumber().missingNumber(nums));
	}
	
	public int missingNumber(int[] nums) {
        int sum = 0;
        for(int num : nums) {
        	sum += num;
        }
        return nums.length * (nums.length+1)/2 - sum;
    }
}
