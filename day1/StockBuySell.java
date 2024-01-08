package day1;

//You want to maximize your profit by choosing a single day to
//buy one stock and choosing a different day in the future to sell that stock. 
//Return the maximum profit you can achieve
//from this transaction. If you cannot achieve any profit, return 0.

public class StockBuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {7,1,5,3,6,4};
		int max = 0, min = a[0];
		for(int i = 1; i < a.length; i++) {
			max = Math.max(max, a[i] - min);
			if(min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(max);
	}

}
