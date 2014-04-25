//http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

package com.prabuddha;


public class MaximumProfit {
	public static int maxProfit(int [] array) {
		int maxProfit=0;
		int buyDayPrice=array[0];
		for(int i=0; i<array.length; i++){
			if(array[i] <buyDayPrice){
				buyDayPrice = array[i];
			}
			int profit =array[i]-buyDayPrice;
			if(maxProfit<profit){
				maxProfit = profit;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		//int[] array = {2,5,3,9,4,6,3,7,4}; //7
		//int[] array = {1,1,1,1}; //0
		int[] array = {2,1,1,1}; //0
		System.out.println(MaximumProfit.maxProfit(array));
	}

}
