import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;


public class FindRightInterval {
	public static void main(String[] args) {
		int[][] ary = {{1,4},{2,3},{3,4}};
		Interval[] intervals = Interval.getArray(ary);
		int[] res = new FindRightInterval().findRightInterval(intervals);
		for(int i : res) {
			System.out.print(i + " ");
		}
	}
	
	public int[] findRightInterval(Interval[] intervals) {
		int[] res = new int[intervals.length];
		HashMap<Interval, Integer> map = new HashMap<Interval, Integer>();
		for(int i = 0; i < intervals.length; i++) {
			map.put(intervals[i], i);
			res[i] = -1;
		}
		
		Arrays.sort(intervals, new Comparator<Interval>() {
			@Override
			public int compare(Interval o1, Interval o2) {
				return o1.start - o2.start;
			}
		});
		
		int end, j;
		for(int i = 0; i < intervals.length; i++) {
			end = intervals[i].end;
			j = i+1;
			while(j < intervals.length) {
				if(intervals[j].start >= end) {
					res[map.get(intervals[i])] = map.get(intervals[j]);
					break;
				}
				j++;
			}
		}
		
        return res;
    }
}
