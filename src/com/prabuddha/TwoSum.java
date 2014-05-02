//http://oj.leetcode.com/problems/two-sum/

package com.prabuddha;

import java.util.HashMap;
import java.util.Map;


public class TwoSum {
	
	private static int[] twoSum(int[] numbers, int target) {
		Map<Integer, Integer> complementMap = new HashMap<Integer, Integer>();
		int []result = new int[2];
		for(int i=0; i<numbers.length; i++){
			if(complementMap.containsKey(numbers[i])){
				result[0] = complementMap.get(numbers[i]) + 1;
				result[1] = i+1;
			}
			else if(target > numbers[i]){
				complementMap.put(target - numbers[i], i);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] array =new int[]{2,3,4,7};
		int [] result = TwoSum.twoSum(array,5);
		System.out.println(result[0] + "," + result[1]);
	}

}
