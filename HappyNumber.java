import java.util.HashSet;
import java.util.Set;


public class HappyNumber {
	
	public static void main(String[] args) {
		System.out.println(new HappyNumber().isHappy(20));
	}
	
	public boolean isHappy(int n) {
		int sum;
		Set<Integer> set = new HashSet<Integer>();
		set.add(n);
		do{
			sum  = 0;
			while(n != 0) {
				sum += (int)Math.pow(n%10, 2);
				n = n/10;
			}
			n = sum;
		}while(n != 1 && set.add(n));
		
		if(n == 1) return true;
		else return false;
	}
}
