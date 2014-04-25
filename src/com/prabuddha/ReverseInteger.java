//http://oj.leetcode.com/problems/reverse-integer/

package com.prabuddha;


public class ReverseInteger {
	public static int reverse(int number) {
		int result=0;
		
		while(number >0){
			int lastDigit = number %10;
			result = result*10 + lastDigit;
			number = number/10; //number after stripping lastDigit off
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(ReverseInteger.reverse(1234560));
	}

}
