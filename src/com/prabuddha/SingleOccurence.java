//http://oj.leetcode.com/problems/single-number/

package com.prabuddha;


public class SingleOccurence {
	public static int singleNumber(int[] arrayInt) {
		int result=0;
		for (int i = 0; i < arrayInt.length; i++) {
			result ^= arrayInt[i];
		}
		return result;
	}

	public static void main(String[] args) {
		int[] arrayInt = new int[] { 1, 2, 3,8,9, 1,5, 2, 3, 4,4,5,8 };
		System.out.println(SingleOccurence.singleNumber(arrayInt));
	}

}
