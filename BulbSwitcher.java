
public class BulbSwitcher {
	public static void main(String[] args) {
		System.out.println(new BulbSwitcher().bulbSwitch(1000));
	}
	
	
	public int bulbSwitch(int n) {
        return (int)Math.floor(Math.sqrt(n));
    }
}
