//http://oj.leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

package com.prabuddha;


public class MaximumProfitTwo {
	public static int maxProfit(int [] prices) {
		 if(prices == null || prices.length < 2)
		        return 0;

		    int maxProfit = 0;

		    for(int i = 1; i < prices.length; i++){
		    	//keep adding the rising prices
		        if(prices[i] > prices[i - 1])
		            maxProfit += prices[i] - prices[i - 1];
		    }
		    return maxProfit;
	}

	public static void main(String[] args) {
		//int[] array = {2,5,3,9,4,6,3,7,4}; //15
		//int[] array = {2,5,3,2,9,4,6,3,7,8,9}; //18
		//int[] array = {1,1,1,1}; //0
		//int[] array = {2,1,1,1}; //0
		int[] array = {2,4,4,8,8,10}; //8
		System.out.println(MaximumProfitTwo.maxProfit(array));
	}

}
