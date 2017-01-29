import java.util.ArrayList;
import java.util.List;


public class FizzBuzz {
	public List<String> fizzBuzz(int n) {
		List<String> lst = new ArrayList<String>();
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				if(i % 5 == 0) lst.add("FizzBuzz");
				else lst.add("Fizz");
			} else if(i % 5 == 0) lst.add("Buzz");
			else lst.add(String.valueOf(i));
		}
		return lst;
	}
}
