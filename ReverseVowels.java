
public class ReverseVowels {
	public static void main(String[] args) {
		String s = "heLLO";
		System.out.println(new ReverseVowels().reverseVowels(s));
	}
	
	public String reverseVowels(String s) {
        int i = 0, j = s.length()-1;
        char cOrig[] = s.toCharArray();
        char cTemp[] = s.toLowerCase().toCharArray();
        while(i < j) {
        	while(i < j && !isVowel(cTemp[i])) i++;
        	while(i < j && !isVowel(cTemp[j])) j--;
        	if(i < j && cOrig[i] != cOrig[j]){
        		char c = cOrig[i];
        		cOrig[i] = cOrig[j];
        		cOrig[j] = c;
        	}
        	i++;
    		j--;
        }
        return String.valueOf(cOrig);
    }
	
	public boolean isVowel(char c){
		return (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u');
	}
}
