
public class NumberOfOneBits {
	public static void main(String[] args) {
		System.out.println(new NumberOfOneBits().hammingWeight(11));
	}
	
	public int hammingWeight(int n) {
		int count = 0, i = 0;
		while(n != 0 && i < 32) {
			if((n & 1) == 1) {
				count++;
			}
			n = n >> 1;
			i++;
		}
		return count;
	}
}
