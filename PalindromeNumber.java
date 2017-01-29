
public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(new PalindromeNumber().isPalindrome(-2147447412));
	}
	
	public boolean isPalindrome(int n) {
		if(n < 0) return false;
		int count = 0; int temp = n;
		while(n != 0) {
			n = n/10;
			count++;
		}
		n = temp;
		int i = (int)Math.pow(10, count-1), j = 10;
		while(i >= j) {
			if(n/i != n%j) return false;
			n = n%i;
			n = n/j;
			i = i/100;
		}
		return i < j? true:false;
	}
}
