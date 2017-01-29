
public class ArithmeticSlices {
	public static void main(String[] args) {
		int[] A  = {3, -1, -5,-9};
		System.out.println(new ArithmeticSlices().numberOfArithmeticSlices(A));
	}
	
	
	public int numberOfArithmeticSlices(int[] A) {
		if(A.length < 3) return 0;
		int lastDiff = A[1]-A[0], lastInd = 0,count = 0, n;
		
		for(int i = 2; i < A.length; i++) {
			if(A[i] - A[i-1] == lastDiff && i != A.length-1) continue;
			n = -1;
			if(A[i] - A[i-1] != lastDiff) {
				n = i - lastInd - 2;
			} else if(i == A.length - 1) {
				n = i - lastInd - 1;
			}
			if(n >= 0) {
				count += n * (n+1)/2;
			}
			lastInd = i-1;
			lastDiff = A[i] - A[i-1];
			
		}
        return count;
    }
}
