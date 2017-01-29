import java.util.HashMap;


public class RomanToInteger {
	public static void main(String[] args) {
		String s = "MDCCCLXXXIV";
		System.out.println(new RomanToInteger().romanToInt(s));
	}
	
	public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char c[] = s.toCharArray();
		int num = 0, i = 0, curr = 0, next = 0;
		while(i < c.length-1) {
			curr = map.get(c[i]); next = map.get(c[i+1]);
			if(curr < next) {
				num += next - curr;
				i = i+2;
			} else {
				num += curr;
				i = i+1;
			}
		}
		
		if(i == c.length-1) num += map.get(c[i]); 
        return num;
    }
}
