package com.algorithms.strings;

import java.util.Scanner;

public class CamelCase {
	
	/*
	 * count the array returned by string split function with regular expression  '[A-Z]'
	 * 
	 */

	static int camelcase(String s) {
	
		return s.split("[A-Z]").length;
		
		
		/*
		  int count = 1;
		  for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count ++;
			}
			return count;
		} */
		
	

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String s = scanner.nextLine();

		int result = camelcase(s);

		System.out.println("No of words in the given string " + result);

		scanner.close();
	}

}
