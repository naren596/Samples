
public class ArrangeCoiins {
	
	public int arrangeCoins(int n) {
		int i = 1, count = 0;
		while(n >= i) {
			n = n - i;
			i++;
			count++;
		}
		return count;
    }
	
	public int arrangeCoins2(int n) {
		return (int)((Math.sqrt(8.0 * n + 1) - 1)/2);
	}
}
