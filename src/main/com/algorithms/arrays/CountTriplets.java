package com.algorithms.arrays;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class CountTriplets {

	static long countTriplets(List<Long> arr, long r) {
		
		int count = 0;
		Map<Integer, Long> map = new HashMap<Integer, Long>();
		
		for(long num : arr) {
			
			if(map.isEmpty()) {
				
			}
		}
		
		return count;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		String[] nr = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

		long r = Long.parseLong(nr[1]);

		List<Long> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" ")).map(Long::parseLong)
				.collect(toList());

		long ans = countTriplets(arr, r);

		System.out.println("Number of Triplets  " + ans);
		
		bufferedReader.close();
	}

}
