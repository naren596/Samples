
public class BullsAndCows {
	public static void main(String[] args) {
		String secret = "1122", guess = "1222";
		System.out.println(new BullsAndCows().getHint(secret, guess));
	}
	
	public String getHint(String secret, String guess) {
		int bulls = 0, cows = 0;
		int[] count = new int[10];
		for(int i = 0; i < secret.length(); i++){
			if(secret.charAt(i) == guess.charAt(i)) bulls++;
			else count[Character.getNumericValue(secret.charAt(i))]++;
		}
		
		for(int i = 0; i < secret.length(); i++) {
			if(secret.charAt(i) != guess.charAt(i)) {
				int digit = Character.getNumericValue(guess.charAt(i));
				if(count[digit] > 0) {
					cows++;
					count[digit]--;
				}
			}
		}
		
		return bulls+"A"+cows+"B";
    }
}
