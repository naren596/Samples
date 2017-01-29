
public class ReverseString {
	public String reverseString(String s) {
		int i = 0, j = s.length()-1;
		char[] c= s.toCharArray(); char temp;
		while(i < j) {
			if(c[i] != c[j]) {
				temp = c[i];
				c[i] = c[j];
				c[j] = temp;
			}
			i++;
			j--;
		}
        return String.copyValueOf(c);
    }
}
