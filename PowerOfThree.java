
public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		return ((n > 0)  && (n ^ n-1) == 1);
	}
}
