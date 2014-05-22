//https://oj.leetcode.com/problems/implement-strstr/

package com.prabuddha;

public class StrStr {
	public static String strStr(String haystack, String needle) {

		if (needle.isEmpty() || haystack.isEmpty()
				|| (needle.length() > haystack.length())) {
			return null;
		}
		for (int i = 0; i < haystack.length(); i++) {
			int j = 0;
			int start = -1;

			while (haystack.charAt(i++) == needle.charAt(j++)) {
				if (j == 1) {
					start = i;
				}
				if (j == needle.length()) {
					return haystack.substring(start - 1);
				}
			}
		}
		return null;
	}

	public static void main(String[] args) {
		System.out.println(StrStr.strStr("cdabcdefghcde", "cde"));
		System.out.println(StrStr.strStr("cde", "cde"));
	}
}
