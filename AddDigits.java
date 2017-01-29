
public class AddDigits {
	public int addDigits(int num) {
		if(num == 0) return 0;
		int rem = num % 9;
		if(rem != 0) return rem;
		else return 9;
	}
}
