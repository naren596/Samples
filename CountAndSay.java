
public class CountAndSay {
	public static void main(String[] args) {
		System.out.println(new CountAndSay().countAndSay(10));
	}
	
	
	public String countAndSay(int n) {
		if(n == 1) return "1";
		StringBuilder next = new StringBuilder("1"); int count, i;
		char[] prev;
		while(n > 1) {
			prev = next.toString().toCharArray(); next  = new StringBuilder();
			count = 1;
			for(i = 0; i < prev.length-1; i++) {
				if(prev[i] == prev[i+1]) count++;
				else {
					next = next.append(count).append(prev[i]);
					count = 1;
				}
			}
			next = next.append(count).append(prev[i]);;
			n -= 1;
		}
		return next.toString();
    }
}
