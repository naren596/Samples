import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BinaryWatch {
	boolean[] visited = new boolean[10];
	int hours = 0, minutes = 0;
	
	public static void main(String[] args) {
		new BinaryWatch().readBinaryWatch(2);
	}
	
	public List<String> readBinaryWatch(int num) {
		List<String> list = new ArrayList<String>();
        readBinaryWatchHelper(num, list, 0);
        Collections.sort(list, new BinaryWatch().new CustomComparotor());
        for(String str:list) {
        	System.out.print(str+" ");
        }
        return list;
    }
	
	private class CustomComparotor implements Comparator<String> {
		@Override
		public int compare(String o1, String o2) {
			String[] strParts1 = o1.split(":");
			String[] strParts2 = o2.split(":");
			if(strParts1[0].compareTo(strParts2[0]) != 0){
				return Integer.parseInt(strParts1[0]) - Integer.parseInt(strParts2[0]);
			}else{
				return Integer.parseInt(strParts1[1]) - Integer.parseInt(strParts2[1]);
			}
		}
	}
	
	public void readBinaryWatchHelper(int num, List<String> list, int begin) {
		if(num == 0) {
			if(hours >= 12 || minutes >= 60) return;
			if(minutes <= 9) {
				list.add(hours+":0"+ minutes);
			}else{
				list.add(hours+":"+ minutes);
			}
			return;
		}
		
		for(int i = begin; i < 10; i++) {
			if(!visited[i]) {
				visited[i] = true;
				
				if(i < 6){
					minutes = minutes+ (int)Math.pow(2, i);
				}else{
					hours = hours + (int)Math.pow(2, i-6);
				}
				
				readBinaryWatchHelper(num-1, list, i+1);
				
				if(i < 6){
					minutes = minutes - (int)Math.pow(2, i);
				}else{
					hours = hours - (int)Math.pow(2, i-6);
				}
				visited[i] = false;
			}
		}
	}
}
