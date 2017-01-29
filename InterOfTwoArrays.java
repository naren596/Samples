import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class InterOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		
		int i = 0, j = 0;
		while(i < nums1.length && j < nums2.length) {
			if(nums1[i] < nums2[j]) i++;
			else if(nums1[i] > nums2[j]) j++;
			else {
				if(res.size() > 0 && nums1[i] == res.get(res.size()-1)) {
					i++;
					j++;
				} else res.add(nums1[i]);
			}
		}
		
		int[] resAry = new int[res.size()];
		Iterator<Integer> iterator = res.iterator();
		for(i = 0; i < resAry.length; i++) {
			resAry[i] = iterator.next().intValue();
		}
		
        return resAry;
    }
}
