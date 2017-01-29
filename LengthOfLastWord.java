
public class LengthOfLastWord {
	public static void main(String[] args) {
		String s = " ";
		System.out.println(new LengthOfLastWord().lengthOfLastWord(s));
	}
	
	public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        return words.length > 0 ? words[words.length-1].length():0;
    }
}
