package com.HackerRank;

public class RepeatedString {

	public static void main(String[] args) {
		/*
		 * long result = Result.repeatedString("kmretasscityylpdhuw" +
		 * "jirnqimlkcgxubxmsxpypgzxtenweirknjtasxtvxemtwxua" +
		 * "rabssvqdnktqadhyktagjxoanknhgilnm", 736778906400l);
		 */
		long result = Result.repeatedString("abca", 15);
		System.out.println(result);
	}
}

class Result {
	public static long repeatedString(String s, long n) {
		
		long count = 0;
		long noOfStrings = n / s.length();
		System.out.println(noOfStrings);
		char[] chars = s.toCharArray();
		for(char c : chars) {
			if(c == 'a') {
				count++;
			}
		}
		count = noOfStrings * count;
		int offset = (int) (n % s.length());
		System.out.println(offset);
		if(offset > 0) {
			String remStr = s.substring(0, offset);
			System.out.println(remStr);
			chars = remStr.toCharArray();
			for(char c : chars) {
				if(c == 'a') {
					count++;
				}
			}
		}
		return count;
	}
	
}
