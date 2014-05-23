//https://oj.leetcode.com/problems/string-to-integer-atoi/

package com.prabuddha;

public class Atoi {
	public static int atoi(String number) {
		if (number == null || number.isEmpty()) {
			return 0;
		}
		boolean isNegative = false;
		if (number.charAt(0) == '-') {
			number = number.substring(1);
			isNegative = true;
		}
		double d = 0d;
		int length = number.length();
		for (int i = 0; i < length; i++) {
			d += ((number.charAt(i) - '0') * Math.pow(10.0, length - i - 1));
		}
		if (d >= Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		} else if (d <= Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}

		if (isNegative) {
			d = -d;
		}
		return (int) d;
	}

	public static void main(String[] args) {
		System.out.println(Atoi.atoi("-1234567892"));
		System.out.println(Atoi.atoi(""));
	}
}
