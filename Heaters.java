import java.util.Arrays;


public class Heaters {
	public static void main(String[] args) {
		int[] houses = {282475249,622650073,984943658,144108930,470211272,101027544,457850878,458777923};
		int[] heaters = {823564440,115438165,784484492,74243042,114807987,137522503,441282327,16531729,823378840,143542612};
		System.out.println(new Heaters().findRadius(houses, heaters));
	}
	
	public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(houses);
		Arrays.sort(heaters);
		int i = 0;
		int j = 0;
		
		int max = 0, dist = 0;
		while(i < houses.length && j < heaters.length) {
			if(houses[i] < heaters[j]) {
				dist = heaters[j] - houses[i];
				if(j > 0 && houses[i] > heaters[j-1]) dist = Math.min(dist, houses[i] - heaters[j-1]);
				if(max < dist) max = dist;
				i++;
			} else if(houses[i] > heaters[j]) {
				j++;
			} else {
				i++;
				j++;
			}
		}
		
		if(i < houses.length) {
			dist = houses[houses.length-1] - heaters[j-1];
			if(max < dist) max = dist;
		}
	
		
		return max;
    }
}
