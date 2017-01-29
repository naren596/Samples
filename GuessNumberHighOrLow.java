
public class GuessNumberHighOrLow {
	
	static int actual;
	public static void main(String[] args) {
		int n = 2147483647;
		actual = 2147483647;
		System.out.println(new GuessNumberHighOrLow().guessNumber(n));
	}
	
	public int guessNumber(int n) {
		int low = 1, high = n, guess, mid;
		if(high+low < 0) mid = high/2+low/2;
		else mid = (high+low)/2;
		guess = guess(mid);
		while(guess != 0 && high != low) {
			if(guess == -1) {
				high = mid-1;
			}else if(guess == 1){
				low = mid+1;
			}
			if(high+low < 0) mid = high/2+low/2;
			else mid = (high+low)/2;
			
			guess = guess(mid);
		}
		return high == low ? high: mid;
	}
	
	public int guess(int num) {
		System.out.println(num);
		if(num < actual) return 1;
		else if(num > actual) return -1;
		return 0;
	}
}
