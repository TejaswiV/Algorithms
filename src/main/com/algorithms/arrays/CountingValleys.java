package com.algorithms.arrays;

import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {

	static int countingValleys(int n, String s) {

		int currLevel = 0, seaLevel = 0;
		int pos = 0;
		int valley = 0;

		while (pos < s.length()) {

			if (s.charAt(pos) == 'D') {
				if (currLevel == seaLevel) {
					valley++;
				}
				currLevel--;
			} else {
				currLevel++;
			}
			
			pos ++;
		}

		return valley;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String s = scanner.nextLine();

		int result = countingValleys(n, s);
		System.out.println("Number of valleys are " + result);
		scanner.close();
	}

}
