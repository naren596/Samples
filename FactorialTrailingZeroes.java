
public class FactorialTrailingZeroes {
	public static void main(String[] args) {
		System.out.println(new FactorialTrailingZeroes().trailingZeroes(10));
	}
	
	public int trailingZeroes(int n) {
		int count = 0;
		while(n != 0 ){
			count += (int)(n/5);
			n = n/5;
		}
		return count;
	}
}
