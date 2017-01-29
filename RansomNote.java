
public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] count = new int[26];
		int key;
		
		for(int i = 0; i < magazine.length(); i++) {
			count[magazine.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < ransomNote.length(); i++) {
			key = ransomNote.charAt(i) - 'a';
			count[key]--;
			if(count[key] < 0) return false;
		}
		
		return true;
	}
}
