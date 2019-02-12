package com.algorithms.strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SuperReducedString {
	
	/*
	 * for
	 * 	if 
	 * 		two adjacent letters are equal
	 * 		delete those letter and create anew sub array
	 * 	scan the sub array from the beginning
	 * 
	 */

    static String superReducedString(String s) {
    	
    	for(int i = 1; i < s.length(); i++) {
    		if(s.charAt(i) == s.charAt(i-1)) {
    			s = s.substring(0,i-1)+ s.substring(i+1);
    			i = 0;
    		}
    	}
    	
    	if(s.length() == 0) {
    		return "Empty String";
    	}else {
    		return s;
    	}

    }

    public static void main(String[] args) throws IOException {
    	
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String result = superReducedString(s);        
        System.out.println("The Resulting Reduced String is "+result);
        
        bufferedReader.close();
    }

}
