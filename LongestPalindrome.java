
public class LongestPalindrome {
	public static void main(String[] args) {
//		String s = "civilwartestingwhetherthatnaptionoranynartionsoconceivedand"
//				+ "sodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehave"
//				+ "cometodedicpateaportionofthatfieldasafinalrestingplace"
//				+ "forthosewhoheregavetheirlivesthatthatnationmightliveItisal"
//				+ "togetherfangandproperthatweshoulddothisButinalargersensewecannotdedicate"
//				+ "wecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwho"
//				+ "struggledherehaveconsecrateditfaraboveourpoorponwertoaddordetract"
//				+ "Tgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcannever"
//				+ "forgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofough"
//				+ "therehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthat"
//				+ "fromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotion"
//				+ "thatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirtho"
//				+ "ffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth";
		String s = "ccc";
		System.out.println(new LongestPalindrome().longestPalindrome(s));
	}
	
	public int longestPalindrome(String s) {
		int[] count = new int[256];
		int maxLength = 0; boolean single = false;
		for(char c:s.toCharArray()) {
			count[c]++;
		}
		
		for(int i = 0; i < count.length; i++) {
			if(count[i] % 2 == 0) {
				maxLength += count[i];
			} else {
				maxLength += count[i]-1;
				single = true; 
			}
		}
		return maxLength + (single?1:0);
	}
}
