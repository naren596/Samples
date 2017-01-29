import java.util.HashMap;


public class IsomorphicStrings {
	public boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> sMap = new HashMap<Character, Character>();
		HashMap<Character, Character> tMap = new HashMap<Character, Character>();
		for(int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i), tChar = t.charAt(i);
			if(sMap.containsKey(sChar)) {
				if(sMap.get(sChar) != tChar) return false;
			}else {
				sMap.put(sChar, tChar);
			}
			
			if(tMap.containsKey(tChar)) {
				if(sMap.get(tChar) != sChar) return false;
			}else {
				sMap.put(tChar, sChar);
			}
		}
        return true;
    }
	
	// Much faster. Not as expensive as hashmap
	public boolean isIsomorphicUsingArray(String s, String t) {
		int[] sCount = new int[256];
		int[] tCount = new int[256];
		for(int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i), tChar = t.charAt(i);
			if(sCount[sChar] != 0) {
				if(sCount[sChar] != tChar) return false;
			}else sCount[sChar] = tChar;
			
			if(tCount[tChar] != 0) {
				if(tCount[tChar] != sChar) return false;
			}else tCount[tChar] = sChar;
			
		}
		return true;
	}
}	
