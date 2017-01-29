
public class AddBinary {
	public static void main(String args[]) {
		String a = "1";
		String b = "111";
		System.out.println(new AddBinary().addBinary(a, b));
	}
	
	
	public String addBinary(String a, String b) {
		StringBuilder res = new StringBuilder();
		char aChar, bChar;
		if(a.length() < b.length()) {
			String temp = a;
			a = b;
			b = temp;
		}
		int i = a.length()-1, j = b.length()-1, carry = 0;
		while(i >= 0 && j >=0){
			aChar = a.charAt(i); bChar = b.charAt(j);
			if(aChar == '1' && bChar == '1'){
				if(carry == 1) {
					res.append('1');
				} else {
					carry = 1;
					res.append('0');
				}
			} else if((aChar == '1' && bChar == '0') || (aChar == '0' && bChar == '1')) {
				if(carry == 1) {
					res.append('0');
				} else {
					res.append('1');
					carry = 0;
				}
				
			} else {
				if(carry == 1) {
					carry = 0;
					res.append('1');
				}else {
					res.append('0');
				}
			}
			i--;j--;
		}
		
		while(i >= 0){
			aChar = a.charAt(i);
			if(aChar == '1'){
				if(carry == 1) {
					res.append('0');
				} else {
					res.append('1');
				}
			} else {
				if(carry == 1) {
					carry = 0;
					res.append('1');
				}else {
					res.append('0');
				}
			}
			i--;
		}
		
		if(carry == 1) res.append('1');
        return res.reverse().toString();
    }
}
