import java.util.Arrays;


public class HouseRobber {
	
	public static void main(String[] args) {
		int nums[] = {1};
		System.out.println(new HouseRobber().rob(nums));
	}
	
	public int rob(int[] nums) {
		int[] mem = new int[nums.length];
		Arrays.fill(mem, -1);
		return robHelper(nums, mem, 0);
	}
	
	public int robHelper(int[] nums, int[] mem, int begin) {
		if(begin >= nums.length) return 0;
		
		if(mem[begin] == -1) {
			int sum1 = nums[begin] + robHelper(nums, mem, begin+2);
			int sum2 = robHelper(nums, mem, begin+1);
			mem[begin] = sum1 > sum2 ? sum1: sum2;	
		}
		return mem[begin];
	}
	
	public int rob2(int[] nums) {
		if(nums.length == 0) return 0;
		if(nums.length == 1) return nums[0];
		
		int[] maxSofar = new int[nums.length];
		maxSofar[0] = nums[0];
		maxSofar[1] = Math.max(maxSofar[0], nums[1]);
		for(int i = 2; i < nums.length; i++) {
			maxSofar[i] = Math.max(nums[i] + maxSofar[i-2], maxSofar[i-1]);
		}
		return maxSofar[nums.length-1];
	}
}
