package com.algorithms.arrays;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {

	static long repeatedString(String s, long n) {
		
		int length = s.length();
		long count = 0;
		
		if(length > n) {
			count = countRepeatitions(s.substring(0, (int) n));
		}else {
			count = countRepeatitions(s) * (n/length);
			System.out.println(n/length);
			if(n % length != 0) {
				count += countRepeatitions(s.substring(0, (int)(n % length)));
			}
		}
		
		return count;
    }

    private static int countRepeatitions(String s) {
    	int count = 0;
    	int pos = 0;
    	while(pos < s.length()) {
    		if(s.charAt(pos) == 'a'){
    			count ++;
    		}
    		pos ++;
    	}
		return count;
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println("'a' repeated "+result+" times");
        scanner.close();
    }

}
