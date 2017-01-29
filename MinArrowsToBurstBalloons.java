import java.util.Arrays;
import java.util.Comparator;


public class MinArrowsToBurstBalloons {
	public static void main(String[] args) {
		int[][] points =  {{1,4},{2,3},{3,4},{7,12}};
		System.out.println(new MinArrowsToBurstBalloons().findMinArrowShots(points));
	}
	
	public int findMinArrowShots(int[][] points) {
		if(points.length < 1) return 0;
		Arrays.sort(points, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});
		
		print(points);
		int min = points[0][0], max = points[0][1];
		int count = 1;
		for(int i = 1; i < points.length; i++) {
			if(points[i][0] > max) {
				count++;
				min = points[i][0];
				max = points[i][1];
			} else {
				min = Math.max(points[i][0], min);
				max = Math.min(points[i][1], max);
			}
		}
        return count;
    }
	
	public void print(int[][] points) {
		for(int i = 0; i < points.length; i++) {
			System.out.print("["+ points[i][0] +","+ points[i][1]+"]");
		}
	}
	
}
