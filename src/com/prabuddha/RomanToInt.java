//http://oj.leetcode.com/problems/sqrtx/

package com.prabuddha;

import java.util.HashMap;

public class RomanToInt {
	public static int romanToInt(String roman) {
        HashMap<Character, Integer> romanToIntMap = new HashMap<Character, Integer>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);
        
        int len = roman.length();
        int result = romanToIntMap.get(roman.charAt(len-1));
        for(int i=len-1; i>=1; i--){
			if (romanToIntMap.get(roman.charAt(i - 1)) >= romanToIntMap.get(roman.charAt(i)))
				result += romanToIntMap.get(roman.charAt(i - 1));
			else
				result -= romanToIntMap.get(roman.charAt(i - 1));
        }
        return result;
	}

	public static void main(String[] args) {
		System.out.println(RomanToInt.romanToInt("XIV"));
	}

}
