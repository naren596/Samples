import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class FourSum2 {
	public static void main(String[] args) {
		int[] A = {-1, -1};
		int[] B = {-1, 1};
		int[] C = {-1, 1};
		int[] D = {1, -1};
		System.out.println(new FourSum2().fourSumCount(A, B, C, D));
	}
	
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum;
		for(int i = 0; i < A.length; i++) {
			for(int j = 0; j < B.length; j++) {
				sum = -(A[i]+B[j]);
				if(!map.containsKey(sum)){
					map.put(sum, 1);
				} else{
					map.put(sum, map.get(sum)+1);
				}
				
			}
		}
		
		int count = 0;
		for(int i = 0; i < C.length; i++) {
			for(int j = 0; j < D.length; j++) {
				sum = C[i]+D[j];
				if(map.containsKey(C[i]+D[j])) count += map.get(sum);
			}
		}
		return count;
    }
}
