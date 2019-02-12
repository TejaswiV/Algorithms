package com.algorithms.arrays;

import java.util.Scanner;

public class QueueBribes {

	static void minimumBribes(int[] q) {
		
		int length = q.length;
		for(int i = 0; i < length; i++ ) {
		
			if(q[i] == (i+1) || q[i] <= (i+1)+2 || q[i] >= (i+1)-2) {
				
			}else {
				System.out.println("Too Chaotic");
				break;
			}
		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int t = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int tItr = 0; tItr < t; tItr++) {
			int n = scanner.nextInt();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			int[] q = new int[n];

			String[] qItems = scanner.nextLine().split(" ");
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			for (int i = 0; i < n; i++) {
				int qItem = Integer.parseInt(qItems[i]);
				q[i] = qItem;
			}

			minimumBribes(q);
		}

		scanner.close();
	}

}
