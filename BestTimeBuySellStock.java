
public class BestTimeBuySellStock {
	
	public static void main(String[] args) {
		int[] prices = {7, 6, 3, 2, 1};
		System.out.println(new BestTimeBuySellStock().maxProfit(prices));
	}
	public int maxProfit(int[] prices) {
		if(prices.length <=1 ) return 0;
		int minVal = prices[0], maxProfit = 0;
		for(int i = 1; i < prices.length; i++) {
			if(maxProfit < prices[i] - minVal) maxProfit = prices[i] - minVal;
			if(minVal > prices[i]) minVal = prices[i];
		}
        return maxProfit;
    }
}
