
public class NthDigit {
	public static void main(String[] args) {
		System.out.println(new NthDigit().findNthDigit(1000000000));
	}
	
	
	public int findNthDigit(int n) {
		int digits = 1, num = 0; long count  = 9;
		while(n  > digits*count) {
			n -= digits * count;
			num += count;
			digits++;
			count *= 10;
		}
		num += n/digits;
		String s = Integer.toString(num);
		return Character.getNumericValue(s.charAt(num % digits));
    }
}
