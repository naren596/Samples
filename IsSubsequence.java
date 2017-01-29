
public class IsSubsequence {
	public static void main(String[] args) {
		System.out.println(new IsSubsequence().isSubsequence("axc", ""));
	}
	
	public boolean isSubsequence(String s, String t) {
		if(s.length() > t.length()) return false;
		int i = 0, j = 0;
		while(i < s.length()) {
			if(s.charAt(i) == t.charAt(j)) i++;
			j++;
			if(j == t.length() && i < s.length()) return false;
		}
        return true;
    }
}
