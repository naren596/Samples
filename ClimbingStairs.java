
public class ClimbingStairs {
	
	public static void main(String[] args) {
		System.out.println(new ClimbingStairs().climbStairs(3));
	}
	
	public int climbStairs(int n) {
		double a = (1+ Math.sqrt(5))/2;
		double b = (1- Math.sqrt(5))/2;
		return (int)((Math.pow(a, n+1) - Math.pow(b, n+1))/Math.sqrt(5));
	}
}
