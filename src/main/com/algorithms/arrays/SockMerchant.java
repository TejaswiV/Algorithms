package com.algorithms.arrays;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {

		Map<Integer, Integer> map = new HashMap<>();
		
		for (int i = 0; i < n; i++) {
			if (map.containsKey(ar[i])) {
				map.put(ar[i], map.get(ar[i])+1);
			}else {
				map.put(ar[i], 1);
			}
		}
		
		int pairs = 0;
		
		for(int socks: map.values()) {
			
			pairs += socks/2 ;
		}
		
		return pairs;

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int[] ar = new int[n];

		String[] arItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			int arItem = Integer.parseInt(arItems[i]);
			ar[i] = arItem;
		}

		int result = sockMerchant(n, ar);

		System.out.println("Number of pairs of socks  "+result);

		scanner.close();
	}
}
