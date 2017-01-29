
public class Interval {
	int start;
    int end;
    
    Interval() { 
    	start = 0; 
    	end = 0; 
    }
    Interval(int s, int e) { 
    	start = s; 
    	end = e; 
    }
    
    public static Interval[] getArray(int[][] ary) {
    	Interval[] intervals = new Interval[ary.length];
    	for(int i = 0; i < ary.length; i++) {
    		intervals[i] = new Interval(ary[i][0], ary[i][1]);
    	}
    	
    	return intervals;
    }
    
    public static void print(Interval[] intervals) {
    	for(int i = 0; i < intervals.length; i++) {
    		System.out.print("["+ intervals[i].start +","+ intervals[i].end+"]");
    	}
    }
}
