
public class ExcelSheetColNum {
	public int titleToNumber(String s) {
		int num = (s.charAt(0) - 'A')+1;
		for(int i = 1; i < s.length(); i++) {
			num = num * 26 + ((s.charAt(i) - 'A')+1);
		}
        return num;
    }
}
