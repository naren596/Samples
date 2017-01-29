import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class QueueReconstHeight {
	public static void main(String[] args) {
		int[][] people = {{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}};
		for(int i = 0; i < people.length; i++) {
			System.out.print("["+ people[i][0] +"," + people[i][1] + "], ");
		}
		System.out.println();
		people = new QueueReconstHeight().reconstructQueue(people);
		for(int i = 0; i < people.length; i++) {
			System.out.print("["+ people[i][0] +"," + people[i][1] + "], ");
		}
	}
	
	public int[][] reconstructQueue(int[][] people) {
		Arrays.sort(people, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0];
			}
		});	
		
		List<int[]> res = new ArrayList<>();
		for(int[] per : people) {
			res.add(per[1], per);
		}
		return res.toArray(people);
    }		
}
