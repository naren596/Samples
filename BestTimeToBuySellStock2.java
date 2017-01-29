
public class BestTimeToBuySellStock2 {
	public static void main(String[] args) {
		int[] prices = {};
		System.out.println(new BestTimeToBuySellStock2().maxProfit(prices));
	}
	
	public int maxProfit(int[] prices) {
		int i = 0, minSoFar, maxSoFar, maxProfit = 0;
		while(i < prices.length) {
			while(i+1 < prices.length && prices[i] > prices[i+1]) i++;
			minSoFar = prices[i++];
			
			while(i < prices.length && prices[i] > prices[i-1]) i++; 
			maxSoFar = prices[i-1];
			
			maxProfit += maxSoFar - minSoFar;
		}
		return maxProfit;
	}
}
