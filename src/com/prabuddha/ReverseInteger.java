//http://oj.leetcode.com/problems/reverse-integer/

package com.prabuddha;


public class ReverseInteger {
	public static int reverse(int number) {
		int result=0;
		String numStr = ""+number;
		for(int i=0; i<numStr.length();i++){
			int digit = Character.getNumericValue(numStr.charAt(i));
			result = (int) (result+ (digit *  Math.pow(10.0, i)));
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(ReverseInteger.reverse(123456789));
	}

}
