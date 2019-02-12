package com.algorithms.arrays;

import java.util.Scanner;

public class GradingStudents {
	
		/*
		 * if grade >= 38
		 * 		if diff b/w grade and nearest multiple of 5 is < 3
		 * 			round grade
		 */

	   static int[] gradingStudents(int[] grades) {
	        
		   for(int i  = 0; i < grades.length; i++) {
			   
			   int grade  = grades[i] ;
			   if(grade >= 38) {
				   
				   int rem = grade % 5;
				   
				   if(rem > 2) {
					   grades[i] += (5 - rem) ;
				   }
				   
			   }
		   }
		   return grades;
	    }

	    private static final Scanner scan = new Scanner(System.in);

	    public static void main(String[] args) {

	        int n = Integer.parseInt(scan.nextLine().trim());

	        int[] grades = new int[n];

	        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
	            int gradesItem = Integer.parseInt(scan.nextLine().trim());
	            grades[gradesItr] = gradesItem;
	        }

	        int[] result = gradingStudents(grades);

	        for (int i : result) {
				System.out.print(i +" ");
			}

	    }

}
