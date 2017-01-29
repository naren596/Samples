import java.util.Arrays;


public class MinMovesToEqualArray2 {
	public static void main(String[] args) {
		int nums[] = {1,3,5,6};
		System.out.println(new MinMovesToEqualArray2().minMoves2(nums));
	}
	
	public int minMoves2(int[] nums) {
		Arrays.sort(nums); 
		int len = nums.length;
		int median = len % 2 == 1 ? nums[len/2] : (nums[len/2] + nums[(len-1)/2])/2, sum = 0;
		for(int num : nums) {
			sum += Math.abs(num - median);
		}
		return sum;
	}
}
