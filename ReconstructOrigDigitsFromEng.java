

public class ReconstructOrigDigitsFromEng {
	public static void main(String[] args) {
		System.out.println(new ReconstructOrigDigitsFromEng().originalDigits("zeroonetwothreefourfivesixseveneightnine"));
	}
	
	public String originalDigits(String s) {
		int[] count = new int[26];
		for(char c : s.toCharArray()) {
			count[c - 'a']++;
		}
		
		int[] countDigits = new int[10];
		countDigits[0] = count['z'-'a'];
		countDigits[2] = count['w'-'a'];
		countDigits[4] = count['u'-'a'];
		countDigits[6] = count['x'-'a'];
		countDigits[8] = count['g'-'a'];
		
		countDigits[1] = count['o'-'a']-countDigits[0]-countDigits[2]-countDigits[4];
		countDigits[3] = count['h'-'a'] - countDigits[8];
		countDigits[5] = count['f'-'a'] - countDigits[4];
		countDigits[7] = count['s'-'a'] - countDigits[6];
		countDigits[9] = count['i'-'a'] - countDigits[5] - countDigits[6] - countDigits[8];
		StringBuilder res = new StringBuilder();
		for(int i = 0; i < 10; i++) {
			int j = countDigits[i];
			while(j > 0) {
				res.append(i);
				j--;
			}
		}
		return res.toString();
    }
}
