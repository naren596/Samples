
public class RotateFunction {
	public int maxRotateFunction(int[] A) {
        int sum = 0, curr = 0, n = A.length, max;
        for(int i = 0; i < n; i++) {
        	sum += A[i];
        	curr += i * A[i];
        }
        
        max = curr;
        
        for(int i = n-1; i > 0; i--) {
        	curr = curr + sum - n * A[i];  
        	if(curr > max) max = curr;
        }
        
        return max;
    }
}
