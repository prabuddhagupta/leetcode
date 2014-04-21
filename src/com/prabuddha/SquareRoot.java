//http://oj.leetcode.com/problems/sqrtx/

package com.prabuddha;

public class SquareRoot {
	public static int sqrt(int x) {
	    if(x<=0) return 0;
        if (x==1) return 1;
      
        int right=x;
        int left=0;
        while((right-left)>1){
            int mid= (left+(right-left)/2);
            if((mid*mid)>x)
                right=mid;
            else
                left=mid;
        }
        return (int)left;
	}
	public static void main(String[] args) {
		System.out.println(SquareRoot.sqrt(-25));
	}
}
