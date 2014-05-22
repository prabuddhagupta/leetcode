//http://oj.leetcode.com/problems/sqrtx/

package com.prabuddha;

public class SquareRoot {
	public static int sqrt(int x) {

		int right = x;
		int left = 0;

		int mid = (right + left) / 2;

		while (true) {
			if((mid * mid == x) ||(mid * mid < x && ((mid + 1) * (mid + 1) > x))){
				return mid;
			}
                     
			if(mid *mid>x){
				right = mid;
			}
			else{
				left = mid;
			}
			
			mid = (right + left) / 2;
		}
	}

	public static void main(String[] args) {
		System.out.println(SquareRoot.sqrt(626));
	}

}
