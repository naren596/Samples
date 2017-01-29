

public class IntegerToRoman {
	public static void main(String[] args) {
		int num = 3999;
		System.out.println(new IntegerToRoman().intToRoman(num));
	}
	
	
	public String intToRoman(int num) {
		int[] nums = {1,5,10,50,100,500,1000};
		char[] roms = {'I', 'V', 'X', 'L', 'C','D','M'};
		StringBuilder res = new StringBuilder();
		
		int i = 6, rem1, rem2;
		while(num > 0) {
			rem1 = num/nums[i];
			if(i%2 == 1 && i-1 >= 0){
				rem2 = num/nums[i-1];
				if(rem2 == 9) {
					res.append(roms[i-1]);
					res.append(roms[i+1]);
					num = num % nums[i-1];
					i -= 2;
					continue;
				}
			} 
			
			if(rem1 == 4) {
				res.append(roms[i]);
				res.append(roms[i+1]);
				num = num % nums[i];
			} else {
				while(rem1 > 0) {
					res.append(roms[i]);
					rem1--;
				}
				num = num % nums[i];
			}
				
			i--;
		}
        return res.toString();
    }
}
