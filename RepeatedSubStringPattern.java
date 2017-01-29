
public class RepeatedSubStringPattern {
	public static void main(String[] args) {
		String str = "abaababaab";
		System.out.println(new RepeatedSubStringPattern().repeatedSubstringPattern(str));
	}
	
	public boolean repeatedSubstringPattern(String str) {
		boolean preCheck = false;
		int l = str.length();
		String subStr; 
		for(int i = 1; i <= l/2; i++) {
			if(l % i  == 0) {
				subStr = str.substring(0, i);
				int j = 0;
				for(j = i; j < l; j = j+i) {
					if(!str.substring(j, j+i).equals(subStr)) break;
				}
				if(j == l){
					preCheck = true;
					break; 
				}
			}
		}
		
		return preCheck;
    }
}
