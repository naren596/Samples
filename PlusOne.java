
public class PlusOne {
	public static void main(String[] args) {
		int[] digits = {2,2,2,9,9};
		int[] res = new PlusOne().plusOne(digits);
		for(int i:res) System.out.print(i+" ");
	}
	
	public int[] plusOne(int[] digits) {
		if(digits.length == 0) return digits;
		int carry = 1, i = digits.length-1;
		while(i >= 0 && carry == 1) {
			if(digits[i] + carry == 10){
				digits[i] = 0;
				carry = 1;
			} else {
				digits[i] = digits[i]+1;
				carry = 0;
			}
			i--;
		}
		if(carry == 1) {
			int[] res =  new int[digits.length+1];
			for(i = 0; i < digits.length; i++) {
				res[i+1] = digits[i];
			}
			res[0]= 1;
			return res;
		} else {
			return digits;
		}
    }
}
