package algorithms;

public class MinValue {

	public static void main(String[] args) {
		int [] prices = {10,15,103,15,165,291,91,56,82,98};
		System.out.println(searchMinimum(prices));
	}
	
	private static int searchMinimum(int [] prices) {
		int mininiumValue = prices[0];
		for (int i = 1; i < prices.length; i++) {
			if (prices[i] < mininiumValue) {
				mininiumValue = prices[i];
			}
		}
		
		return mininiumValue;
	}
}
