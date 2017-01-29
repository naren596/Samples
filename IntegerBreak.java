

public class IntegerBreak {
	public static void main(String[] args) {
		System.out.println(new IntegerBreak().integerBreak(30));
	}
	
	public int integerBreak(int n) {
		int[] max = new int[59];
        return integerBreakHelper(n, max);
    }
	
	public int integerBreakHelper(int n, int[] max) {
		if(n <= 1) return n;
		if(max[n] != 0) return max[n];
        int maxProd = 0, prod = 0;
        
        for(int i = 1; i <= n; i++) {
        	prod = i * Math.max(n-i, integerBreakHelper(n-i, max));
        	if(maxProd < prod) maxProd = prod;
        }
        max[n] = maxProd;
        return maxProd;
	}
}
