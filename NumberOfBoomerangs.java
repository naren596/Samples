import java.util.HashMap;


public class NumberOfBoomerangs {
	public int numberOfBoomerangs(int[][] points) {
		HashMap<Double, Integer> map = new HashMap<Double, Integer>();
		double key;
		int sum = 0;
		for(int i = 0; i < points.length; i++) {
			map.clear();
			for(int j = 0; j < points.length; j++) {
				if(i != j) {
					key = calculateDistance(points[i], points[j]);
					if(map.containsKey(key)) {
						map.put(key, map.get(key)+1);
					} else {
						map.put(key, 1);
					}
				}
			}
			
			for(int val : map.values()) {
				sum += val * (val-1);
			}
		}
		return sum;
	}
	
	public double calculateDistance(int[] point1, int[] point2) {
		return Math.sqrt(Math.pow(point2[0]-point1[0], 2) + Math.pow(point2[1]-point1[1], 2));
	}
}	
