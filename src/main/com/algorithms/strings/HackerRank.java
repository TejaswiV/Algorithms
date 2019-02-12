package com.algorithms.strings;

import java.util.Scanner;

public class HackerRank {
	
	/*
	 * 	check if each character in "hackerrank" string present in the input string
	 * 	exit loop if variable exceeds hackerrank length or input string length
	 * 	If we have reache dend of hackerrank string means all characters of hackerrank present in the given string in the same order
	 */

	static String hackerrankInString(String s) {
		
		String hacker = "hackerrank";		
		int hs = 0;
		
		for(int i = 0; i < s.length() && hs < hacker.length(); i++) {
			if(s.charAt(i) == hacker.charAt(hs)) {
				hs ++;
				continue;
			}
		}
		
		if(hs < hacker.length()) {
			return "NO";
		}else {				
			return "YES";
		}
		
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s = scanner.nextLine();

			String result = hackerrankInString(s);
			System.out.println(s + " contains 'hakcerrank' in it? " + result);

		}

		scanner.close();
	}

}
