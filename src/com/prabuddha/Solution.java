http://oj.leetcode.com/problems/single-number/

package com.prabuddha;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	public static int singleNumber(int[] arrayInt) {
		Map<Integer, Integer> storage = new HashMap<Integer, Integer>();

		for (int i = 0; i < arrayInt.length; i++) {
			if (storage.containsKey(arrayInt[i])) {
				storage.remove(arrayInt[i]);
			} else {
				storage.put(arrayInt[i], 1);
			}
		}
		return storage.keySet().iterator().next();

	}

	public static void main(String[] args) {
		int[] arrayInt = new int[] { 1, 2, 3, 1,5, 2, 3, 4,4 };

		System.out.println(Solution.singleNumber(arrayInt));
	}

}
