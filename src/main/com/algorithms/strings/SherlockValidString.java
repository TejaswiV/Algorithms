package com.algorithms.strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class SherlockValidString {

	static String isValid(String s) {

		Map<Character, Integer> frequesciesMap = new HashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (frequesciesMap.containsKey(c)) {
				frequesciesMap.put(c, frequesciesMap.get(c) + 1);
			} else {
				frequesciesMap.put(c, 1);
			}
		}

		// check if the map has more than 2 frequencies
		Set<Integer> categories = new HashSet<Integer>();
		for (Integer i : frequesciesMap.values()) {
			categories.add(i);
		}

		// If the set has more than 2 frequencies then return "NO"
		// If it has only one frequency return "YES"

		if (categories.size() > 2) {
			return "NO";
		} else if (categories.size() == 1) {
			return "YES";
		} else {
			int f1 = 0, f2 = 0;

			for (Integer i : categories) {
				if (f1 == 0) {
					f1 = i;
				} else {
					f2 = i;
				}
			}

			int f1Count = 0, f2Count = 0;

			for (int c : frequesciesMap.values()) {
				if (c == f1) {
					f1Count++;
				} else if (c == f2) {
					f2Count++;
				}
			}

			if (Math.abs(f1 - f2) == 1 && (f1Count == 1 || f2Count == 1)) {
				return "YES";
			} else if ((f1 == 1 && f1Count == 1) || (f2 == 1 && f2Count == 1)) {
				return "YES";
			} else {
				return "NO";
			}

		}

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		String s = scanner.nextLine();

		String result = isValid(s);
		System.out.println("The is a valid string " + result);

		scanner.close();
	}
}
